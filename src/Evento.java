
public class Evento {
	
	
		private String dataEvento;
		private Palestra[] palestra;
		
		
		public String getDataEvento() {
			return dataEvento;
		}
		
		public  void setDataEvento(String dataEvento) {
			this.dataEvento = dataEvento;
		}

		public Evento (String dataEvento){
			
			setDataEvento(dataEvento);
			
		}

		public Palestra[] getPalestra() {
			return palestra;
		}

		public void setPalestra(Palestra[] palestra) {
			this.palestra = palestra;
		}

	

		
}
