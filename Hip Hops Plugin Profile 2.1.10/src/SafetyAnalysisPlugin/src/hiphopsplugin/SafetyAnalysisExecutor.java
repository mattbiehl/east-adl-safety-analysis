package hiphopsplugin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import mtrunner.ModelTransformationRunnerATL;
import mtrunner.Trafo;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;


public class SafetyAnalysisExecutor {
	private Shell shell;
	private static final String hipHopsProgramPathDefault = "C:\\Program Files\\University of Hull\\HiPHOPS\\HiP-HOPS_FailureEditor\\hipOp.exe";
	private static String hiphopsFilename = "ErrorModel.xml";
	private static final String hiphopsEcoreFilename = "fromeastadl.hiphops";
	private static final String safetyanalysisTempFolder = "safetyanalysis";
	private static String HHPathName = "pathToHiphopFolder.config";

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	private String getTemp() {
		String tempDir = System.getProperty("java.io.tmpdir") + safetyanalysisTempFolder;
		new File(tempDir).mkdir();
		return (tempDir + System.getProperty("file.separator"));
	}

	private String generateHiphopsModelPath() {
		return URI.createFileURI(getTemp() + hiphopsEcoreFilename).toString();
	}

	private String generateHiphopsFilePath() {
		return getTemp() + hiphopsFilename;
	}

	/*
	 * Tries to locate HipHops Program file
	 * 
	 * different fallback levels: 1: configfile exists 1.1: content of
	 * configfile is a valid path 1.2: content of configfile not a valid path 2:
	 * no configfile: use default location
	 */
	private String getHiphopsProgramPath() {
		Properties properties = new Properties();
		String homeDir = System.getProperty("user.home") + System.getProperty("file.separator") + HHPathName;
		try {
			FileInputStream file = new FileInputStream(homeDir);
			properties.load(file);
			file.close();
		} catch (Exception e1) {
			// 2
			return hipHopsProgramPathDefault;
		}
		// 1
		String hipHopsProgramPath = properties.getProperty("HHpath");
		File f = new File(hipHopsProgramPath);
		if (f.exists()) {
			// 1.1
			return hipHopsProgramPath;
		} else {
			// 1.2
			return hipHopsProgramPathDefault;
		}
	}

	private boolean isHiphopsFound() {
		String p = getHiphopsProgramPath();
		File f = new File(p);
		return f.exists();
	}
	
	public void log(String msg){
		Activator.plugin.getLog().log(new Status(Status.INFO, Activator.plugin.PLUGIN_ID, Status.OK, msg, null));
		MessageDialog.openWarning(shell, "Warning", msg);
	}

	public void run(String papyrusModelPath) {
		String hiphopsModelPath = generateHiphopsModelPath();
		String hiphopsFilePath = generateHiphopsFilePath();
		String hiphopsMetamodelFilepath = "http://www.md.kth.se/hiphops"; //JarResourceAccessor.getAbsolutePathInJar("oaw/hiphops.ecore");
		String eastadlMetamodel = "http://www.papyrusuml.org/EAST-ADL2/1";
		String inModelID = "EADL";
		String inMetamodelID = "east";
		String outModelID = "HH";
		String outMetamodelID = "hiphops";
		String atlTrafoPath = JarResourceAccessor.getAbsolutePathInJar("atl/east2hiphops.asm");

		new ModelTransformationRunnerATL().run(inModelID, papyrusModelPath, inMetamodelID, eastadlMetamodel, outModelID, hiphopsModelPath, outMetamodelID, hiphopsMetamodelFilepath, atlTrafoPath);
		new Trafo().transform(hiphopsModelPath,hiphopsFilePath);
		//new ModelTransformationRunnerOAW().run(hiphopsModelPath, hiphopsMetamodelFilepath, hiphopsFilePath, oawTrafoPath, shell);
		if (isHiphopsFound()) {
			new HiPHOPSExecutor(getTemp(), getHiphopsProgramPath(), hiphopsFilePath);
		} else {
			MessageDialog.openWarning(shell, "Warning", "HiP-HOPS program file not found. Please install it in:\r\n C:\\Program Files\\University of Hull\\HiPHOPS");
		}
	}

}
