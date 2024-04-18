public class Programa {
    public static void main(String[] args) {

        HiloMensaje hilo1 = new HiloMensaje("Hola desde el Hilo 1", 5);
        HiloMensaje hilo2 = new HiloMensaje("Hola desde el Hilo 2", 3);
        hilo1.start();
        hilo2.start();
    }
}
