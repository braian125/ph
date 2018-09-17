/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph;

/**
 *
 * @author Brian Vanegas
 */
public class Cobros {
    private double valor;
    private String tipoCobro;

    public Cobros(double valor, String tipoCobro) {
        this.valor = valor;
        this.tipoCobro = tipoCobro;
    }

    public String getTipoCobro() {
        return tipoCobro;
    }

    public void setTipoCobro(String tipoCobro) {
        this.tipoCobro = tipoCobro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
