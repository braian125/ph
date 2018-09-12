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
public class Inmueble {
    private int id;
    private String tipo_inmueble;
    private double metroCuadrado;

    public Inmueble(int id, String tipo_inmueble, double metroCuadrado) {
        this.id = id;
        this.tipo_inmueble = tipo_inmueble;
        this.metroCuadrado = metroCuadrado;
    }

    public double getMetroCuadrado() {
        return metroCuadrado;
    }

    public void setMetroCuadrado(double metroCuadrado) {
        this.metroCuadrado = metroCuadrado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_inmueble() {
        return tipo_inmueble;
    }

    public void setTipo_inmueble(String tipo_inmueble) {
        this.tipo_inmueble = tipo_inmueble;
    }
    
    
}
