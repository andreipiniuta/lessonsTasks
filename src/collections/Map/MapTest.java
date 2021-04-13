package collections.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> votes = new TreeMap<String, Integer>();//создание карты
        votes.put("Java", 253);// добавляю пару
        votes.put("C", 153);
        votes.put("Pyton", 50);
        votes.put("PHP", 3);
        System.out.println(votes);
        votes.clear();// очищение карты
        System.out.println(votes);
        votes.put("Java", 825);
        votes.put("C", 103);
        votes.put("Pyton", 50);
        votes.put("PHP", 3);
        System.out.println(votes.size());// узнаем размер(количество пар)
        Integer value =votes.get("C");// в перемен value присваиваем значение из ячейки под ключом "С"
        System.out.println(value);//вывод значения ячейки под ключом "С"
        //итерирование карты
        Set<String> keys = votes.keySet();//создаем Set равный votes.keySet()
        for (String k:keys) {// итерируем через foreach:в перемен k заносим значение(ключи) из множества kеys
            Integer v = votes.get(k);// в перемен v  заносим значение ячейки с ключом k
            System.out.println("Value + key  " + k + " " + v);
        }

//расчет процентного соотношения языков программир
        Integer allPeople = 0;//allPeople перемен, которая показываем полное количество голосов(значений)
        Set<String> keys2 = votes.keySet();
        for (String kk:keys2) {  //итерируем через foreach:в перемен kk заносим значение(ключи) из множества kеys
            Integer v = votes.get(kk);//в перемен v  заносим значение ячейки с ключом kk
            allPeople = v+allPeople;
        }
        System.out.println(allPeople);//это наши 100 процентов
        for (String k:keys2) { //итерируем через foreach:в перемен с заносим значение(ключи) из множества kеys
            Integer v =votes.get(k);//в перемен v  заносим значение ячейки с ключом с
            double percent= (double)v*100/allPeople;//расчет процента
            System.out.println("for " +k +" with " + v + " votes percent " + percent );
        }

    }

}
