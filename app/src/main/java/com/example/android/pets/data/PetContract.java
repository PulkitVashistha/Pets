package com.example.android.pets.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by pulkit on 4/10/2018.
 */

public final class PetContract {

    private PetContract() {
    }

    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PETS = "pets";


    public static final class PetEntry implements BaseColumns {

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static final String TABLE_NAME = "pets";
        public final static String _ID = BaseColumns._ID;
        public static final String COLOUMN_ID = "_id";
        public static final String COLOUMN_NAME = "name";
        public static final String COLOUMN_BREED = "breed";
        public static final String COLOUMN_GENDER = "gender";
        public static final String COLOUMN_WEIGHT = "weight";
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        //

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;

        public static boolean isValidGender(int gender) {
            if(gender == PetContract.PetEntry.GENDER_UNKNOWN || gender == PetContract.PetEntry.GENDER_MALE || gender == PetContract.PetEntry.GENDER_FEMALE) {
                return true;
            }
            return false;
        }

    }

}
