import java.util.ArrayList;

// Classe Departamento, que gerencia uma lista de funcionários
public class Departamento {

    private ArrayList<FuncionarioBase> funcionarios; // Lista de funcionários do departamento

    // Construtor para inicializar o nome do departamento e a lista de funcionários
    public Departamento(String nome) {

        this.funcionarios = new ArrayList<>();
    }

    // Método para adicionar um funcionário ao departamento
    public void adicionarFuncionario(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para remover um funcionário do departamento
    public void removerFuncionario(FuncionarioBase funcionario) {
        funcionarios.remove(funcionario);
    }

    // Método para calcular a folha de pagamento total do departamento
    public double calcularFolhaPagamentoTotal() {
        double total = 0;
        for (FuncionarioBase funcionario : funcionarios) {
            total += funcionario.calcularSalario(); // Usa polimorfismo para calcular o salário
        }
        return total;
    }

    // Método para imprimir o salário de cada funcionário usando polimorfismo
    public void imprimirSalariosFuncionarios() {
        for (FuncionarioBase funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Salário: " + funcionario.calcularSalario());
        }
    }
}
