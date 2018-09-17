/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Brian Vanegas
 */
public class Ph {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File File = new File();
        char opc;
        String desc = null;
        String tInmueble = null;
        double mCuad = 0;
        double vrCuad = 0;
        Inmueble inmueble;
        ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
        Cuenta cuenta;
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        
        do
        {
            opc = Menu();
            switch(opc) {
                case '1':
                    for (Inmueble j: File.getInmuebles()) {
                        System.out.println("Inmueble: "+j.getDescripcion()+", es de tipo "+j.getTipo_inmueble()+", el valor de administración es "+j.getValorAdministracion());
                    }
                    break;
                case '2':
                    desc = JOptionPane.showInputDialog("Digita la descripcion del inmueble: ");
                    tInmueble = JOptionPane.showInputDialog("Digita el tipo de inmueble: ");
                    String strMCuad = JOptionPane.showInputDialog("Digita los metros cuadrados: ");
                    String vrMCuad = JOptionPane.showInputDialog("Digita los metros cuadrados: ");
                    mCuad = Double.parseDouble(strMCuad);
                    vrCuad = Double.parseDouble(vrMCuad);
                    File.setInmuebles("1", desc, tInmueble, mCuad, vrCuad);
                    JOptionPane.showMessageDialog(null, "Inmueble registrado con éxito");
                    break;
                case '3':
                    for (Cuenta j: cuentas) {
                        System.out.println("Index: "+cuentas.indexOf(j)+", Cuenta: "+j.getCodigo()+", a nombre de "+j.getNombres()+", de tipo "+j.getTipoCuenta()+" tiene cobros por "+j.getCobros());
                    }
                    
                    int reply = JOptionPane.showConfirmDialog(null, "Deseas ingresar un cobro a una cuenta?", "Asignar Cobro", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        String index = JOptionPane.showInputDialog("Digita el index de la cuenta: ");
                        int ind =Integer.parseInt(index);
                        String tipoCobro = JOptionPane.showInputDialog("Digita el tipo de cobro (multa/otros cobros): ");
                        String valorCobro = JOptionPane.showInputDialog("Digita el valor del cobro: ");
                        int vrCobro = Integer.parseInt(valorCobro);
                        cuentas.get(ind).addCobro(vrCobro, tipoCobro);
                        JOptionPane.showMessageDialog(null, "Cobro registrado con éxito!");
                    }
                    /*else {
                       JOptionPane.showMessageDialog(null, "GOODBYE");
                       System.exit(0);
                    }*/
                    break;
                case '4':
                    String strCodigo = JOptionPane.showInputDialog("Digita el codigo de la cuenta: ");
                    String tipoCuenta = JOptionPane.showInputDialog("Digita el tipo de cuenta: ");
                    String nombreCuenta = JOptionPane.showInputDialog("Digita el nombre de la cuenta: ");
                    cuenta = new Cuenta(strCodigo, nombreCuenta, tipoCuenta);
                    cuentas.add(cuenta);
                    JOptionPane.showMessageDialog(null, "Cuenta registrada con éxito");
                    break;
            }
        }while(opc != '5');
        
    }
    
    static char Menu()
    {
        char opcion;       
        do
        {
            opcion = JOptionPane.showInputDialog("*** SI Propiedad Horizontal ***"+
                    "\n1. Ver Propiedades\n2. Ingresar Propiedad\n3. Ver cuentas\n4. Crear una cuenta \n5. Salir").charAt(0);
        }
        while(opcion < '1' || opcion > '5');
        return opcion;
    }
    
}
