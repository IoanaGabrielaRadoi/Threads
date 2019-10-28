package multithreading;

public class ExceptionHandledByJVM {

    public static void main(String[] args) {


        try {
            throw new RuntimeException("message 1");
        }catch (RuntimeException e){
            //System.out.println(e.getMessage());
            //why would you added it to cause if you already printed it?
            throw new RuntimeException("message 2", e);
        }

//        throw new RuntimeException();
    }
}
