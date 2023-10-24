package A_Object;

public class A_Object {

    String firstName ;
    int age = 21;
    A_Object(String firstName ){
        this.firstName=firstName;
    }


    public static void main(String[] args) {

        A_Object Object = new A_Object("sanjay");

        System.out.println(Object.age);
        System.out.println(Object.firstName);


        A_Object Object2 = new A_Object("kumar");

        System.out.println(Object2.age);
        System.out.println(Object2.firstName);
        System.out.println(Object);
        System.out.println(Object2);
    }
}
