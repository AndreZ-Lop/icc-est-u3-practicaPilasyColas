import java.util.Stack;

import utils.*;
public class App {
    public static void main(String[] args) throws Exception {
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();
    }
    private static void runSignValidator() {
        SingValidator signValidator = new SingValidator();
        String cadena1 = "{[()]}";
        String cadena2 = "{[(])}";
        String cadena3 = "([]){}";
        String cadena4 = "({)}";
        System.out.println("Ejercicio 01: Validación de Signos");
        System.out.println("Cadena: " + cadena1 + " | Resultado: " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " | Resultado: " + signValidator.isValid(cadena2));
        System.out.println("Cadena: " + cadena3 + " | Resultado: " + signValidator.isValid(cadena3));
        System.out.println("Cadena: " + cadena4 + " | Resultado: " + signValidator.isValid(cadena4));
    }

    private static void runStackSorter(){
        Stack<Integer> stack = new Stack<>();
        
        stack.push(7);
        stack.push(2);
        stack.push(12);
        stack.push(1);
        stack.push(2);
    
        StackSorter sortear = new StackSorter();
        System.out.println("\nEjercicio 02: Ordenar Stack");
        System.out.println("Stack Original: " + stack);
        sortear.sortStack(stack);
        System.out.println("Stack Ordenado: "+ stack);
        System.out.println("Tope esperado: " + stack.peek());


    }

    private static void runQueuePalindrome() {
        QueuePalindrome queuePalindrome = new QueuePalindrome();
        System.out.println("\nEjercicio 03: Palíndromo usando Colas");
        System.out.println("ana   | Resultado: " + queuePalindrome.isPalindrome("ana"));
        System.out.println("radar | Resultado: " + queuePalindrome.isPalindrome("radar"));
        System.out.println("java  | Resultado: " + queuePalindrome.isPalindrome("java"));
        System.out.println("reconocer | Resultado: " + queuePalindrome.isPalindrome("reconocer"));
    }
    
}
