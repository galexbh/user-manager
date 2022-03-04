package com.unah.usermanager.utils;

import com.unah.usermanager.utils.interfaces.DBAdapter;

public class DBFactory {

    public static DBAdapter getDBAdapter(DBType dbType) {
        return switch (dbType) {
            case MySQL -> new MySQLAdapter();
            case MSSQL -> new MSSQLAdapter();
            case PostgreSQL -> new PostgreSQLAdapter();
        };
    }
}
