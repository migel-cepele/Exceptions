package chapter11;

public class UsingExeptions {
    public static void main(String[] args) {
        
        try{
            throwException();
        }
        catch (Exception exception) {
            System.err.println("Exception handled in main");
        }

        doesNotThrowException();
    }

    //demonstron try catch finally
    public static void throwException() throws Exception
    {
        try { //krijon nje exception dhe e kap menjehere
            System.out.println("Method throwException");
            throw new Exception(); //gjeneron exception
        }
         catch(Exception exception) {
            System.err.println("Exception handled in method throwException");
            throw exception; //rethrow for further processing
            //supozojme se ketu mund ta zgjidhim pjeserisht problemein e exception

            //kodi ketu nuk mund te kapet sepse shkakton compilation error

        }

        finally {
            System.err.println("Finally u ekzekutua ne throwException");
        }
        //kodi ketu nuk mund te kapet
    }

    public static void doesNotThrowException() {

        try{
            System.out.println("Method does not throw exception");
        }
        catch(Exception exception) {
            System.err.println(exception);
        }
        finally { //ekzekutohet pavarsisht cfare ndodh ne try catch
            System.err.println("Finally ekzekutohet ne doesNotThrowException");
        }

        System.out.println("fundi i metodes doesnotthrowexception");
    }
}
