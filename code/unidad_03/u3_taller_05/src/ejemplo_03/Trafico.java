package ejemplo_03;

import java.util.concurrent.Semaphore;

public class Trafico {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);

        Thread carro1 = new Carro("NORTE", sem);
        Thread carro2 = new Carro("SUR", sem);
        Thread carro3 = new Carro("ESTE", sem);
        Thread carro4 = new Carro("OESTE", sem);

        carro1.start();
        carro2.start();
        carro3.start();
        carro4.start();
    }
}
