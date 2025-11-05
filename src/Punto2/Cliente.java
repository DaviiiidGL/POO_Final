package Punto2;

import java.math.BigDecimal;

public class Cliente extends Persona {
    private BigDecimal montoCompra;

    public Cliente(String id, String nombre, BigDecimal montoCompra) throws NombreMaloException {
        super(id, nombre);
        this.montoCompra = montoCompra;
    }

    @Override
    protected String validarNombreBase(String nombre) throws NombreMaloException {
        if (nombre.equalsIgnoreCase("Brayan") || nombre.equalsIgnoreCase("Bryan")) {
            throw new NombreMaloException(nombre + " no puede comprar en esta tienda");
        }
        return nombre;
    }

    public BigDecimal getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(BigDecimal montoCompra) {
        this.montoCompra = montoCompra;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "montoCompra=" + montoCompra +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}