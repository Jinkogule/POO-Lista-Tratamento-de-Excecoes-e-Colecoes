package lista6.questao5;

import java.util.*;

public class Q5_Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Lucas");
        al.add("Pimenta");
        al.add("Santana");
        al.add("Murta");
        System.out.println(al);

        Set<String> hs = new HashSet<>(al);
        System.out.println(hs);

        PriorityQueue<String> pq = new PriorityQueue<>(hs);
        System.out.println(pq);

        TreeSet<String> ts = new TreeSet<>(pq);
        System.out.println(ts);
    }
}

//Porque no hashset os elementos não são ordenados, entretando, sua busca é a mais eficiente em comparação às demais estruturas, tendo complexidade O(1).