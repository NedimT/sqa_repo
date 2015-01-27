package inheritence;

public class Entertain {
    public static void main(String args[]){
    	
    	Iphone iPhone = new Iphone();
    	GNexus gNexus = new GNexus();
    	int movieTimeLeft = 500;
    	int gameTimeLeft = 250;
    	while(movieTimeLeft >280) {
    		movieTimeLeft = iPhone.playMovie();
    		System.out.println("Iphone Playing Movie "+movieTimeLeft+" minutes of battery left");
    	}
    	while(gameTimeLeft > 99) {
    		gameTimeLeft = iPhone.playGame();
    		System.out.println("Iphone Playing Game "+gameTimeLeft+" minutes of battery left");
    	}
    	
    	movieTimeLeft = 500;
    	gameTimeLeft = 250;
    	while(movieTimeLeft >270) {
    		movieTimeLeft = gNexus.playMovie();
    		System.out.println("GNExus Playing Movie "+movieTimeLeft+" minutes of battery left");
    	}
    	while(gameTimeLeft > 89) {
    		gameTimeLeft = gNexus.playGame();
    		System.out.println("GNexus Playing Game "+gameTimeLeft+" minutes of battery left");
    	}
    	
    	
    }
}
