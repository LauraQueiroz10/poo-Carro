public class Carro{
	public float gas;
	public float gasMax = 10;
	public float quilometragem;
	public int passageiro;
	public int passageiroMax = 2;
	

	public boolean embarcar(){
		if(passageiro < passageiroMax){
			passageiro += 1
			return true;
		}else{
			return false;
		}
	}
	public boolean desembarcar(){
		if (passageiro > 0){
			passageiro -= 1;
			return true;
		}else{
			return false;
		}
	}
	public void abastecer (float numLitros){
		this.gas += numLitros;
		if (this.gas > gasMax){
			this.gas = 10;
		}
	}
	public boolean dirigir (float distancia){
		if(passageiro > 0){
			if(distancia/gasMax <= gas){
				gas -= distancia/gasMax;
				quilometragem += distancia;
				return true;
			}else{
				 return false;

			} 
		
		}else{
			return false; 
	
		}
	}
	public String mostrar (){
		return "Passageiro: " +passageiro+ " , gás: " +gas+ ", km andados: " +quilometragem;


	}


}
