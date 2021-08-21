package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;


//import Modelo.dao.*;
import Modelo.vo.Requerimiento_1;
import Controlador.ElControladorDeRequerimientos;

public class Requerimiento1 extends JFrame {

    public Requerimiento1 () throws SQLException {
        initUI();
    }
    private void initUI () throws SQLException{
        setLayout(new BorderLayout());
        String []nombres={"ID_Proyecto","Ciudad", "Banco vinculado","Construcctora"};
        JTable table=new JTable(mostrar(),nombres);
        JScrollPane panel=new JScrollPane(table);
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_1>lista=new ArrayList<Requerimiento_1>();
        ElControladorDeRequerimientos controlador=new ElControladorDeRequerimientos();
        lista=controlador.consultarRequerimiento1();
        String matris[][]=new String [lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0]=String.valueOf(lista.get(i).getID_proyecto());
            matris[i][1]=lista.get(i).getCiudad();
            matris[i][2]=lista.get(i).getBanco_Vinculado();
            matris[i][3]=lista.get(i).getConstructora();
        }
        return matris;
    }
    
}
