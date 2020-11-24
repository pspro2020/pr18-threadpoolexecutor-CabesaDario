package v1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Calculadora {
    protected final ThreadPoolExecutor cachedThreadPool =
            (ThreadPoolExecutor) Executors.newCachedThreadPool();

    void execute(Power power) {
        try {
            cachedThreadPool.execute(power);
        } catch (Exception e) {
        }
    }
}
