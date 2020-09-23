package Quetion_2;

public class Instrument implements Piano,Guitar {
	
	@Override
	public void play() {
		
		//method of Piano interface
		Piano.super.play();
		
		
		//method of Guitar Interface
		Guitar.super.play();
	}

	public static void main(String[] args) {
	
		Instrument is=new Instrument();
		is.play();

	}



}
