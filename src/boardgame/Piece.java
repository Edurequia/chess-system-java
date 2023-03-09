package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;    //N�o faz construtor da posi��o pq ela tem que iniciar como nula, inicialmente.
	}

	protected Board getBoard() {  //protected pq somente classes do mesmo pacote 
		return board;				//e subclasses de pe�as podem acessar o tabuleiro de uma pe�a
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

