package package2;

import static package1.greeting.message;


// import static folder_name.java_file_name.function_name
//this is how java determines where to look for this packages
public class greeting {
    public static void main(String[] args) {
        System.out.println("this is package2 ");
        message();
   
    }
}
