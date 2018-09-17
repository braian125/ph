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
    private String id;
    private String descripcion;
    private String tipo_inmueble;
    private double metroCuadrado;
    private double vrMetroCuadrado;

    public Inmueble(String id, String descripcion, String tipo_inmueble, double metroCuadrado, double vrMetroCuadrado) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipo_inmueble = tipo_inmueble;
        this.metroCuadrado = metroCuadrado;
        this.vrMetroCuadrado = vrMetroCuadrado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_inmueble() {
        return tipo_inmueble;
    }

    public void setTipo_inmueble(String tipo_inmueble) {
        this.tipo_inmueble = tipo_inmueble;
    }

    public double getMetroCuadrado() {
        return metroCuadrado;
    }

    public void setMetroCuadrado(double metroCuadrado) {
        this.metroCuadrado = metroCuadrado;
    }

    public double getVrMetroCuadrado() {
        return vrMetroCuadrado;
    }

    public void setVrMetroCuadrado(double vrMetroCuadrado) {
        this.vrMetroCuadrado = vrMetroCuadrado;
    }
    
    public double getValorAdministracion() {
        return this.metroCuadrado * vrMetroCuadrado;
    }
}
