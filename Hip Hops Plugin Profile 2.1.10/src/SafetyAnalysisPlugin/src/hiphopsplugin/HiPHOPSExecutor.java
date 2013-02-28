package hiphopsplugin;

import java.io.Closeable;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

public class HiPHOPSExecutor {

	// TODO: this filename has to be set dynamically to something appropriate,
	// e.g. some temp directory
	private String batchFileName = "runme.bat";
	private static String batchName = "runme.bat";
	//private static final String hipHopsProgramPathDefault = "C:/Program Files/University of Hull/HiPHOPS/HiP-HOPS_FailureEditor/hipOp.exe";
	
	public String convertPath(String path){
		char[] changer = path.toCharArray();
		for (int i = 0; i < changer.length; i++) {
			if (changer[i] == '/'){
				changer[i] = '\\';
			}
		}
		return String.valueOf(changer);
	}
	
	/**
	 * calls hiphops by creating a batch file and then running that batch file
	 * 
	 * @param tempdir working directory 
	 * @param filenameHH filename of HipHops executable
	 * @param filenameModel filename of the input file
	 */
	public HiPHOPSExecutor(String tempdir, String filePathHH, String filenameModel) {
		try {
			
			String hiphopDirectroy = convertPath(filePathHH);
		
			batchFileName = tempdir + batchName;
			File outfile = new File(batchFileName);
			String out1 = "\""+filePathHH + "\" " + filenameModel + " outputtype=XML decomposeSILs";
			FileWriter write_out = new FileWriter(outfile);
			write_out.write(out1 + "\r\n");
			write_out.close();
		} catch (IOException e1) {
			System.out.println("Error opening error model file");
			display("Cannot find the HiP-HOPS tool <<" + filePathHH + "hipOp.exe>>! Please check it.", null);
		}

		try {
			String[] cmd = new String[4];
			cmd[0] = "cmd.exe";
			cmd[1] = "/C";
			cmd[2] = "start";
			cmd[3] = batchFileName;
			
			Process process = Runtime.getRuntime().exec(cmd);
			
		} catch (IOException e) {
			System.out.print("IOException error");
		} catch (SecurityException e) {
			System.out.print("SecutityException error");
		}
	}

	public static void display(String message, Exception e) {
		MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Hazard Analysis Info Message", message);
	}

	public static void main(String[] args) {
	}

}