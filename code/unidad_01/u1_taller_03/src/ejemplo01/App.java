package ejemplo01;

import lista.ListaSimple;

public class App {
    public static void main(String[] args) throws Exception {
        ListaSimple lista = new ListaSimple();
        Persona obj1 = new Persona("0947586733", "Luis", "Alvarado");
        Persona obj2 = new Persona("0947586123", "Karina", "Ascencio");
        Persona obj3 = new Persona("0947586456", "Juana", "Martinez");
        Persona obj4 = new Persona("0947586789", "Guillermo", "Pizarro");
        lista.insertarPrimero(obj1);
        lista.insertarPrimero(obj2);
        lista.insertarUltimo(obj3);
        lista.insertarPrimero(obj4);

        lista.listar();
        System.out.println("--------------------------------");

        lista.eliminar(obj3);
        obj4.setNombre("Guillermo Omar");
        obj4.setApellido("Pizarro Vasquez");
        lista.actualizar(obj4);

        lista.listar();

        /*ListaSimple lista2 = new ListaSimple();
        MiClase<String, String> obj2 = new MiClase<String,String>("A", "B");
        lista2.insertarPrimero(obj2);
        lista2.insertarPrimero(obj2);
        lista2.insertarPrimero(obj2);
        lista2.insertarPrimero(obj2);*/

        //lista2.listar();
    }
}
