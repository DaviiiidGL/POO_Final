package Punto2;

public abstract class Persona {
    protected String id;
    protected String nombre;

    public Persona(String id, String nombre) throws NombreMaloException {
        this.id = id;
        this.nombre = validarNombreBase(nombre);
    }

    public String getId() {return id;}
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    protected String validarNombreBase(String nombre) throws NombreMaloException {
        return nombre;
    }
}