import java.util.Scanner;

public class Main {
    //.Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos
    // entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10

        public static void main(String[] args) {


            int sumatoria = 0;
            int x = 1;
            while (x <= 10) {
                sumatoria += x;
                x++;
            }

            System.out.println(sumatoria);
        }
    }