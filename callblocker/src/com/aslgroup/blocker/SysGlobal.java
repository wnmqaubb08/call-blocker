package com.aslgroup.blocker;

import java.util.HashMap;
import java.util.Map;

/*
 * System gloab list is maintained here.
 */
public class SysGlobal {
	/*
	 * Global context.
	 */
	public static final String CONTEXT = "CONTEXT";
	/*
	 * Global database version
	 */
	public static final String DATABASE_VERSION = "DATABASE_VERSION";
	/*
	 * Global database name
	 */
	public static String DBNAME="DATABASE";
	
	/*
	 * List of system global
	 */
	private static Map<String, Object> globals = new HashMap<String, Object>();
	
	
	/*
	 * Get a global parameter 
	 */
	public static Object get(String name){return globals.get(name);}
	/*
	 * set to global list
	 */
	public static boolean set(String name,Object value){
		try{
			globals.put(name, value); 
			return true;
			}
		catch(Exception e){}
		
		return false;
		
	}

}
