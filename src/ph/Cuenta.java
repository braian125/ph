/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph;

import java.util.ArrayList;

/**
 *
 * @author Brian Vanegas
 */
public class Cuenta {
    private String codigo;
    private String nombres;
    private String tipoCuenta;
    private ArrayList<Cobros> cobros = new ArrayList<Cobros>();

    public Cuenta(String codigo, String nombres, String tipoCuenta) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.tipoCuenta = tipoCuenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public void addCobro(double pValor, String pTipoCobro) {
        Cobros cobro = new Cobros(pValor, pTipoCobro);
        cobros.add(cobro);
    }
    
    public double getCobros() {
        double vlrCobros = 0;
        for (Cobros j: cobros) {
            vlrCobros +=j.getValor();
        }
        return vlrCobros;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
}
