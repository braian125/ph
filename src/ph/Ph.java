/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Brian Vanegas
 */
public class Ph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("ph.txt");
        String strContent;
        char opc;
        
        //Create BufferedReader object
        BufferedReader bReader = new BufferedReader(new InputStreamReader(is));
        StringBuffer sbfFileContents = new StringBuffer();
        String line = null;
        
        //read file line by line
        while( (line = bReader.readLine()) != null){
                sbfFileContents.append(line);
        }
        
        //finally convert StringBuffer object to String!
	strContent = sbfFileContents.toString();
        
        String[] rows = strContent.split("#");
        
        System.out.println(rows.length);
        for (int i = 0; i < rows.length; i++) {
            //for (int j=0; j<3; j++){
                System.out.println(rows[i]);
            //}
        }

        //opc = Menu();
        //JOptionPane.showMessageDialog(null, "Elegiste: " + opc);
        //System.out.println("elegiste "+opc);
        /*do
        {
            opc = Menu();
            switch(opc) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            }
        }while(opc != '4');*/
    }
    
    static char Menu()
    {
        char opcion;       
        do
        {
            opcion = JOptionPane.showInputDialog("*** SI Propiedad Horizontal ***"+
                    "\n1. Ver Propiedades\n2. Ingresar Propiedad\n3. Calcular Mensualidad\n4. Salir").charAt(0);
        }
        while(opcion < '1' || opcion > '4');
        return opcion;
    }
    
}
