package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by pulkit on 4/10/2018.
 */

public class PetContract {


    public PetContract() {
    }

    public static final class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        public final static String _ID = BaseColumns._ID;
        public static final String COLOUMN_ID = "_id";
        public static final String COLOUMN_NAME = "name";
        public static final String COLOUMN_BREED = "breed";
        public static final String COLOUMN_GENDER = "gender";
        public static final String COLOUMN_WEIGHT = "weight";

        //

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;
    }

}
