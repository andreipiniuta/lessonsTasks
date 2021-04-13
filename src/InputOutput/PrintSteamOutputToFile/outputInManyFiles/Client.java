package InputOutput.PrintSteamOutputToFile.outputInManyFiles;

public class Client {
    public void aboutMe(MultipleOut outs){
        outs.printToAllOuts("I'm Client");//у коллекции outs вызвали метод для печати во все места (2 файла + консоль)
    }
}
