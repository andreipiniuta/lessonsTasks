package FromCMDInputAndRead;
import java.util.Random;

public class InputAndReadCMD {

    public static void main (String[] args){ // String[] args это строковый массив args ячейки заполняютя в CMD(в командной строке)
        // Введя в cmd 2 цифры через пробел мы создаем массив с 2 ячейками со значениями которые мы ввели
        // надо вевести массив размер которого задается первым числом, введенным в cmd, а во втором числе генерируется числа чтобы заполнить ячейки
        Random ram = new Random(); // создали перемен ram класса рандом
        if (args.length !=10){// условие что нAдo ввести только 2 цифры т.е. массив String[] args должен быть с 2мя ячейками
            System.out.println("Error");
            System.exit(0); // выход из программы
        }else {// если в cmd ввели 2 числа то прога может работать
            int arraySize = Integer.parseInt(args[0]); //перемен arraySize присваивается значение из первой ячейки массива String[] args(первая введенная цифра), переведенная из строки в целое число
            int randMax = Integer.parseInt(args[1]); // перемен randMax---из второй ячейки(вторая введенная цифра) и переведенная из строки в целое чило
            int [] array = new int [arraySize]; //создаем наш массив
            for(int i=0; i<array.length; i++) { //заполняем наш массив
                int value = ram.nextInt(randMax); //значение ячеек(value) ,будет равно перемен ram  c методом чтения целых чисел и создания случ чисел
                array[i] = value; // записываем в ячейки наши сгенерированные значения
            }
            for (int b:array) { //читаем массив в перемен b
                System.out.println(b); // печатаем премен b в которую помещен массив array
                }
        }
    }
}
