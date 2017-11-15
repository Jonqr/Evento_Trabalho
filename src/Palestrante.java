import java.util.Scanner;

public class Palestrante {
	
	private String Curriculo;
	private String Email;
	private String Telefone;
	
	
	
	public void adicionarPalestra(){
		int a = 0,b=0;
		
		Sala[] sala = new Sala[2];
		Palestra [] palestra = new Palestra[4];
		
		while(b<sala.length){
			if(b<sala.length){
			System.out.println("Selecione a palestra");
			for(int i = 0; i<palestra.length;i++){System.out.println(i +" - "+ palestra[i].getTitulo());}
			a = new Scanner(System.in).nextInt();
			sala[b] = new Sala("horario",palestra[a]);
			b++;
			}
		}

	}
	
	

	public Palestrante(String Curriculo, String Email, String Telefone) {
		// TODO Auto-generated constructor stub
	
		this.setCurriculo(Curriculo);
		this.setEmail(Email);
		this.setTelefone(Telefone);

	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCurriculo() {
		return Curriculo;
	}

	public void setCurriculo(String curriculo) {
		Curriculo = curriculo;
	}
	
}
