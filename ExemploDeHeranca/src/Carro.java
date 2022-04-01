
public class Carro extends Veiculo{				//acesso a veiculos			
	private boolean quatroPortas;

	
	public boolean isQuatroPortas() {     						//metodo
		
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {  
		this.quatroPortas = quatroPortas;
		
	}

	@Override
	public void imprimirDados() {	
		super.imprimirDados();                   //Source, Override
		System.out.println("Quatro portas:" + quatroPortas);
	}
	
	
	
}
