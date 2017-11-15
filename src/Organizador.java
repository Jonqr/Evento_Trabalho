import java.util.Scanner;

public class Organizador {
	private static Participante[] participante = new Participante[10];
	private static Sala[] sala = new Sala[2];
	public static void ImportaArquivos(){
		
		 LeitorArquivoCSV leitor = new LeitorArquivoCSV();
		 
		 System.out.println("1 - add participante"+"/n"+"2 - add palestrante"+"/n"+"3- add palestra");
		 int escolha = new Scanner(System.in).nextInt();
		 if(escolha==1){leitor.addParticipante("Participantes.csv");}
		 if(escolha==2){leitor.addOPalestrante("Palestrante.csv");} 
		 if(escolha==3){leitor.addOPalestra("Palestra.Csv");}
	}
	
	public static void CriaEvento(){
		String data;
		System.out.println("Criando Evento.. Selecione a data");
		data = new Scanner(System.in).nextLine();
		if(data!=null){
		Evento evento = new Evento(data);
		}else{
			System.out.println("Evento com data nula, tente novamente");
			CriaEvento();
		}
	}
	
	
	public static void adicionaParticipantePalestra(){
		if(sala[escolheSala()].getPalestra()!= null && participante[escolheParticipante()].getNome()!=null){
		sala[escolheSala()].setParticipante(participante[escolheParticipante()]);
		escolheParticipante();
		}else{
			System.out.println("Erro");
			adicionaParticipantePalestra();
			
		}
		
	}
	private static int escolheSala(){
		
		System.out.println("Selecione a Palestra");
		for (int i = 0; i < participante.length; i++) {
			System.out.println("Palestra: "+sala[i].getPalestra() + "horario: "+sala[i].getHorario());
		}
		int escolhaSala = new Scanner(System.in).nextInt();
		
		return escolhaSala;
		
		
		
	}
	private static int escolheParticipante(){
		int escolhaParticipante =0;
		
				System.out.println("Selecione o participante que deseja adicionar na sala");
		for (int i = 0; i < participante.length; i++) {
			
			System.out.println(i+ " - Participante: "+participante[i].getNome()+"");
		}
		escolhaParticipante = new Scanner(System.in).nextInt();
		return escolhaParticipante;
		
		
	}

}
