package B_Class;

public class B_Class {

     String run() {

       return "running";

    }


    public static void main(String[] args) {

        B_Class Object = new B_Class();
        System.out.println(Object.run());


        Dummy DObject= new Dummy();
        DObject.dance();

    }
}
