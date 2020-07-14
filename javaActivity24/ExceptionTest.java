package javaActivity24;

public class ExceptionTest{ 
public static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
}
public static void main(String[] args){
    try {
    	exceptionTest("Will print to console");
    	exceptionTest(null);
    } catch(Exception e) {
        System.out.println("Inside catch block: " + e.getMessage());
     }

 }

}