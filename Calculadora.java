import java.util.*;
public class Calculadora {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido a la mini calculadora");
        
        boolean menu = true;
        double num1, num2;

        while (menu) {
            System.out.println("Selecciona una opcion:\n");
            System.out.println("1.Sumar \n2.Restar \n3.Salir\n");
            System.out.print("Opción: ");

        if (in.hasNextInt()) {
            int opcion = in.nextInt();

            switch (opcion) {
                case 1:
                 try {
                    System.out.println("Dame el primer numero");
                    num1 = in.nextDouble();
                    System.out.println("Dame el segundo numero");
                    num2 = in.nextDouble();
                    System.out.println("Tu resultado es " + sumar(num1,num2));
                         }
                    catch (InputMismatchException e) {
                        System.out.println("Eso no es un número válido. Intenta de nuevo.");
                        in.next(); 
                    }
                    break;
                
                case 2:
                  try {
                    System.out.println("Dame el primer numero");
                    num1 = in.nextDouble();
                    System.out.println("Dame el segundo numero");
                    num2 = in.nextDouble();
                    System.out.println("Tu resultado es " + restar(num1,num2));
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Eso no es un número válido. Intenta de nuevo.");
                        in.next(); 
                    }
                    break;
                case 3:
                    menu = false;
                    break;

                default:
                System.out.println("El valor ingresado no existe intenta de nuevo");
                    break;
            }
        }else{
             System.out.println("Entrada no válida. Por favor, introduce un número.\n");
            in.next();
        }

        in.close();
        }
    }

    public static double restar(double num1, double num2){
        return  num1 - num2;
    }

    public static double sumar(double num1, double num2){
        return num1 + num2;
    }
}