/**
 *
 * @author Gonzalo Naranjo
 */

public class Lib {

    public void metodoAlumno1(){
        metodoAlumno2();
    }

    public void metodoAlumno2(){
       metodo3();
    }

    public void metodo3 () {
	System . out . println (" metodo 3");
    }

    public void metodoComunitario(){
        System.out.println("cambio en master");
        System.out.println("cambios en metodo3");

    }
}
