package com.unah.usermanager.utils;

import com.unah.usermanager.utils.interfaces.DBAdapter;

import java.sql.Connection;

public class PostgreSQLAdapter implements DBAdapter {
    @Override
    public Connection getConnection(){
        Connection connection = null;
        return connection;
    }
}
