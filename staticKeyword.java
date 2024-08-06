public class staticKeyword {
    public static void main(String[] args) {
        staticKeyword obj2 = new staticKeyword();
        obj2.greeting();

        Human kanchan = new Human(20, "Kanchan", 1000000);
        Human kamal = new Human(21, "Kamal", 1000000);
        Human jasjeet = new Human(19, "Jasjeet", 1000000);

        System.out.println(kanchan.population);
        System.out.println(kamal.population);
        System.out.println(jasjeet.population);

        fun();

    }
    
    static void fun() {
        //greeting(); //you can not use this because it requires an instance
        //but the function you are using it in does not depend on instances
        // you can not access non static stuff without referenceing their instances in a static context
        staticKeyword obj = new staticKeyword();

        obj.greeting(); 
    }

    //if we will not write static over here then we can not call it in main function 
    //if we do not write static on both main function and this function then we static is not required

    //function without word static is somthing which is not static, means belongs to an object
     void greeting() {
        System.out.println("hello world!!");
    }
}