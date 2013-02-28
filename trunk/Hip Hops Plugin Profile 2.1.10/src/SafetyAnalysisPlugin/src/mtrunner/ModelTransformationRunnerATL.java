package mtrunner;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.m2m.atl.common.ATLLaunchConstants;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.m2m.atl.core.service.LauncherService;


public class ModelTransformationRunnerATL {

	/**
	 * @param inModelID: ID of the input model, needs to be consistent with the ID in the ATL Transformation
	 * @param inModelPath: filename of the input model, use URI format
	 * @param inMetamodelID: ID of the input metamodel, needs to be consistent with the ID in the ATL Transformation
	 * @param inMetamodelPath: filename of the input metamodel, use URI format, it is assumed that this model is conform to EMF
	 * @param outModelID: ID of the output model, needs to be consistent with the ID in the ATL Transformation
	 * @param outModelPath: filename of the output model, use URI format
	 * @param outMetamodelID: ID of the output model, needs to be consistent with the ID in the ATL Transformation
	 * @param outMetamodelPath: filename of the output metamodel, use URI format, it is assumed that this model is conform to EMF
	 * @param urlFormat: filename of the ASM file (which is the translated ATL file) use URI format
	 */
	@SuppressWarnings("unchecked")
	public void run(String inModelID,String inModelPath, String inMetamodelID, String inMetamodelPath,
			String outModelID, String outModelPath, String outMetamodelID, String outMetamodelPath, String urlFormat) {
		

		Map<String, String> paths = new HashMap<String, String>();
		Map<String, String> inModels = new HashMap<String, String>();
		Map<String, String> outModels = new HashMap<String, String>();
		Map<String, String> inoutModels = new HashMap<String, String>();
		Map<String, Object> options = new HashMap<String, Object>();
		Map<String, InputStream> libraries = new HashMap<String, InputStream>();

		paths.put(inMetamodelID, inMetamodelPath);
		paths.put(outMetamodelID, outMetamodelPath);
		paths.put(inModelID, inModelPath);
		paths.put(outModelID, outModelPath);

		inModels.put(inModelID, inMetamodelID);
		outModels.put(outModelID, outMetamodelID);

		Map<String, String> modelHandlers = new HashMap<String, String>();
		modelHandlers.put(inMetamodelID, "EMF");
		modelHandlers.put(outMetamodelID, "EMF");
		options.put(ATLLaunchConstants.OPTION_MODEL_HANDLER, modelHandlers);

		try {
			InputStream[] modules = new InputStream[1];
			modules[0] = new URL(urlFormat).openStream();

			LauncherService.launch("launch", null, CoreService
					.getLauncher("Regular VM (with debugger)"), inModels,
					inoutModels, outModels, paths, options, libraries, modules);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}