package Pattern.Decorator;

public class ReversWriter implements Writer {//класс который знает как писать-- буквы наоборот
    @Override
    public void writeString(String str) {//из вне подаётся значение строки(из Main)
        String reverceStr = "";
        for (int i = 0; i < str.length(); i++){
            reverceStr = str.charAt(i) + reverceStr;//буквы наоборот
        }
        System.out.print(reverceStr);//печать уже заменненое,но без перевода на новую строку
    }
}
