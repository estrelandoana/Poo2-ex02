# Poo2-ex02
## 1. Classe Caixa Genérica
📦
Crie uma classe genérica chamada Caixa<T> que permita:

●​ Guardar um objeto de qualquer tipo (T).​

●​ Recuperar esse objeto depois.​

### No programa principal:

●​ Crie uma Caixa<String> para guardar uma palavra e depois imprima-a.​

●​ Crie uma Caixa<Integer> para guardar um número e depois imprima-o.​


## 2. Classe Par Genérico (chave e valor)
🔑➡️📘
Implemente uma classe genérica Par<K, V> que armazene uma chave e um valor.

●​ A classe deve ter construtor, getters e setters.​

### No programa principal:

●​ Crie um Par<String, Integer> representando o nome de uma pessoa e sua idade.​

●​ Crie um Par<Integer, String> representando o número de uma sala e o nome da
disciplina.​


## 3. Método Genérico para Troca
🔄
Crie um método genérico chamado trocar que receba:

●​ Um array de elementos (T[]).​

●​ Dois índices (int i, int j).​

●​ O método deve trocar os elementos nas posições i e j.

### No programa principal:

●​ Teste com um array de Integer.​

●​ Teste com um array de String.​


## 4. Método Genérico com Comparação (bounded types)
⚖️
Crie um método genérico chamado maior que receba dois elementos e retorne o maior deles.

●​ Use a restrição T extends Comparable<T> para permitir a comparação.​

### No programa principal:

●​ Teste com dois números inteiros (Integer).​

●​ Teste com duas palavras (String).​


## 5. Interface Genérica e Implementações
💾
Crie uma interface genérica Repositorio<T> com um método void salvar(T obj).

## Implemente duas versões:

1.​ RepositorioDeAlunos que salva nomes de alunos (String).​

2.​ RepositorioDeProdutos que salva produtos (crie a classe Produto com nome e
preco).​

### No programa principal:

●​ Salve alguns alunos usando o RepositorioDeAlunos.​

●​ Salve alguns produtos usando o RepositorioDeProdutos.
