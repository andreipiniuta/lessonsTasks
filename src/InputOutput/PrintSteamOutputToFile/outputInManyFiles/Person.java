package InputOutput.PrintSteamOutputToFile.outputInManyFiles;

public class Person {
    public void aboutMe(MultipleOut outs){
        outs.printToAllOuts("I'm person");//у коллекции outs вызвали метод для печати во все места (2 файла + консоль)
    }
}