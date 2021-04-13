package Pattern.Decorator;

public class SimpleWriter implements Writer {//класс который знает как писать-- обычно
    @Override
    public void writeString(String str) {//из вне подаётся значение строки(из Main)
        System.out.print(str);//печать без перевода на новую строку
    }
}
