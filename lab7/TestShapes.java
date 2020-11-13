package lab7;

class GameShape {
	public void displayShape() {
		System.out.println("exibindo forma");
	}
	// mais codigo
}
class TilePiece extends GameShape {
	public void getAdjacent() {
		System.out.println("obtendo partes adjacentes");
	}
	// mais codigo
}

class PlayerPiece extends GameShape {
	public void movePiece() {
		System.out.println("movimentando peca game");
	}
	// mais codigo
}

public class TestShapes {
	public static void main (String[] args) {
		PlayerPiece shape = new PlayerPiece();
		TilePiece tile = new TilePiece();
		shape.displayShape();
		tile.getAdjacent();
		doShapes(shape);
		doShapes(tile);
	}
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
}
