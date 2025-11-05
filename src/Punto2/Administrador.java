package Punto2;

public class Administrador extends Persona{
    public Administrador(String id, String nombre) {
        super(id, nombre);
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    protected String validarNombreBase(String nombre) throws NombreMaloException {
        if (nombre.equalsIgnoreCase("Daniela") || nombre.equalsIgnoreCase("Valeria") || nombre.equalsIgnoreCase("Valentina") || nombre.equalsIgnoreCase("Isaac")) {
            throw new NombreMaloException(nombre + " no puede administrar en esta tienda");
        }
        return nombre;
    }
}
