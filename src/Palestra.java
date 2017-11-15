
public class Palestra {

	private String Titulo;
	private String Resumo;
	
	public Palestra(String Titulo, String Resumo){
		
		setTitulo(Titulo);
		setResumo(Resumo);
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getResumo() {
		return Resumo;
	}

	public void setResumo(String resumo) {
		Resumo = resumo;
	}
	
	
	
}
