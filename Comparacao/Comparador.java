public class Comparador {
    public static <T extends Comparable<T>> T maior(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }
}