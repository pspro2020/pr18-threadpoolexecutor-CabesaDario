package v1;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        for (int i = 1; i < 11; i++) {
            Power pow = new Power(i);
            calc.execute(pow);


        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Maximo de hilos usados: "+calc.cachedThreadPool.getPoolSize());
    }
}
