package reto4;


import Vista.VistaRequerimientos;

import java.sql.SQLException;

import Vista.Requerimiento1;
import Vista.Requerimiento2;
import Vista.Requerimiento3;
/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class Principal {
    public static void main(String[] args) throws SQLException {

        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();

        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();

        //Requerimiento1 reque1= new Requerimiento1();
        //Requerimiento2 reque2= new Requerimiento2();
        Requerimiento3 reque3= new Requerimiento3();

    }
}
