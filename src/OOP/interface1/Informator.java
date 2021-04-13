package OOP.interface1;

public interface Informator {//интерфэйс Informator
    void aboutMe();//метод без тела (без реализации)
    default void printMyInfo(){//метод с телом (с реализацией) с этим очень осторожно
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
    }
}
