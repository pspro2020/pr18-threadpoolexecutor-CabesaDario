package v2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Calculadora {
    ThreadPoolExecutor fixedThreadPool =
            (ThreadPoolExecutor) Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    void execute(Power power) {
        try {
            fixedThreadPool.execute(power);
        } catch (Exception e) {
        }
    }
}
