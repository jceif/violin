package cn.myviolin;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
           Date date= simpleDateFormat.parse("2018-03-01 05:23:55");
            System.out.println(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
