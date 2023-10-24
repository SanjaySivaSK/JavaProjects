package I_Exception;

public class I_Exception {
    public static void main(String[] args) {
        try{

            String a=null;
          
        }catch (Exception e){

            if(e instanceof ArithmeticException){
                System.out.println("error");
            }
            else{
                System.out.println(e);
            }

        }
    }
}
