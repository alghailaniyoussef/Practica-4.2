/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg4.pkg2;

import java.util.Scanner;

/**
 *
 * @author ghailani youssef
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion, num1, num2;
        Calculadora CAL = new Calculadora();
        do {
            System.out.println("Por favor entre primer numero:");
            num1 = scanner.nextInt();
            System.out.println("Por favor entre secondo numero:");
            num2 = scanner.nextInt();
            System.out.println("Por favor elija una opción:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    CAL.suma(num1, num2);
                    break;
                case 2:
                    CAL.suma(num1, num2);
                    break;
                case 3:
                    CAL.multiplicar(num1, num2);
                    break;
                case 4:
                    CAL.dividir(num1, num2);
                    break;
                case 5:
                    CAL.suma(num1, num2);
                    break; }
        } while (opcion != 6);
    }

}
