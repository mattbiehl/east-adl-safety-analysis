package hiphopsplugin;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

public class JarResourceAccessor {

	/**
	 * 
	 * @param relativePath relative filepath of a file packaged in the same JAR file as this class is located
	 * @return the absolute filesystem path of a file packaged in the JAR file, whose relative path within the JAR is relativePath
	 */
	public static String getAbsolutePathInJar(String relativePath){
		URL installURL = Platform.getBundle("SafetyAnalysisPlugin").getEntry(relativePath);
		URL url = null;
		try{
			url = FileLocator.toFileURL(installURL);
		}catch (Exception e){
			e.printStackTrace();
		}	
		if (url == null) return ""; else return url.toString();
	}
	

}
