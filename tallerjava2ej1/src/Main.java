import java.util.Scanner;

public class Main {
    //.Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos
    // entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10
    public static void main(String[] args) {
        int v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;

    System.out.println("ingrese valores del 1 al 10:");
    Scanner scaneredad=new Scanner (System.in);
    v1=scaneredad.nextInt();
    v2=scaneredad.nextInt();
        v3=scaneredad.nextInt();
        v4=scaneredad.nextInt();
        v5=scaneredad.nextInt();
        v6=scaneredad.nextInt();
        v7=scaneredad.nextInt();
        v8=scaneredad.nextInt();
        v9=scaneredad.nextInt();
        v10=scaneredad.nextInt();

        int r1 = v1+ v2;
        int r2 = v3+ r1;
        int r3 = v4+ r2;
        int r4 = v5+ r3;
        int r5 = v6 + r4;
        int r6 = v7 + r5;
        int r7 = v8 + r6;
        int r8 = v9 + r7;
        int r9 = v10 + r8;

        System.out.println("el resultado es "+ r9);
     }
}