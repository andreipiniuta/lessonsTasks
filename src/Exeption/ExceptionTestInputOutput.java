package Exeption;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//файла "data.txt" по факту нет, четыре правила для исключений при работе с внешними ресурсами !!!!
public class ExceptionTestInputOutput {
    public static List<String> readFile(){
        List <String> allLines = new ArrayList<>();
        FileReader reader = null;
        try {
            reader = new FileReader("data.txt");  // тут может быть ошибка
            reader.read();// и  тут может быть ошибка
            //reader.close();//если возникнет ошибка до этой строки не дойдет и поток не закроется, поэтому её в finally
            return allLines;
        } catch (IOException e ) {
            e.printStackTrace();
            return allLines;
        } finally {
            if (reader != null) {//3.перед закрытием проверить , что ресурс не null
                try {// 4.у метода close обработать ошибку
                    reader.close();////1.ресурс обязательно закрыть и 2.закрыть в секции finally
                }catch (IOException e){
                    System.out.println("щшибка при закрытиии ресурсв");
                }
            }
        }
    }
}
//если будет еще writer , то его также нужно закрыть как reader (если несколько потоков, то каждый закрывай отдельно)
