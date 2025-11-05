package Punto3;

public class Desbordamiento {
    public static void main(String[] args) {
    int entradas = Integer.parseInt(IO.readln());

    for(int i=0; i<entradas; i++){
        String numb = IO.readln();
        String[] part = numb.split(" ");
        String op = part[1];
        long num1 = Long.parseLong(part[0]);
        long num2 = Long.parseLong(part[2]);

        IO.println(numb);

        if(num1 > Integer.MAX_VALUE){
            IO.println("First number too big");
        }

        if(num2 > Integer.MAX_VALUE){
            IO.println("Second number too big");
        }
        if(op.equals("+")) {
            long suma = num1 + num2;
            if(suma > Integer.MAX_VALUE){
                IO.println("Result too big");
            }

        }

        if(op.equals("*")){
            long mult = num1 * num2;
            if(mult > Integer.MAX_VALUE){
                IO.println("Result too big");
            }

        }

    }
    }
}
