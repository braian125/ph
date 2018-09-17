/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Brian Vanegas
 */
public class File {
    BufferedReader in;
    String read;
    int linenum2 = 0;
    String temp;
    Inmueble inmueble;
    private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
    
    public File(){
        try {
            //open a bufferedReader to file helloworld.txt
            in = new BufferedReader(new FileReader("ph.txt"));
            String strContent = in.toString();
            System.out.println(strContent);
            while ((temp = in.readLine()) != null) {
                read = in.readLine();
                String[] column = read.split("#");
                double mCuad = Double.parseDouble(column[3]);
                double vrCuad = Double.parseDouble(column[4]);
                inmueble = new Inmueble(column[0], column[1], column[2], mCuad, vrCuad);
                inmuebles.add(inmueble);
                linenum2++;
            }
            
            in.close();
            
        
            
        } catch(IOException e){
            System.out.println("Hay un problema:" + e);
        }
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(String pId, String pDesc, String pTipo, double pMCuad, double pVrCuad) {
        inmueble = new Inmueble(pId, pDesc, pTipo, pMCuad, pVrCuad);
        inmuebles.add(inmueble);
    }
    
    
}
