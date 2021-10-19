import java.util.Random;

public class main extends Thread {

    public static void main(String[] args) throws InterruptedException {

        for( int x = 1; x<100; x++) {
            Hilo h = new Hilo("Hilo " + x);
            h.start();
            long startTime = System.currentTimeMillis();
            Thread.sleep((long)(Math.random() * 3000));
            long endTime = System.currentTimeMillis();
            long TiempoFinal = endTime - startTime;
            System.out.println("Iniciado Hilo: " + x + " Ha dormido durante " + TiempoFinal + " milisegundos");

        }
    }
}

