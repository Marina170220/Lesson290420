package kompjuterIya.lesson290420;

//2.Создать класс с двумя переменными. Добавить функцию вывода на экран и функцию изменения этих переменных.
//Добавить функцию, которая находит сумму значений этих переменных,
//и функцию которая находит наибольшее значение из этих двух переменных.

public class AbstractClass {

    int firstVariable;
    int secondVariable;

    public int getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    public void showInfo() {
        System.out.println("First variable is " + getFirstVariable());
        System.out.println("Second variable is " + getSecondVariable());
    }

    public void findSum() {
        int sum = firstVariable + secondVariable;
        System.out.println(sum);
    }

    public void findMax() {
        int max;
        if (firstVariable > secondVariable) {
            max = firstVariable;
        } else {
            max = secondVariable;
        }
        System.out.println(max);
    }
}
