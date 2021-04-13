package Task6C;

public enum Position {//enum c именем Position

    director(30.5),// поле bonus объекта enum-a проинициализировано 30.5
    programmer(45.50),// то же
    qa(20.00);// то же

    private double bonus;// поле enum-a, инициализируются в момент создания полей

    Position(double bonus) {// конструктор enum-a получает значение bonus из вне(в момент инициализации)
        this.bonus = bonus;
    }

    public double getBonus() {// getter enum-a
        return bonus;
    }
    public double calculateTotalSalary(Employee e){// static метод enum-a относится ко всем объектам enum-a
        double salary = e.getSalary();
        return salary + (salary * bonus)/100;
    }
}


