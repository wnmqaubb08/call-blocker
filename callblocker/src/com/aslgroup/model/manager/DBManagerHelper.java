package com.aslgroup.model.manager;

import com.aslgroup.blocker.SysGlobal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*
 * Database creation is done in this class.
 */
public class DBManagerHelper extends SQLiteOpenHelper{

	/*
	 * Sqlite database initialised by the SQLiteOpenHelper
	 */
	private SQLiteDatabase database ;
	/*
	 * Global context. init form SysGlobal
	 */
	private Context ctx;
	/*
	 * Global database name. Init from Sysglobal.
	 */
	private String databaseName;
	/*
	 * Global database Version. Init from SysGlobal.
	 */
	private int databaseVersion ;
	
	/* 
	 * Constructor
	 */
	
	DBManagerHelper (Context context) {
		super( (Context) SysGlobal.get(SysGlobal.CONTEXT), 
			   (String) SysGlobal.get(SysGlobal.DBNAME), 
			   null,
			   (Integer) SysGlobal.get(SysGlobal.DATABASE_VERSION));
		
        
    }
	
	/*
	 * Get database instance
	 * @return SQLiteDatabase entity.
	 */
	
	public SQLiteDatabase getDatabase(){return database;}

	/*
	 * (non-Javadoc)
	 * @see android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase)
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		database = db;
		
	}
	/*
	 * (non-Javadoc)
	 * @see android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite.SQLiteDatabase, int, int)
	 */
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
