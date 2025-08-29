public class Main {
    public static void main(String[] args) {
        Par<String, Integer> pessoa = new Par<>("Ana", 25);
        System.out.println("Nome: " + pessoa.getKey() + ", Idade: " + pessoa.getValor());

        Par<Integer, String> disciplina = new Par<>(103, "Técnica Vocal");
        System.out.println("Sala: " + disciplina.getKey() + ", Disciplina: " + disciplina.getValor());
    }
}