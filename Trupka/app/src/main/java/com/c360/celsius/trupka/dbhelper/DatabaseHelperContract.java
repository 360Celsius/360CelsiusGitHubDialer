package com.c360.celsius.trupka.dbhelper;

/**
 * Created by dennisshar on 24/03/2018.
 */

public class DatabaseHelperContract {
    public static final String packageName = "com.a360.celsius.trupka";
    public static final String AUTHORITY = packageName + ".provider";
    public static final String CONTENT_BASE = "content://"+AUTHORITY+"/%s";

    private DatabaseHelperContract() {}


}
