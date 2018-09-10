import java.util.Scanner;

public class Principal {
	public static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {

		String help = "\t============= help =====================\n"+
					  "\tembarcar: embarca um passageiro\n"+
					  "\tdesembarcar: desembarca um passageiro\n"+
					  "\tabastecer: abastece o carro\n"+
					  "\tdirigir: o carro começa a andar\n"+
					  "\tshow: mostra a quantidade de gás, passageiros e a quilometragem rodada pelo carro\n"+
					  "\tsair: sai do programa\n"+
					  "\t========================================\n";
		Carro car = new Carro();
		car.passageiro = 0;
		car.gas = 0;
		car.quilometragem = 0;
		while(true){
			System.out.print("Digite um comando"+
						"(help para ver os comandos): ");
			String comando = sc.nextLine();
			if(comando.equals("help")){
				System.out.println(help);
			} else if(comando.equals("sair")){
				System.out.println("\tEncerrando o carro.");
				break;
			} else {
				String c[] = comando.split(" ");
				float resposta, valor;
				boolean boleanas;
				
				switch (c[0]){
				case "embarcar":
					boleanas = car.embarcar();
					if (boleanas == true){
						System.out.println("Passageiro embarcado!");
					}else{
						System.out.println("Limite de passageiros atingido!");
					}
					break;
					
				case "dembarcar":
					boleanas = car.desembarcar();
					if(boleanas == true){
						System.out.println("Passageiro desembarcado");
					}else{
						System.out.println("Não hã passageiros no carro!");
					}
					break;							
				case "abastecer":
					resposta = Float.parseFloat(c[1]);
					car.abastecer(resposta);
					System.out.println("Abastecimento efetuado!");
					break;
				case "dirigir":
					valor = Float.parseFloat(c[1]);
					if(car.dirigir(distancia) == true){
						System.out.println("Carro em movimento!");
					}else if(car.passageiro == 0){
						System.out.println("Ops... Sem pasageiros no carro!");
					}else{
						System.out.println("Você esqueceu de abastecer... Gasolina 									   insuficiente!");
					}
					break;			
				case "mostrar":
					System.out.println(car.mostrar());
					break;
				default:
					System.out.println("Comando inválido :/");
				

				}
	



			}

		}
	}
}
