package es.ucm.fdi.tp.practica5.ataxx;

import java.util.List;

import es.ucm.fdi.tp.basecode.bgame.control.Player;
import es.ucm.fdi.tp.basecode.bgame.model.Board;
import es.ucm.fdi.tp.basecode.bgame.model.GameMove;
import es.ucm.fdi.tp.basecode.bgame.model.GameRules;
import es.ucm.fdi.tp.basecode.bgame.model.Piece;
import es.ucm.fdi.tp.practica4.ataxx.AtaxxMove;

public class AtaxxSwingPlayer extends Player {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The row where the piece is return return by {@link GameMove#getPiece()}.
	 * <p>
	 * Fila en la que se encuentra la ficha devuelta por
	 * {@link GameMove#getPiece()}.
	 */
	private int originRow;

	/**
	 * The column where the piece is return by {@link GameMove#getPiece()}
	 * .
	 * <p>
	 * Columna en la que se encuentra la ficha devuelta por
	 * {@link GameMove#getPiece()}.
	 */
	private int originCol;
	/**
	 * The row where to place the piece return by {@link GameMove#getPiece()}.
	 * <p>
	 * Fila en la que se coloca la ficha devuelta por
	 * {@link GameMove#getPiece()}.
	 */
	private int destinyRow;

	/**
	 * The column where to place the piece return by {@link GameMove#getPiece()}
	 * .
	 * <p>
	 * Columna en la que se coloca la ficha devuelta por
	 * {@link GameMove#getPiece()}.
	 */
	private int destinyCol;
	

	public AtaxxSwingPlayer() {
		
	}

	
	public void setMoveValue(int originRow, int originCol, int destinyRow, int destinyCol){
		this.originRow = originRow;
		this.originCol = originCol;
		this.destinyCol = destinyCol;
		this.destinyRow = destinyRow;
	}
	
	@Override
	public GameMove requestMove(Piece p, Board board, List<Piece> pieces, GameRules rules) {
		return this.GameCreateMove(this.originRow, this.originCol, this.destinyRow, this.destinyCol, p);
	}
	
	protected GameMove GameCreateMove(int originRow, int originCol, int destinyRow, int destinyCol, Piece p){
		return new AtaxxMove(originRow, originCol, destinyRow, destinyCol, p) ;
	}

	

}
