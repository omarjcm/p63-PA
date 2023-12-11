package ejemplo_02;

public class Recurso  {
    public void uso() {
        System.out.println("Recurso utilizado por: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
