package recursoshumanos;

public class Vendedor extends Funcionario {
	double comissao;

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public Vendedor(long cpf, double salario, double desconto, double comissao) {
		super(cpf, salario, desconto);
		this.comissao = comissao;
	}

	@Override
	public void calcularSalario() {
		double totalLiquido = (this.getSalario() + getComissao()) - this.getDesconto();
		System.out.println("Total liquido salario Vendedor: " + totalLiquido);
	}

}
