package OOP.constructorInitilization.summater;

public class Summater {

        private  int sum;

        public Summater(){
            this.sum = 0;
        }

        public void addValue(int value) {
            sum = sum + value;
        }
        public void printSum(){
            System.out.println("sum =" + sum);
        }

    }

