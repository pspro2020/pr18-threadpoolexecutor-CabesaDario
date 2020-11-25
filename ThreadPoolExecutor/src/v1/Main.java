package v1;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        for (int i = 1; i < 11; i++) {
            Power pow = new Power(i);
            calc.execute(pow);
        }
        try {
            TimeUnit.SECONDS.sleep(4); //espera 4 segundos el hilo principal, que es más o menos lo tardan en terminar las potencias con un cachedthreadpool
        } catch (InterruptedException e) {
            return;
        }
        System.out.println("Maximo de hilos usados: "+calc.cachedThreadPool.getPoolSize());
        calc.cachedThreadPool.shutdown();


    }
}
