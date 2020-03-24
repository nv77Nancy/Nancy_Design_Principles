package task7;

abstract class Game{
	abstract void initialize();  
    abstract void start();  
    abstract void end();  
   
    public final void play(){  
       initialize(); 
       start();
       end();  
    }  
}

class Chess extends Game{
	void initialize() {
		System.out.println("Set up Pieces.");
	}
	void start() {
		System.out.println("White will start the play.");
	}
	void end() {
		System.out.println("Either of king got checkmate.");
	}
}

//CounterStrike is a online competitive shooter game.

class CounterStrike extends Game{
	void initialize() {
		System.out.println("Starts the game client i.e. Steam");
	}
	void start() {
		System.out.println("Enter into a match and play.");
	}
	void end() {
		System.out.println("Either of team got a score of 16.");
	}
}

public class Template {
	public static void main(String[] args) {
		Chess chess = new Chess();
		CounterStrike cs = new CounterStrike();
		
		chess.play();
		System.out.println("\n");
		cs.play();
	}
}
