package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pulkit on 4/10/2018.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();

    public static final String DB_NAME = "Shelter";

    public static final int DB_VERSION= 1;

    public PetDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Create a String that contains the SQL statement to create the pets table
                String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + PetContract.TABLE_NAME + " ("
                +PetContract.COLOUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                +PetContract.COLOUMN_NAME + " TEXT NOT NULL, "
                +PetContract.COLOUMN_BREED+ " TEXT, "
                +PetContract.COLOUMN_GENDER + " INTEGER NOT NULL, "
                +PetContract.COLOUMN_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

                db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // The database is still at version 1, so there's nothing to do be done here.
    }
}
