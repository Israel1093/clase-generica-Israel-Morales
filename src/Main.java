import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO CALCULADORA - ISRAEL MORALES");
        double res = 0;
        double numero1 = 0;
        double numero2 = 0;
        System.out.println("Ingrese el primer número\n");
        Scanner n1 = new Scanner(System.in);
        numero1 = n1.nextInt();
        System.out.println("Ingrese el segundo número\n");
        Scanner n2 = new Scanner(System.in);
        numero2 = n2.nextInt();

        Operacion<Double> operaciones = new Operacion<Double>();
        //Suma
        res = operaciones.suma(numero1,numero2);
        System.out.println("la suma es: " + res);
        //Resta
        res = operaciones.resta();
        System.out.println("la resta es: " + res);
        //Multiplicaion
        res = operaciones.multiplicacion();
        System.out.println("la multiplicacion es: " + res);
        //Division
        if (numero2 == 0) {
            System.out.println("¡¡El segundo número debe ser diferente de cero!!\n");
        } else {
            res = operaciones.division();
            System.out.println("la division es: " + res);
        }
    }
}