package Modelo.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import Util.JDBCUtilities;

import Modelo.vo.Requerimiento_3;

public class Requerimiento_3Dao {
    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_3> requerimiento3()  throws SQLException {

        ArrayList<Requerimiento_3> respuesta= new ArrayList<Requerimiento_3>();
        Connection conexion=JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT Proveedor, Pagado, Constructora  "+
                              "FROM Compra  "+
                              "INNER JOIN Proyecto  "+
                              "ON Compra.ID_proyecto = Proyecto.ID_proyecto  "+
                              "WHERE Pagado ='No' AND Proveedor ='JUMBO'";
            PreparedStatement statement=conexion.prepareStatement(consulta);
            ResultSet resultSet= statement.executeQuery();

            while (resultSet.next()) {
                Requerimiento_3 requerimiento_3=new Requerimiento_3();
                requerimiento_3.setProveedor(resultSet.getString("Proveedor"));
                requerimiento_3.setPagado(resultSet.getString("Pagado"));
                requerimiento_3.setConstructora(resultSet.getString("Constructora"));
                
                respuesta.add(requerimiento_3);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.err.println("Error consultando: "+ e);
        }finally{
            if(conexion !=null){
                conexion.close();
            }
        }
        return respuesta;
        
    }
}
