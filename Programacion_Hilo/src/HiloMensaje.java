class HiloMensaje extends Thread {
    private String mensaje;
    private int repeticiones;

    public HiloMensaje(String mensaje, int repeticiones) {
        this.mensaje = mensaje;
        this.repeticiones = repeticiones;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeticiones; i++) {
            System.out.println(mensaje);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
