package collections.compare;

public class PersonComparable implements Comparable <PersonComparable> {//делаем так чтобы объекты Person реализ Comparable
    private String name;
    private int age;

    public PersonComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name " + name + "  " + "age " + age;
    }

    @Override// переопределяем метод compareTo
    public int compareTo(PersonComparable p) {
        //return this.age - p.age;//по возрастанию по возрасту
        //return p.age - this.age;//по убыванию по возрасту
        //return this.name.compareTo(p.name); //по возрастанию по имени
        //return -this.name.compareTo(p.name);//по убыванию по имени


        //сравнение по 2м параметрам
        int result = this.name.compareTo(p.name);//сначала по имени
        if(result != 0){
            return result;
        }
        result = this.age -p.age;//потом если имя одинаковое, по возрасту
        return result;
    }
}