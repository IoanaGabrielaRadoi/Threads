package multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class WithoutThreadLocal {

    static SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE MMM d, hh:mm:ss");

    public static void main(String[] args) {
        Thread t1 = new Thread(new DatePrinter("Formatter 1"), "Formatter 1");
        Thread t2 = new Thread(new DatePrinter("Formatter 2"), "Formatter 2");
        Thread t3 = new Thread(new DatePrinter("Formatter 3"), "Formatter 3");


        t2.start();
        t1.start();
        t3.start();
    }


    public static class DatePrinter implements Runnable{
        private String name;

        DatePrinter(String name) {
            this.name = name;
        }

        public void run() {
            if (name.equals("Formatter 1")){
                System.out.println(name + " is setting the formatter");
                WithoutThreadLocal.dateFormatter.applyPattern("hh:mm:ss");
            }

            while(true){
                try{
                    TimeUnit.SECONDS.sleep(2);
                }catch (InterruptedException e){
                    //ignore
                }

                Date now = new Date();
                System.out.println(name + " displayed data: " + WithoutThreadLocal.dateFormatter.format(now));
            }

        }
    }
}
