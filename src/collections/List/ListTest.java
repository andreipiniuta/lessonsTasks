package collections.List;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(0);
        ar.add(1);
        ar.add(10);
        ar.add(3);
        ar.add(15);
        System.out.println(ar);
        ar.set(2,-20);//метод set, замена во втором индексе на значение -20
        System.out.println(ar);
        ar.add(2,-220);//добавляет новую ячейку, вставляет её на место с номером индекса 2 со значением -220
        System.out.println(ar);
        System.out.println(ar.get(3));//метод возвращает значение ячейке номер которой указан
        for (int i = 0; i < ar.size(); i++){
            System.out.println(ar.get(i)); //метод возвращает значение ячейке номер которой указан
        }
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.addFirst(0);
        ll.addLast(15);
        System.out.println(ll);

//        ArrayList<Integer> ar2 = new ArrayList<>();
//        Random r = new Random();
//        for ( ; ; ){
//            for (int q=0; q<ar2.size(); q++){
//                Integer value = r.nextInt();
//                ar2.add(value);
//                System.out.println(ar2.size());
//            }
//        }
    }
}
