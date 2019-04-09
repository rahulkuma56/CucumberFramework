/**
 * @author rahul.rathore
 *	
 *	20-Jul-2016
 */
package com.cucumber.framework.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author rahul.rathore
 *	
 *	20-Jul-2016
 *
 */
public class ResourceHelper {

	public static String getResourcePath(String resource) {
		String path = getBaseResourcePath() + resource;
		System.out.println("Resource Helper path:"+path);
		return path;
	}
	
	public static String getBaseResourcePath() {
		return ResourceHelper.class.getClass().getResource("/").getPath();
		
	}
	
	public static InputStream getResourcePathInputStream(String resource) throws FileNotFoundException {
		return new FileInputStream(ResourceHelper.getResourcePath(resource));
	}
	
}
