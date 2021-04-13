package Pattern.Decorator;

public class DecorateTest {
    public static void main(String[] args) {
        SimpleWriter writer = new SimpleWriter();//создание объекта с простым написанием (writer)
        NoSpaceWriter nsw = new NoSpaceWriter();// создание объекта с дефис вместо пробела (nsw)
        ReversWriter rw = new ReversWriter();//  создание объекта c написанием обратным порядом (rw)
        LineWriter lw = new LineWriter(writer);// создание объекта с переходом(lw) и передача ему способа с простым написанием(writer)  ОДЕЛИ SimpleWriter в LineWriter

        writer.writeString("Hello Java World!!!");//написание строки простым способом
        lw.writeString("После слов будет с новой строки");//написание строки простым способом с ПЕРЕХОДОМ

        nsw.writeString("Hello Java World!!!");//написание строки дефис вместо пробела
        lw = new LineWriter(nsw);//передача объекту с переходом(lw) способа дефис вместо пробела(nsw)   ОДЕЛИ NoSpaceWriter в LineWriter
        lw.writeString("После слов бубет с новой строки");//написание строки дефис вместо пробела с ПЕРЕХОДОМ

        rw.writeString("Hello Java World!!!");//написание строки обратным порядком
        lw = new LineWriter(rw);//передача объекту с переходом(lw) способа с написанием обратным порядком(rw)  ОДЕЛИ ReversWriter в LineWriter
        lw.writeString("После слов бубет с новой строки");//написание строки обратным порядком с ПЕРЕХОДОМ


        //у нас 6 способов(методов) написания, но вместо 6 классов у нас 3класса +1 класс
        //если было бы 20 классов, то вместо 40 было бы 20+1
        //это очень удобно для разработчиков API, но для пользователя нет, поэтому в реальной работе не часто используют
    }
}
