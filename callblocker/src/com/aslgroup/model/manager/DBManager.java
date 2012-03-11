package com.aslgroup.model.manager;

import java.util.HashMap;

import android.database.sqlite.SQLiteDatabase;

/*
 * Database connection and connection close is handled DBManager.
 * DBManager class is a parent class and all other managers are child of this class
 */
public abstract class DBManager {
	/*
	 * Static manager.
	 */
	private static DBManager manager ;
	
	/*
	 * Sqlite database object that provides SQLite function.
	 */
	protected  SQLiteDatabase database;
	
	
	
	/*
	 * DBManagerr is a singleton class.
	 * 
	 */
	protected DBManager(){
		DBManagerHelper helper = new DBManagerHelper(null);
		database = helper.getDatabase();
	}
	
	/*
	 * Get dbManager instance from other class.
	 * 
	 * 
	 */
	
	public DBManager getManager(){return null;}
	
	/*
	 * Intialisation of the manager
	 */
	
	public  boolean initManager(){return false;};
	
	/*
	 * Clean manager if necessary
	 */
	
	public  boolean cleanManger(){return false;};

}

