package es.ucm.fdi.tp.practica5.ttt;

import es.ucm.fdi.tp.basecode.bgame.control.Controller;
import es.ucm.fdi.tp.basecode.bgame.control.Player;
import es.ucm.fdi.tp.basecode.bgame.model.GameObserver;
import es.ucm.fdi.tp.basecode.bgame.model.Observable;
import es.ucm.fdi.tp.basecode.bgame.model.Piece;
import es.ucm.fdi.tp.practica5.view.RectBoardSwingView;

public class TicTacToeSwingView extends RectBoardSwingView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	TicTacToeSwingPlayer player;
	
	
	public TicTacToeSwingView(Observable<GameObserver> game, Controller c, Piece localPiece, Player randPlayer,
			Player aiPlayer) {
		super(game, c, localPiece, randPlayer, aiPlayer);
		player = new TicTacToeSwingPlayer();
	}

	@Override
	protected void handelMouseClick(int row, int col, int clickcounter, int mouseButton) {
		if(this.inPlay){
			player.setMoveValue(row, col);
			this.caseMakeManualMove(player);
		}
		
	}

}
