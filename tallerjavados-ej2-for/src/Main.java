import java.util.Scanner;

public class Main {
    //.Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos
    // entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10

    public static void main(String[] args) {
        int x;

        System.out.println("Se realiza una sumatoria de los numeros enteros hasta un valor x. Ingrese el valor x:");
        Scanner scaneredad=new Scanner (System.in);
        x=scaneredad.nextInt();
        int suma =0;

        for (int i=1; i<=x;i++){
            suma +=i;

        }
        System.out.println("la sumatoria es "+ suma);


    }
}