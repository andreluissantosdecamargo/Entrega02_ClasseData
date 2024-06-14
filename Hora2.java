
public class Hora2 {
	private int hour;
	private int minute;
	private int second;
	
	public Hora2(){
		this(0,0,0);
	}
	
	public Hora2(int hour){
		this(hour,0,0);
	}
	
	public Hora2(int hour, int minute){
		this(hour,minute,0);
	}
	
	public Hora2(int hour, int minute, int second){

		if (hour < 0 || hour >= 24)
		throw new IllegalArgumentException("hora deve ser 0-23");
	
		if (minute < 0 || minute >= 60)
		throw new IllegalArgumentException("minuto deve ser 0-59");
		
		if (second < 0 || second >= 60)
		throw new IllegalArgumentException("o segundo deve ser 0-59");
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;

	
	}
	
	// Construtor Time2: outro objeto Time2 fornecido
	public Hora2(Hora2 hora){
	// invoca o construtor com três argumentos ÿ
	 this(hora.getHour(), hora.getMinute(), hora.getSecond());
	}
	// Métodos set
	// Configura um novo valor de tempo usando hora universal;
	// valida os dados
	public void setTime(int hour, int minute, int second){
	 if (hour < 0 || hour >= 24)
	 throw new IllegalArgumentException("hour must be 0-23");
	
	 if (minute < 0 || minute >= 60)
	 throw new IllegalArgumentException("minute must be 0-59");
	
	 if (second < 0 || second >= 60)
	 throw new IllegalArgumentException("second must be 0-59");
	
	 this.hour = hour;
	 this.minute = minute;
	 this.second = second;
	}
	
	// valida e configura a horas
	public void setHour(int hour){
	 if (hour < 0 || hour >= 24)
	 throw new IllegalArgumentException("hour must be 0-23");
	
	 this.hour = hour;
	}
	// valida e configura o minutos
	public void setMinute(int minute){
		 
     if (minute < 0 || minute >= 60)
        throw new IllegalArgumentException("minute must be 0-59");
	    this.minute = minute;
	}
	 
	// valida e configura os segundos
    public void setSecond(int second){
	  if (second < 0 || second >= 60)
	  throw new IllegalArgumentException("second must be 0-59");
	 	  this.second = second;
	}
    // Métodos get
    // obtém valor da hora
    public int getHour(){
     return hour;
    }
    //obtém o valor dos minutos
    public int getMinute(){
        return minute;
    }
    
    public int getSecond(){
        return second;
    }
    
    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString(){
     return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString(){
     return String.format("%d:%02d:%02d %s",
     ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
    // fim da classe Time2
    
    
}
