interface Animatable {
     public void animate();
}

class GameShape {
                   public void displayShape() {
                     System.out.println("displaying shape...GameShape");
                   }
				// more code 
}

class PlayerPiece extends GameShape implements Animatable {
     public void movePiece() {
       System.out.println("moving game piece");
     }
     public void animate() {
       System.out.println("animating...");
	}

	public void displayShape() {
                     System.out.println("displaying shape..Player Piece");
    }
	// more code 
}

public class TestShapes2 {
	public static void main (String[] args) {
		PlayerPiece player = new PlayerPiece();
        Object o = player;
        GameShape shape = player;
        Animatable mover = player; 
		player.displayShape();
		shape.displayShape();
		//shape.animate();
		//mover.movePiece();
		mover.animate();
	}
}
