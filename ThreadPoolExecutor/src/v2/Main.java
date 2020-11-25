package v2;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        for (int i = 1; i < 11; i++) {
            Power pow = new Power(i);
            calc.execute(pow);


        }
        try {
            while (calc.fixedThreadPool.getActiveCount()>0)
            Thread.sleep(2000); //espera activa, no sé como hacerlo mejor porque depende del equipo
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Maximo de hilos usados: "+calc.fixedThreadPool.getPoolSize());

        calc.fixedThreadPool.shutdown();
    }
}
