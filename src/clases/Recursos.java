/*
 * Proyecto de Programación 1. 
 */
package clases;

/**
 *
 * @author Luis Angel Díaz
 */
public class Recursos {
    private String Código_del_recurso;
    private String Nombre_del_recurso;
    private String Requiere_Aprobación;
    private String Requiere_confirmación_entrega_recepción;
    private int Tiempo_máximo_uso;
    private int costo;

    public Recursos(String Código_del_recurso, String Nombre_del_recurso, String Requiere_Aprobación, String Requiere_confirmación_entrega_recepción, int Tiempo_máximo_uso, int costo) {
        this.Código_del_recurso = Código_del_recurso;
        this.Nombre_del_recurso = Nombre_del_recurso;
        this.Requiere_Aprobación = Requiere_Aprobación;
        this.Requiere_confirmación_entrega_recepción = Requiere_confirmación_entrega_recepción;
        this.Tiempo_máximo_uso = Tiempo_máximo_uso;
        this.costo = costo;
    }

    public String getCódigo_del_recurso() {
        return Código_del_recurso;
    }

    public void setCódigo_del_recurso(String Código_del_recurso) {
        this.Código_del_recurso = Código_del_recurso;
    }

    public String getNombre_del_recurso() {
        return Nombre_del_recurso;
    }

    public void setNombre_del_recurso(String Nombre_del_recurso) {
        this.Nombre_del_recurso = Nombre_del_recurso;
    }

    public String getRequiere_Aprobación() {
        return Requiere_Aprobación;
    }

    public void setRequiere_Aprobación(String Requiere_Aprobación) {
        this.Requiere_Aprobación = Requiere_Aprobación;
    }

    public String getRequiere_confirmación_entrega_recepción() {
        return Requiere_confirmación_entrega_recepción;
    }

    public void setRequiere_confirmación_entrega_recepción(String Requiere_confirmación_entrega_recepción) {
        this.Requiere_confirmación_entrega_recepción = Requiere_confirmación_entrega_recepción;
    }

    public int getTiempo_máximo_uso() {
        return Tiempo_máximo_uso;
    }

    public void setTiempo_máximo_uso(int Tiempo_máximo_uso) {
        this.Tiempo_máximo_uso = Tiempo_máximo_uso;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

}
