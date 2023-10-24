package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_Date {

    public static void main(String[] args) {
        Date date =new Date();
        SimpleDateFormat time=new SimpleDateFormat(  "E dd/MM/YYYY");
        System.out.println(time.format(date));

    }
}
