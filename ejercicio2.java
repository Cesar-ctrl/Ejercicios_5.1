import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el precio del articulo: ");

        while(!entrada.hasNextFloat()){
            entrada.nextLine();
            System.out.println("Base no es válida");
        }
        float base = entrada.nextFloat();

        while(!entrada.hasNextFloat()){
            entrada.nextLine();
            System.out.println("Eso no es válido");
        }
        float precio = entrada.nextFloat();
        float iva = (precio*10)/110;
        System.out.println("IVA pagado es: " + iva);
        float real = precio-iva;
        System.out.println("El precio sin IVA: " + real);
    }
}
