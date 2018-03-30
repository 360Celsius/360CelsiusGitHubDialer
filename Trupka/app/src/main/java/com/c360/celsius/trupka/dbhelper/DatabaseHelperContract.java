package com.c360.celsius.trupka.dbhelper;

import android.net.Uri;
import android.provider.BaseColumns;

import java.util.Locale;

/**
 * Created by dennisshar on 24/03/2018.
 */

public class DatabaseHelperContract {
    public static final String packageName = "com.a360.celsius.trupka";
    public static final String AUTHORITY = packageName + ".provider";
    public static final String CONTENT_BASE = "content://"+AUTHORITY+"/%s";

    private DatabaseHelperContract() {}

    //=============================== Contacts Table ========================================
    public static class ContactsTable implements BaseColumns {

        public static final String URI_SUFFIX = "contacts_data";
        public static final Uri CONTENT_URI = Uri.parse(String.format(Locale.US,CONTENT_BASE, URI_SUFFIX));

        public static final String TABLE_NAME = "contacts_data";
        public static final String COLUMN_NAME_FIRST_NAME = "first_name";
        public static final String COLUMN_NAME_LAST_NAME = "last_name";
        public static final String COLUMN_NAME_FIRST_NAME_LAST_NAME = "first_name_last_name";
        public static final String COLUMN_NAME_PHONE_NUMBER = "phone_number";

    }

    public static final String SQL_CREATE_CONTACTS_DATA_TABLE =
            "CREATE TABLE " + ContactsTable.TABLE_NAME + " (" +
                    ContactsTable._ID + " INTEGER PRIMARY KEY," +
                    ContactsTable.COLUMN_NAME_FIRST_NAME + " TEXT," +
                    ContactsTable.COLUMN_NAME_LAST_NAME + " TEXT," +
                    ContactsTable.COLUMN_NAME_FIRST_NAME_LAST_NAME + " TEXT," +
                    ContactsTable.COLUMN_NAME_PHONE_NUMBER + " TEXT)";

    public static final String SQL_DELETE_CONTACTS_DATA_TABLE =
            "DROP TABLE IF EXISTS " + ContactsTable.TABLE_NAME;

    public static final String SQL_SELECT_CONTACTS_DATA_TABLE =
            "SELECT  * FROM " + ContactsTable.TABLE_NAME + " WHERE "+ ContactsTable._ID;


    //=============================== Call History Table ========================================
    public static class CallHistoryTable implements BaseColumns {

        public static final String URI_SUFFIX = "call_history_data";
        public static final Uri CONTENT_URI = Uri.parse(String.format(Locale.US,CONTENT_BASE, URI_SUFFIX));

        public static final String TABLE_NAME = "call_history_data";
        public static final String COLUMN_NAME_PHONE_NUMBER = "phone_number";
        public static final String COLUMN_NAME_CALL_TYPE = "call_type";
        public static final String COLUMN_NAME_CALL_DATE = "call_date";
        public static final String COLUMN_NAME_CALL_DURATION = "call_duration";
    }

    public static final String SQL_CREATE_CALL_HISTORY_DATA_TABLE =
            "CREATE TABLE " + CallHistoryTable.TABLE_NAME + " (" +
                    CallHistoryTable._ID + " INTEGER PRIMARY KEY," +
                    CallHistoryTable.COLUMN_NAME_PHONE_NUMBER + " TEXT," +
                    CallHistoryTable.COLUMN_NAME_CALL_TYPE + " TEXT," +
                    CallHistoryTable.COLUMN_NAME_CALL_DATE + " TEXT," +
                    CallHistoryTable.COLUMN_NAME_CALL_DURATION + " TEXT)";

    public static final String SQL_DELETE_CALL_HISTORY_DATA_TABLE =
            "DROP TABLE IF EXISTS " + CallHistoryTable.TABLE_NAME;

    public static final String SQL_SELECT_CALL_HISTORY_DATA_TABLE =
            "SELECT  * FROM " + CallHistoryTable.TABLE_NAME + " WHERE "+ CallHistoryTable._ID;

    //=============================== Favorites Table ========================================
    public static class FavoritesTable implements BaseColumns {

        public static final String URI_SUFFIX = "favorites_data";
        public static final Uri CONTENT_URI = Uri.parse(String.format(Locale.US,CONTENT_BASE, URI_SUFFIX));

        public static final String TABLE_NAME = "favorites_data";
        public static final String COLUMN_NAME_FIRST_NAME = "first_name";
        public static final String COLUMN_NAME_LAST_NAME = "last_name";
        public static final String COLUMN_NAME_FIRST_NAME_LAST_NAME = "first_name_last_name";
        public static final String COLUMN_NAME_PHONE_NUMBER = "phone_number";

    }

    public static final String SQL_CREATE_FAVORITES_DATA_TABLE =
            "CREATE TABLE " + FavoritesTable.TABLE_NAME + " (" +
                    FavoritesTable._ID + " INTEGER PRIMARY KEY," +
                    FavoritesTable.COLUMN_NAME_FIRST_NAME + " TEXT," +
                    FavoritesTable.COLUMN_NAME_LAST_NAME + " TEXT," +
                    FavoritesTable.COLUMN_NAME_FIRST_NAME_LAST_NAME + " TEXT," +
                    FavoritesTable.COLUMN_NAME_PHONE_NUMBER + " TEXT)";

    public static final String SQL_DELETE_FAVORITES_DATA_TABLE =
            "DROP TABLE IF EXISTS " + FavoritesTable.TABLE_NAME;

    public static final String SQL_SELECT_FAVORITES_DATA_TABLE =
            "SELECT  * FROM " + FavoritesTable.TABLE_NAME + " WHERE "+ FavoritesTable._ID;



}
