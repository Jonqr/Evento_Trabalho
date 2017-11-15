
import java.io.FileWriter;
import java.util.Scanner;

public final class Certificado {

		
	public static void MontarCertificado(){
		
		
		selecionarCertificado();		
		if(selecionarCertificado()==1){	certificadoOrganizador("CertificadoOrganizador.csv");}
		//if(selecionarCertificado()==2){certificadoPalestrante("CertificadoPalestrante.csv");}
		if(selecionarCertificado()==3){certificadoParticipante("CertificadoPalestrante.Csv");}
		else{
			MontarCertificado();
		}
		
	}
	
	
	private static int selecionarCertificado(){
		System.out.println("Selecione o tipo de certificado"+"/n"+
				            "1 - Organizador "+"/n"+
				            "2 - Palestrante "+"/n"+
				            "3 - Participante"+"/n");
		int i = new Scanner(System.in).nextInt();
		return i;
	}
	
	private static void certificadoOrganizador(String certificado){
		
		Sala[] sala = null;
		
		Evento evento;
		
		try{
		FileWriter CertificadoNovo = new FileWriter(certificado);
		for (int j = 0; j < sala.length; j++) {
			CertificadoNovo.append("Certificado Organizador"+"/n");
			CertificadoNovo.append("Horario: " +sala[j].getHorario());
			CertificadoNovo.append("Palestra: "+sala[j].getPalestra());
			CertificadoNovo.append("Participantes: "+ sala[j].getParticipante());
		}
		CertificadoNovo.flush();
		CertificadoNovo.close();
		
		
		
		}catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
		}
	
	
	// aqui meu me perdi
	
	//private static void certificadoPalestrante(String certificado){
		
	
	//	Palestrante[] participante =new Palestrante[4];
		//Sala[] sala=null;
		
		//for (int i = 0; i < participante.length; i++) {
			
		//	if(sala[i].getParticipante().equals( P[i].getNome())){
				
			//	try{
			//	FileWriter CertificadoNovo = new FileWriter(certificado);
				
				
		//		CertificadoNovo.append("Certificado de Participação");
		//		CertificadoNovo.append("/n");
		///		CertificadoNovo.append("Participante: " + participante[i]);
	//			CertificadoNovo.append("/n");
		//		CertificadoNovo.append("Palestra: "+ sala[i].getPalestra());
		//		CertificadoNovo.append("/n");
			//	CertificadoNovo.append("Horario: "+sala[i].getHorario());
		//		CertificadoNovo.append("/n");
		//		CertificadoNovo.flush();
		//		CertificadoNovo.close();
				
		//		}catch (Exception e) {
		//			// TODO: handle exception
		//			e.printStackTrace();
		//		}
				
	//		}
			
	//	}
		
	//}
	private static void certificadoParticipante(String certificado){
		

		Participante[] participante =new Participante[10];
		Sala[] sala=null;
		
		for (int i = 0; i < participante.length; i++) {
			
			if(sala[i].getParticipante().equals( participante[i].getNome())){
				
				try{
				FileWriter CertificadoNovo = new FileWriter(certificado);
				
				
				CertificadoNovo.append("Certificado de Participação");
				CertificadoNovo.append("/n");
				CertificadoNovo.append("Participante: " + participante[i]);
				CertificadoNovo.append("/n");
				CertificadoNovo.append("Palestra: "+ sala[i].getPalestra());
				CertificadoNovo.append("/n");
				CertificadoNovo.append("Horario: "+sala[i].getHorario());
				CertificadoNovo.append("/n");
				CertificadoNovo.flush();
				CertificadoNovo.close();
				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
		}
	
	}
	
	
	
	
	
	
	
}
