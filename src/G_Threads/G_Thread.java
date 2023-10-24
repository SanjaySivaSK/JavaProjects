package G_Threads;


public class G_Thread extends Thread{

    public void run(){
        System.out.println("running");

    }

    public static void main(String[] args) {

        G_Thread thread=new G_Thread();
        thread.start();
    }

}
