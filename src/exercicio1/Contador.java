package exercicio1;

public class Contador {
    private int valor;
    public Contador(int v){
        valor=v;
    }
    public Contador() {
        valor=0;
    }
    public void incrementar() {
        valor++;
    }
    public void decrementar() {
        valor--;
    }
    public void reset() {
        valor=0;
    }
    public int get() {
        return valor;
    }
}
