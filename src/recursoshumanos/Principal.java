package recursoshumanos;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario();
		
		f1.setCpf(000000000-12);
		f1.setSalario(1000);
		f1.setDesconto(300);
		
		f1.calcularSalario();
		
		Vendedor v1 = new Vendedor(111111111-01, 2000, 500, 1000);
		v1.calcularSalario();
		
		
		Funcionario f2 ;
		f2 = new Vendedor(901876234-90, 2000, 487, 200);
		f2.calcularSalario();
		
		f2 = new Diarista(901876234-90, 5000, 500, 400, 90);
		f2.calcularSalario();
		

	}

}
