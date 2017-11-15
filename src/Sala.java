
public class Sala {

	private String horario;
	private Palestra palestra;
	private Participante participante;
	
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Palestra getPalestra() {
		return palestra;
	}
	public void setPalestra(Palestra palestra) {
		this.palestra = palestra;
	}
	public Participante getParticipante() {
		return participante;
	}
	public void setParticipante(Participante participante2) {
		this.participante = participante2;
	}
	
	public Sala (String horario, Palestra palestra) {
		
		this.horario = horario;
		this.palestra = palestra;
		
	}
	
	
	
}
