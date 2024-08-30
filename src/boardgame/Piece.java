package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Essa linha não precisa, pois o java por padrão coloca nulo
	}

	protected Board getBoard() {
		return board;
	}
}
