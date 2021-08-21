package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    
    //e:\\ARCHIVOS\\Desktop\\ProyectosConstruccion.db
    
    private static final String DATABASE_LOCATION = "e:\\ARCHIVOS\\Desktop\\ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        
            String url = "jdbc:sqlite:"+DATABASE_LOCATION;
            return DriverManager.getConnection(url);
        
    }
}
