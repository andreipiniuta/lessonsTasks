package Random;
import java.util.Random;
public class Random2 {

    public static void main (String[] args){ //битва рандомов
        Random ram = new Random();
        int evenSum = 0; //сумма чентых
        int oddSum = 0; //сумма нечетных
        int evenCount = 0; //считает сколько сгенирировано четныч
        int oddCount = 0; // считает сколько сгенерировано нечетных
        while ((evenSum<=1000) && (oddSum<=1000)) { // сумма идет до 1000 кто первый(чет или нечет) то типа победил
            int value = ram.nextInt(10); //целой перемен value присваиваем значение перемен ram  c методом чтения целых чисел и создания случ 10 чисел (от 0 до 9)
            if(value == 0){ // если генерирует ноль, то не считается и заново
                continue;
            }
            if (value % 2 ==0) { // если выпало четное, то выпавшее значение(value) добавляем к сумме четных
                evenSum=evenSum+value;
                evenCount=evenCount++;//счетчик добавляет единичку
            } else {
                oddSum=oddSum+value; // для нечетных
                oddCount=evenCount++;//счетчик добавляет единичку
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
