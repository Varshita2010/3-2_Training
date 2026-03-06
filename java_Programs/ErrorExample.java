public class ErrorExample{
    static void recursiveMethod(){
        recursiveMethod();
    }
    public static void main(String[] args){
        try {
            recursiveMethod();
        }catch (StackOverflowError e){
            System.out.println("Stack overflow error occured");
        }
        System.out.println("Program continues after handling error");
    }
}