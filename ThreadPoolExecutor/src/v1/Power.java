package v1;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Power implements Runnable{
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final int number;


    Power(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        try{
            for (int i=1; i<=10; i++) {

                System.out.printf("%s -> %d ^ %d = %.0f%nCalculado en hilo %s\n",dateTimeFormatter.format(LocalDateTime.now()),number,i,(Math.pow(number, i)), Thread.currentThread().getName());
                TimeUnit.MILLISECONDS.sleep(200);
            }

        }catch (InterruptedException e){
            return;
        }


    }
}
