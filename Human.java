public class Human {
    int age;
    String name;
    int salary;
    static long population;

    Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;

        // static variables are given value using the class name in place of this
        Human.population += 1;
    }
}
