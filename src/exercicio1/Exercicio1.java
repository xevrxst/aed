package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        Contador c1= new Contador();
        c1.incrementar();
        c1.incrementar();
        System.out.println("c1="+c1.get());
        c1.decrementar();
        System.out.println("c1="+c1.get());
        c1.reset();
        System.out.println("c1="+c1.get());
        Contador c2= new Contador(10);
        c2.incrementar();
        System.out.println("c2="+c2.get());
    }
}
