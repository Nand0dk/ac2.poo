// Classe Gerente, herda de FuncionarioBase e implementa a interface Beneficios
public class Gerente extends FuncionarioBase implements Beneficios {
    private double bonusPercentual; // Percentual do bônus do gerente

    // Construtor para inicializar o nome, salário base e percentual de bônus do
    // gerente
    public Gerente(String nome, double salarioBase, double bonusPercentual) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonusPercentual = bonusPercentual;
    }

    // Implementação do cálculo de salário, incluindo o bônus
    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(bonusPercentual);
    }

    // Implementação do cálculo de bônus com base no percentual
    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * (percentual / 100);
    }

    // Gerente não possui auxílio-moradia, retorna 0
    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return 0;
    }
}
