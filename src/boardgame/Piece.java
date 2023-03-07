package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;    //Não faz construtor da posição pq ela tem que iniciar como nula, inicialmente.
	}

	protected Board getBoard() {  //protected pq somente classes do mesmo pacote 
		return board;				//e subclasses de peças podem acessar o tabuleiro de uma peça
	}
	
}

