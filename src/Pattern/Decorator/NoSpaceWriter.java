package Pattern.Decorator;

public class NoSpaceWriter implements Writer {//класс который знает как писать-- вместо пробела дефиз
    @Override
    public void writeString(String str) {//из вне подаётся значение строки(из Main)
        str = str.replace(" ", "-");//вместо пробела дефиз
        System.out.print(str);//печать уже заменненое, но без перевода на новую строку

    }
}
