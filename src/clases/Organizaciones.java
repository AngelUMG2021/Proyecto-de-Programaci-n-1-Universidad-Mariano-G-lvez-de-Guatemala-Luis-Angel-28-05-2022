/*
 * Proyecto de Programación 1. 
 */
package clases;

/**
 *
 * @author Luis Angel Díaz
 */
public class Organizaciones {
    
    private String Código_Organización;
    private String Nombre_Organización;
    private String Dirección;
    private String Número_Teléfono;
    private String Correo_Electrónico;

    public Organizaciones(String Código_Organización, String Nombre_Organización, String Dirección, String Número_Teléfono, String Correo_Electrónico) {
        this.Código_Organización = Código_Organización;
        this.Nombre_Organización = Nombre_Organización;
        this.Dirección = Dirección;
        this.Número_Teléfono = Número_Teléfono;
        this.Correo_Electrónico = Correo_Electrónico;
    }

    public String getCódigo_Organización() {
        return Código_Organización;
    }

    public void setCódigo_Organización(String Código_Organización) {
        this.Código_Organización = Código_Organización;
    }

    public String getNombre_Organización() {
        return Nombre_Organización;
    }

    public void setNombre_Organización(String Nombre_Organización) {
        this.Nombre_Organización = Nombre_Organización;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getNúmero_Teléfono() {
        return Número_Teléfono;
    }

    public void setNúmero_Teléfono(String Número_Teléfono) {
        this.Número_Teléfono = Número_Teléfono;
    }

    public String getCorreo_Electrónico() {
        return Correo_Electrónico;
    }

    public void setCorreo_Electrónico(String Correo_Electrónico) {
        this.Correo_Electrónico = Correo_Electrónico;
    }
}
