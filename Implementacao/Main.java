public class Main {
    public static void main(String[] args) {
        Repositorio<String> alunos = new RepositorioDeAlunos();
        alunos.salvar("Ana");
        alunos.salvar("Luke");

        Repositorio<Produto> produtos = new RepositorioDeProdutos();
        produtos.salvar(new Produto("TCG Pokemon", 300.00));
        produtos.salvar(new Produto("Pringles", 12.99));
    }
}