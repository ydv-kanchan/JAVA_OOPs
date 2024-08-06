import java.util.Arrays;

public class define_ClassAndObjects {
    public static void main(String[] args) {

        // create a Student student1 using class Student
        Student student1;
        student1 = new Student(); //here Student() is a cunstructor
        /*
        -declareing student1 object using class Student
        -we use dot '.' operator (separator in java) to access the objects  
        -wihtout initialising the object you can not print it.
        */

        Student[] students = new Student[5]; //declaring an array of Student class
        System.out.println(Arrays.toString(students)); //array object of class is not inilialised then the output is array of null values

        System.out.println("Without inilialisation values of properties are:");
        System.out.println(student1); // give some random value of object
        System.out.println(student1.roll_no); // give some 0 value for integer roll no
        System.out.println(student1.name); // give some null value for string name
        System.out.println(student1.marks); // give some 0.0 value for float type marks
        System.out.println(student1.passed); // give some false value for boolean type marks


        //inilialise the object properties
        student1.roll_no = 471;
        student1.name = "Kanchan Yadav";
        student1.marks = 95.05f;
        student1.passed = true;

        System.out.println("After inilialisation values of properties are:");
        System.out.println(student1); // give some random value of object
        System.out.println(student1.roll_no); // give some 0 value for integer roll no
        System.out.println(student1.name); // give some null value for string name
        System.out.println(student1.marks); // give some 0.0 value for float type marks
        System.out.println(student1.passed); // give some false value for boolean type marks

        // student1.default_value = 5000;
        System.out.println(student1.default_value);

    }
}

/*class syntax:
        class class_name{ }
        create a class student and give it three properties roll_no, name, marks
        
        Properties of class:
        1. It is a tamplet of object which have some properties and functions 
        for example: A car is a class which have engine, price, seats are some of it's properties. Every car can have unique values  for their properties.
        2. Class do not take any memory because it's just a tamplet.
        3. Class is logical construct.
        
        Properties of object:
        1. An object is an instance of a class 
        2. Object actually take memory.
        3. Object is a physical reality.
        
        Essential properties of object:
        1. STATE OF OBJECT: value from it's data type.
        2. IDENTITY OF OBJECT: how one object is different from other objects. example: where the value of the object is stored in memory?
        3. BEHAVIOUR OF OBJECT: effect of data type variables
        */
class Student {
            
    // a file named Student.class will be shown in the folder because we have created an class
            int roll_no;
            String name;
            float marks;
            boolean passed;

            float default_value = 400;
        }
