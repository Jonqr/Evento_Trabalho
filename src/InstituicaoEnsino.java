import java.util.Scanner;

public class InstituicaoEnsino {

	private static Organizador organizador = new Organizador();
	private static Certificado certificado = new Certificado();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		menu();
	}
	
	private static void menu(){
		
	while(true){
			
			selecionaUsuario();
			if(selecionaUsuario()==1){
				UserOrganizador();
			}
			if(selecionaUsuario()==2){
				UserPalestrante();
			}
				
			
			}
		}
		
private static int selecionaUsuario(){
		
		System.out.println("Selecione o tipo de usuario"+"/n"
				+"1 - Organizador.."+"/n"
				+"3 - Palestrante.."
				);
		int escolha = new Scanner(System.in).nextInt();
		
		return escolha;
		
	}
	
	private static void UserOrganizador(){
		
		System.out.println("1 - importar arquivos"+"/n"+
						   "2 - criar evento"+ "/n"+
				 		   "3- adicionar Participante"+"/n"+
						   "4 - Certificado;");
				int escolha = new Scanner(System.in).nextInt();
				
				if(escolha==1){organizador.ImportaArquivos();}
				if(escolha==2){organizador.CriaEvento();}
				if(escolha==3){organizador.adicionaParticipantePalestra();}
				if(escolha==4){certificado.MontarCertificado();}
				else{menu();}
		
	}
	
	private static void UserPalestrante(){
		
		Palestrante [] palestrante = new Palestrante[4];
		System.out.println("Adicionar Palestra, selecione o palestrante");
		for (int i = 0; i < palestrante.length; i++) {
			palestrante[i].getEmail();
		}
		int op = new Scanner(System.in).nextInt();
		
		palestrante[op].adicionarPalestra();
		menu();
		
	}
	
	
	
	
	

}
