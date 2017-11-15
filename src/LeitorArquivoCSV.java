import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class LeitorArquivoCSV {
	
	
	public static void addOPalestrante(String caminho){
		
		Palestrante [] palestrante = new Palestrante[3];

		int contador=0;
		try
		{
			FileReader arquivoCsv = new FileReader(caminho);
			String linhaCsv = new String();//Guarda linha do arquivo
			Scanner reader = new Scanner(arquivoCsv);	
			
			while(reader.hasNext()){
				linhaCsv = reader.nextLine();
				String [] separador = linhaCsv.split(","); // quebra a virgula 
					if(palestrante[contador]!=null){ 
					
						palestrante[contador] = new Palestrante(separador[0],separador[1],separador[2]);
					}
				arquivoCsv.close();
				}
				contador++;
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		contador = 0;
		
	}
	
	public static void addParticipante(String caminho){
		
		Participante[] participante= new Participante[10];
		
		int contador=0;
		try
		{
			
			FileReader arquivoCsv = new FileReader(caminho);
			String linhaCsv = new String();//Guarda linha do arquivo
			Scanner reader = new Scanner(arquivoCsv);	

			while(reader.hasNext()){
				linhaCsv = reader.nextLine();
				String [] separador = linhaCsv.split(","); // quebra a virgula 
				participante[contador] = new Participante(separador[0],separador[1]);
				contador++;
			}
			arquivoCsv.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		
		
	}

	public static void addOPalestra(String caminho){
		
		Palestra [] palestra = new Palestra[4];

		int contador=0;
		try
		{
			FileReader arquivoCsv = new FileReader(caminho);
			String linhaCsv = new String();//Guarda linha do arquivo
			Scanner reader = new Scanner(arquivoCsv);	
			
			while(reader.hasNext()){
				linhaCsv = reader.nextLine();
				String [] separador = linhaCsv.split(","); // quebra a virgula 
					if(palestra[contador]!=null){ 
					
						palestra[contador] = new Palestra(separador[0],separador[1]);
					}
				
				} arquivoCsv.close();
				contador++;
			
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		contador = 0;
		
	}
}

