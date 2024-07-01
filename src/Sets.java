
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        //COMO DITO NO SET NÃO TEMOS DUPLICAÇÕES O 7D SE MANTEVE APENAS 1
        //NÃO DA PRA MOSTRAR A POSIÇÃO COM O SET
        //NÃO DA PRA SUBSTITUIR
        System.out.println("Conjunto de notas");
        System.out.println(notas.toString());

        System.out.println("Confira se a nota está no conjunto:");
        System.out.println(notas.contains(5d));

        System.out.println("Menor nota: " + Collections.min(notas));

        System.err.println("Maior nota: " + Collections.max(notas));

        System.out.println("Soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Notas maiores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
        Double next = iterator1.next();
        if(next < 7) iterator1.remove();

        }
        System.out.println(notas);

        System.out.println("NOtas em ordem de informação");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague tudo");
        notas.clear();
        System.out.println(notas);

        System.out.println("Verificação de exclusão: " + notas.isEmpty());


    }
}
