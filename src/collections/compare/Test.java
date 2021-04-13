package collections.compare;

public class Test implements Comparable <Test> {
    private int age;

    public Test(int a) {
        this.age = age;
    }

    public void setA(int a) {
        this.age = age;
    }


    public int getA() {
        return age;
    }

    @Override
    public int compareTo(Test t) {
        return this.age - t.age;
    }
}
