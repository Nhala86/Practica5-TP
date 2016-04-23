package es.ucm.fdi.tp.practica5.connectn;

import es.ucm.fdi.tp.basecode.bgame.control.Controller;
import es.ucm.fdi.tp.basecode.bgame.control.Player;
import es.ucm.fdi.tp.basecode.bgame.model.GameObserver;
import es.ucm.fdi.tp.basecode.bgame.model.Observable;
import es.ucm.fdi.tp.basecode.bgame.model.Piece;
import es.ucm.fdi.tp.practica5.view.RectBoardSwingView;

public class ConnectnSwingview extends RectBoardSwingView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ConnectnSwingPlayer player;

	public ConnectnSwingview(Observable<GameObserver> game, Controller c, Piece localPiece, Player randPlayer,
			Player aiPlayer) {
		super(game, c, localPiece, randPlayer, aiPlayer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void handelMouseClick(int row, int col, int clickcounter, int mouseButton) {
		if(this.inPlay && mouseButton == 1){
			player.setMoveValue(row, col);
			this.caseMakeManualMove(player);
		}
		
	}

}

