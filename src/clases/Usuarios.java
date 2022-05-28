/*
 * Proyecto de Programación 1. 
 */
package clases;

/**
 *
 * @author Luis Angel Díaz
 */
public class Usuarios {
    
    private String Código_de_usuario;
    private String Tipo_de_usuario;
    private String Nombre_de_usuario;
    private String Contraseña;
    private String Nombre;
    private String Correo_electrónico;
    private int Teléfono;
    private String Dirección;

    public Usuarios(String Código_de_usuario, String Tipo_de_usuario, String Nombre_de_usuario, String Contraseña, String Nombre, String Correo_electrónico, int Teléfono, String Dirección) {
        this.Código_de_usuario = Código_de_usuario;
        this.Tipo_de_usuario = Tipo_de_usuario;
        this.Nombre_de_usuario = Nombre_de_usuario;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.Correo_electrónico = Correo_electrónico;
        this.Teléfono = Teléfono;
        this.Dirección = Dirección;
    }

    public String getCódigo_de_usuario() {
        return Código_de_usuario;
    }

    public void setCódigo_de_usuario(String Código_de_usuario) {
        this.Código_de_usuario = Código_de_usuario;
    }

    public String getTipo_de_usuario() {
        return Tipo_de_usuario;
    }

    public void setTipo_de_usuario(String Tipo_de_usuario) {
        this.Tipo_de_usuario = Tipo_de_usuario;
    }

    public String getNombre_de_usuario() {
        return Nombre_de_usuario;
    }

    public void setNombre_de_usuario(String Nombre_de_usuario) {
        this.Nombre_de_usuario = Nombre_de_usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo_electrónico() {
        return Correo_electrónico;
    }

    public void setCorreo_electrónico(String Correo_electrónico) {
        this.Correo_electrónico = Correo_electrónico;
    }

    public int getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(int Teléfono) {
        this.Teléfono = Teléfono;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }
}
