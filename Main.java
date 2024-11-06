// Classe principal para demonstrar o funcionamento das outras classes
public class Main {
    public static void main(String[] args) {
        // Criação do departamento "Tecnologia"
        Departamento tecnologia = new Departamento("Tecnologia");

        // Criação dos funcionários
        Funcionario joao = new Funcionario("João", 3000); // Funcionário simples
        Gerente maria = new Gerente("Maria", 5000, 20); // Gerente com 20% de bônus
        Diretor carlos = new Diretor("Carlos", 10000, 30, 2000); // Diretor com 30% de bônus e auxílio-moradia de 2000

        // Adiciona os funcionários ao departamento
        tecnologia.adicionarFuncionario(joao);
        tecnologia.adicionarFuncionario(maria);
        tecnologia.adicionarFuncionario(carlos);

        // Calcula e imprime a folha de pagamento total do departamento
        System.out.println("Folha de pagamento total: " + tecnologia.calcularFolhaPagamentoTotal());

        // Imprime o salário de cada funcionário no departamento
        tecnologia.imprimirSalariosFuncionarios();
    }
}
