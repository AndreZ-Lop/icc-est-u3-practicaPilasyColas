package utils;
import java.util.ArrayDeque;
import java.util.Queue;
public class QueuePalindrome {
    public Queue<Character> invertirCola(Queue<Character> colaOriginal){
        Queue<Character> colaInvertida = new ArrayDeque<>();
        int size = colaOriginal.size();
        for(int i = size ; i > 0 ;i--){
            for(int j = 0; j<i-1;j++){
                colaOriginal.offer(colaOriginal.remove());
            }
            colaInvertida.offer(colaOriginal.remove());
        }

        return colaInvertida;

    }

    public boolean isPalindrome(String clave){
        Queue<Character> cola = new ArrayDeque<>();
        String palabraInvertida = "";
        for(char letra: clave.toCharArray()){
            cola.offer(letra);
        }
        Queue<Character> colaInvertida = invertirCola(cola);
        while(!colaInvertida.isEmpty()){
            palabraInvertida += colaInvertida.remove();
        }

        return palabraInvertida.equals(clave);
    }
}
