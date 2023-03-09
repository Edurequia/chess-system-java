package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;    //Não faz construtor da posição pq ela tem que iniciar como nula, inicialmente.
	}

	protected Board getBoard() {  //protected pq somente classes do mesmo pacote 
		return board;				//e subclasses de peças podem acessar o tabuleiro de uma peça
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMoves(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}

