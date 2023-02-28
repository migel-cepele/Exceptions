package chapter11;

public class UsingExceptionsStackUnwinding {
    public static void main(String[] args) {
        
        try{
            method1();
        }
        catch(Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
             exception.printStackTrace();
            
             StackTraceElement[] traceElements = exception.getStackTrace();

             System.out.printf("%nStack trace from getStackTrace:%n");
             System.out.println("Class\t\tFile\t\t\tLine\tMethod");

             //loop neper traceElements per te marre ne exception description
             for(StackTraceElement e:traceElements) {
                System.out.printf("%s\t", e.getClassName());
                System.out.printf("%s\t", e.getFileName());
                System.out.printf("%s\t", e.getLineNumber());
                System.out.printf("%s\t", e.getMethodName());

             }

        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
