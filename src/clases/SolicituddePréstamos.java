/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Luis Angel Díaz
 */
public class SolicituddePréstamos {
    private String Nombre_actividad;
    private String Descripción_actividad;
    private String Fecha;
    private String Hora_inicio;
    private String Hora_fin;

    public SolicituddePréstamos(String Nombre_actividad, String Descripción_actividad, String Fecha, String Hora_inicio, String Hora_fin) {
        this.Nombre_actividad = Nombre_actividad;
        this.Descripción_actividad = Descripción_actividad;
        this.Fecha = Fecha;
        this.Hora_inicio = Hora_inicio;
        this.Hora_fin = Hora_fin;
    }

    public String getNombre_actividad() {
        return Nombre_actividad;
    }

    public void setNombre_actividad(String Nombre_actividad) {
        this.Nombre_actividad = Nombre_actividad;
    }

    public String getDescripción_actividad() {
        return Descripción_actividad;
    }

    public void setDescripción_actividad(String Descripción_actividad) {
        this.Descripción_actividad = Descripción_actividad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora_inicio() {
        return Hora_inicio;
    }

    public void setHora_inicio(String Hora_inicio) {
        this.Hora_inicio = Hora_inicio;
    }

    public String getHora_fin() {
        return Hora_fin;
    }

    public void setHora_fin(String Hora_fin) {
        this.Hora_fin = Hora_fin;
    }

}
