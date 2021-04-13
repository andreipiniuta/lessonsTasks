package Pattern.Decorator;

//пусть по задаче необходимо писать строку тремя пособами с и без перевода на новую строку
// то есть надо иметь классы SimpleWriter, NoSpaceWriter, ReversWriter, которые (по ситуации) будут переводить на новую строку и не будут
// так чтобы не делать 6 классов(удваивать уже существующие), делаем 1 который переводит на следующую строку
public class LineWriter implements Writer {//класс, переводит на следующую строку

    private Writer internalWriter;//создаем поля типа как интерфэйс

    public LineWriter(Writer internalWriter) {//в параметр конструктора передаем поле предидущего класса
        this.internalWriter = internalWriter;
    }

    @Override//метод этого класса только переводит на новую строку, а как писать он спрашивает через поле у объекта другого класса
    public void writeString(String str) {
        internalWriter.writeString(str);//поле вызывает метод написания у общего для всех классов Interface Writer, а
        //а в Main передадут объект того класса, способ которого нужен то есть оденут
        System.out.print("\n");//перевод на след строку
    }
}
