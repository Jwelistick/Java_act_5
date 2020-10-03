package Hello_World;
import java.util.*;
public class HelloWorld{
public static void main(String[]args){
        Scanner numsc = new Scanner(System.in);
        System.out.println("Calculadora");
        float num1 = 0;
        float num2 = 0;
        float resp = 0;
        System.out.println("Escribe un numero:");
        num1 = Integer.parseInt(numsc.next());
        System.out.println("Segundo número:");
        num2 = Integer.parseInt(numsc.next());
        System.out.println("escribe un numero según la operación que desees: \n" +
                "1-sumar\n" +
                "2-restar\n" +
                "3-multiplicar\n" +
                "4-dividir\n");
        int decision = Integer.parseInt(numsc.next());
        if (decision == 1) {
                resp = num1+num2;
                System.out.println(num1 + " - " + num2 + " = " + resp);
        }else if (decision == 2){
                resp = num1-num2;
                System.out.println(num1 + " - " + num2 + " = " + resp);
        }else if (decision == 3){
                resp = num1*num2;
                System.out.println(num1 + " - " + num2 + " = " + resp);
        }else if (decision == 4){
                resp = num1/num2;
                System.out.println(num1 + " - " + num2 + " = " + resp);
        }else{
                System.out.println("favor de escribir un número válido");
        }

        }
}