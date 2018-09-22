package com.example.android.inventoryappstage2.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class StockContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private StockContract() {
    }

    public static final String CONTENT_AUTHORITY = "com.example.android.inventoryappstage1";


    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);


    public static final String PATH_ITEM = "items";


    public static final class ItemEntry implements BaseColumns {


        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_ITEM);


        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_ITEM;


        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_ITEM;


        public static final String TABLE_NAME = "items";


        public static final String _ID = BaseColumns._ID;



        public static final String COLUMN_ITEM_CATEGORY = "category";


        public static final String COLUMN_ITEM_NAME = "name";


        public static final String COLUMN_ITEM_PRICE = "price";


        public static final String COLUMN_ITEM_QUANTITY = "quantity";


        public static final String COLUMN_ITEM_SUPPLIER_NAME = "supplierName";


        public static final String COLUMN_ITEM_SUPPLIER_PHONE_NUMBER = "supplierPhoneNumber";


        public static final int ITEM_UNKNOWN = 0;
        public static final int ITEM_CAMERA = 1;
        public static final int ITEM_PHONE = 2;
        public static final int ITEM_HEADPHONES = 3;
        public static final int ITEM_COMPUTERS = 4;



        public static boolean isValidCategory(int item) {
            if (item == ITEM_UNKNOWN || item == ITEM_CAMERA || item == ITEM_PHONE ||
                    item == ITEM_HEADPHONES || item == ITEM_COMPUTERS) {
                return true;
            }
            return false;
        }

    }
}