// Interface para benefícios adicionais, implementada por Gerente e Diretor
public interface Beneficios {
    // Método para calcular o bônus com base em um percentual
    double calcularBonus(double percentual);

    // Método para calcular o auxílio-moradia com base em um valor fixo
    double calcularAuxilioMoradia(double valorFixado);
}
