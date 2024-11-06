// Classe Funcionario, representa um funcionário simples sem bônus ou benefícios extras
public class Funcionario extends FuncionarioBase {

    // Construtor para inicializar o nome e o salário base do funcionário
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Implementação do cálculo de salário para um funcionário comum, sem bônus
    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
