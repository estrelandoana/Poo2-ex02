public class Main {
    public static void main(String[] args) {
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardarValor("Olá, mundo!");
        System.out.println(caixaDeTexto.pegarValor());

        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.guardarValor(42);
        System.out.println(caixaDeNumero.pegarValor());
    }
}