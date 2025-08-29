public class Main {
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4};
        Troca.trocar(numeros, 0, 3);
        System.out.println("Array de números: " + java.util.Arrays.toString(numeros));

        String[] palavras = {"Java", "C++", "Pythin"};
        Troca.trocar(palavras, 0, 2);
        System.out.println("Array de palavras: " + java.util.Arrays.toString(palavras));
    }
}