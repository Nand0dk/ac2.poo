// Classe abstrata base para todos os funcionários
public abstract class FuncionarioBase {
    protected String nome; // Nome do funcionário
    protected double salarioBase; // Salário base do funcionário

    // Método abstrato para calcular o salário, implementado nas subclasses
    public abstract double calcularSalario();

    // Sobrecarga do método calcularSalario com bônus adicional
    public double calcularSalario(double bonusAdicional) {
        return calcularSalario() + bonusAdicional;
    }

    // Método para obter o nome do funcionário
    public String getNome() {
        return nome;
    }
}
