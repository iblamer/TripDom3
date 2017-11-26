package edu.itla.tripdom.dao;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by fabio on 11/26/2017.
 */

public class DbConnection extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "tripdom.db";
    public static String LOG_T = "DbConnection";

    public DbConnection(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(LOG_T,"Iniciando OnCreate...");
        db.execSQL(SqlHelperSchema.USUARIO_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
