package recursoshumanos;

public class Diarista extends Funcionario {
	double valorHora;
	double qtHora;

	public Diarista(long cpf, double salario, double desconto, double valorHora, double qtHora) {
		super(cpf, salario, desconto);
		this.valorHora = valorHora;
		this.qtHora = qtHora;
	}

	public Diarista() {

	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getQtHora() {
		return qtHora;
	}

	public void setQtHora(double qtHora) {
		this.qtHora = qtHora;
	}

	@Override
	public void calcularSalario() {
		double result = this.getQtHora() * this.getValorHora();
		System.out.println("Valor horas * valor hora da Diarista: " + result);
	}

}
