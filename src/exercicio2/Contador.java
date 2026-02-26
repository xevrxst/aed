package exercicio2;

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
    public boolean equals(Contador outro) {
        if (outro == null) return false;
        return valor == outro.get();
    }
    @Override
    public String toString() {
        return "Contador(valor=" + valor + ")";
    }
    public Contador copiar() {
        return new Contador(valor);
    }
}
