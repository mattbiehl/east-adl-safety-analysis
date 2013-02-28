package hiphopsplugin;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;


public class StartSafetyAnalysisHandler extends AbstractHandler {

	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}
		
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
			
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveMenuSelection(event);
		IFile filen = (IFile) selection.getFirstElement();
		IPath filePath = filen.getLocation();
		
		URI URIpath = URI.createURI(filePath.toString());
		//TODO make it work without the "file:/" string. 
		//I tried createFileURI but then every space where replaced with %20.
		String papyrusModelPath = "file:/" + URIpath.toString();
	
		new SafetyAnalysisExecutor().run(papyrusModelPath);		
		return null;
	}
	
	
	
}
	