package Punto2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Administrador> admins = new ArrayList<>();
    String id;
    String nombre;
    
    boolean salir = false;

    Administrador a1 = new Administrador("a1", "Manuel");
    admins.add(a1);
    Administrador a2 = new Administrador("a2", "Hernesto");
    admins.add(a2);

        Cliente c1 = new Cliente("c1", "Nicolas", BigDecimal.valueOf(5000));
        clientes.add(c1);
        Cliente c2 = new Cliente("c2", "Juan", BigDecimal.valueOf(12000));
    clientes.add(c2);

    while(!salir) {
        // MENÚ
        IO.println("-------------MENU------------");
        IO.println("1. Inserta Cliente");
        IO.println("2. Mira Clientes");
        IO.println("3. Inserta Admin");
        IO.println("4. Mira Admins");
        IO.println("5. Salir");
        IO.println("6. Cliente con monto mas grande");
        IO.println("7. Promedio de Compra");

        int opcion = Integer.parseInt(IO.readln());

        switch (opcion){
            case 1:
                try {IO.println("Id:");
                id = IO.readln();
                IO.println("Nombre:");
                nombre = IO.readln();
                IO.println("Monto de Compra:");
                BigDecimal montoCompra = BigDecimal.valueOf(Long.parseLong(IO.readln()));
                Cliente n = new Cliente(id, nombre, montoCompra);
                IO.println("Cliente creado");

                clientes.add(n);} catch(NombreMaloException e){
                    IO.println(e.getMessage());
                }
                break;
                
            case 2:
                for(int i=0; i< clientes.size();i++){
                    IO.println(clientes.get(i));
                }
                break;
                
            case 3:
                try {
                    IO.println("Id:");
                id = IO.readln();
                IO.println("Nombre:");
                nombre = IO.readln();
                Administrador a = new Administrador(id, nombre);
                admins.add(a);
                IO.println("Admin agregado");}
                catch (NombreMaloException e){
                    IO.println(e.getMessage());
                }

                break;
                
            case 4:
                for(int i=0; i< admins.size(); i++){
                    IO.println(admins.get(i));
                }
                break;
                
            case 5:
                salir = true;
                break;

            case 6:
            Cliente clienteMaximo = clientes.get(0);
            for (int i = 1; i < clientes.size(); i++) {
                if (clientes.get(i).getMontoCompra().compareTo(clienteMaximo.getMontoCompra()) > 0) {
                    clienteMaximo = clientes.get(i);
                }
            }
            IO.println("Cliente con mayor monto de compra: " + clienteMaximo);
            break;

            case 7:
                BigDecimal suma = BigDecimal.ZERO;

                for (int i = 0; i < clientes.size(); i++) {
                    suma = suma.add(clientes.get(i).getMontoCompra());
                }

                BigDecimal promedio = suma.divide(BigDecimal.valueOf(clientes.size()), 2, RoundingMode.HALF_UP);

                IO.println("El promedio de compras es: " + promedio);
                break;
                
            default:
                IO.println("Opción no válida");
                break;
        }
    }
}
}