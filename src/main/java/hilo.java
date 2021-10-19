import com.sun.tools.javac.Main;

class Hilo extends Thread {

    public String nombre;

    public Hilo(String nombre) {
        this.nombre = nombre;
    }
}
