public class Caixa<T> {
    private T valor;

    public void guardarValor(T valor) {
        this.valor = valor;
    }
    public T pegarValor() {
        return valor;
    }
}