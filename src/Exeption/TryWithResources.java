package Exeption;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//при работе с внешними ресурсами технология trу with resources
// если 2 ресурса--- отделяем ; (точка с запятой)
public class TryWithResources {
    public static List<String> readFile(){
        List <String> allLines = new ArrayList<>();
        try (FileReader reader = new FileReader("data.txt"); // тут может быть ошибка
            FileWriter writer = new FileWriter("data.txt")) { // тут может быть ошибка
            reader.read();// и  тут может быть ошибка
            writer.write('A');
            return allLines;
            //закрывать внешний ресурс () не надо т.к. используем технологию trу with resources
            // try (FileReader reader = new FileReader("data.txt"))
            //reader закроется автоматом
        } catch (IOException e ) {
            e.printStackTrace();
            return allLines;
        }
    }
}
