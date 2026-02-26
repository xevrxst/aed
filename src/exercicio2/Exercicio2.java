package exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        //Contador c1= new Contador();
        //c1.incrementar();
        //c1.incrementar();
        //System.out.println("c1="+c1.get());
        //c1.decrementar();
        //System.out.println("c1="+c1.get());
        //c1.reset();
        //System.out.println("c1="+c1.get());
        //Contador c2= new Contador(10);
        //c2.incrementar();
        //System.out.println("c2="+c2.get());
        Contador c1 = new Contador(10);
        Contador c2 = c1.copiar();
        System.out.println("C1: " + c1); 
        System.out.println("C2 (copia de C1): " + c2);
        System.out.println("C1 e igual a C2? " + c1.equals(c2));
        c2.incrementar();
        System.out.println("C2 apos incrementar: " + c2);
        System.out.println("C1 e igual a C2 agora? " + c1.equals(c2));
    }  
}
