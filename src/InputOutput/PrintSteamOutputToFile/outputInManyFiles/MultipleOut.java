package InputOutput.PrintSteamOutputToFile.outputInManyFiles;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MultipleOut {
    private List<PrintStream> outs;//поле есть коллекция выводов

    public MultipleOut() { //конструктор
        outs = new ArrayList<>(); //outs это коллекция выводов, пока пустая
        PrintStream defaultOut = System.out;//вывод в консоль сохранили в перемен defaultOut
        outs.add(defaultOut);// в коллекц выводов добавили вывод из консоли(первый элемент)
    }
    public void addNewOut(String filePath) throws FileNotFoundException {
        PrintStream newPs = new PrintStream(filePath); //создали поток вывода с именем newPs
        outs.add(newPs);// в коллекцию outs добавили поток вывода с именем newPs(второй элемент на первый файл, если будет 2й файл, то он будет в 3м элементе и т.д.)
    }
    public void printToAllOuts(String str){
        for (PrintStream ps:outs) {//for each бежим по коллекции outs в перемен ps
            ps.println(str);// у перемен ps вызываем  метод println
        }
    }
}
