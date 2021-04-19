package lista6.questao4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4_Main {
    public static void main(String[] args) {
        System.out.print("Digite uma frase: ");
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();

        ContaPalavras(frase);
    }

    public static void ContaPalavras(String frase) {
        frase = frase.toLowerCase();
        frase = frase.replaceAll("[,.:!?;]","");
        Map<String, Integer> map = new HashMap<>();
        for (String palavra : frase.split(" ")) {
            Integer contador = map.get(String.valueOf(palavra));
            if (contador != null){
                map.put(String.valueOf(palavra), ++contador);
            }
            else{
                map.put(String.valueOf(palavra), 1);
            }
        }
        System.out.println("\nQUANTIDADE DE VEZES EM QUE CADA PALAVRA APARECEU:");
        for (Map.Entry<String, Integer> palavra : map.entrySet()) {
            System.out.println(palavra.getKey() + ": " + palavra.getValue());
        }
    }
}