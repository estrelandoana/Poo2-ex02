public class Par<K, V> {
    private K key;
    private V valor;

    public Par(K key, V valor) {
        this.key = key;
        this.valor = valor;
    }

    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }

    public V getValor() {
        return valor;
    }
    public void setValor(V valor) {
        this.valor = valor;
    }
}