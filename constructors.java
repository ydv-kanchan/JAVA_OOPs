public class constructors {
    public static void main(String[] args) {
        //declare and initialise an object student1;
        Student student1 = new Student(442,"Jasjeet Kaur",90.5f); // Here the constructor is being called

        //the default values given in the constructor will be printed for each object
        System.out.println(student1.roll_no);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        Student student2 = new Student();
        System.out.println(student2.roll_no);
        System.out.println(student2.name);
        System.out.println(student2.marks);


        // if we will give some other values to the objects then those will be printed
        student1.roll_no = 470;
        student1.name = "Kamaljeet Kaur";
        student1.marks= 90.05f;

        System.out.println(student1.roll_no);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        //calling functions of class for different objects
        student2.greeting(); //this will take the default vlaue of the student object which is given in constructor if we will not use this keyword in the greeting function.
        //if we will use this keyword then the value of studnet2 will be taken.
    }
}

//define class 

class Student {
    //some properties
    int roll_no;
    String name;
    float marks;

    // class function
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    //constructor
    Student() {

        //this is a keyword, which is used to add values of the above properties of object for each object  separately. 
        this.roll_no = 400;
        this.name = "Aman";
        this.marks = 0.5f;
    }


    //Student student2 = new Student(442,"Jasjeet Kaur", 90.5f)
    //here, this will be replaced with student2 variable values
    Student(int roll_no, String name, float marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
}