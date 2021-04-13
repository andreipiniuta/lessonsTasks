package OOP.constructorInitilization.summater;

public class ChainSummater {
    private int sum;

    public ChainSummater() {
        this.sum = 0;
    }

    public ChainSummater addValue(int value) {
        sum = sum + value;
        return this; //возвращаем самого себя как объект с уже накопленной суммой

    }

    public ChainSummater printSum() {
        System.out.println("sum =" + sum);
        return this; //возвращаем самого себя как объект с уже накопленной суммой

    }
}
