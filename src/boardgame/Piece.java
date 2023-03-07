package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;    //N�o faz construtor da posi��o pq ela tem que iniciar como nula, inicialmente.
	}

	protected Board getBoard() {  //protected pq somente classes do mesmo pacote 
		return board;				//e subclasses de pe�as podem acessar o tabuleiro de uma pe�a
	}
	
}

