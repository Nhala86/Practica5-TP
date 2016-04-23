package es.ucm.fdi.tp.practica5.connectn;

import es.ucm.fdi.tp.basecode.bgame.control.Controller;
import es.ucm.fdi.tp.basecode.bgame.control.Player;
import es.ucm.fdi.tp.basecode.bgame.model.GameObserver;
import es.ucm.fdi.tp.basecode.bgame.model.Observable;
import es.ucm.fdi.tp.basecode.bgame.model.Piece;
import es.ucm.fdi.tp.basecode.bgame.views.GenericConsoleView;
import es.ucm.fdi.tp.basecode.connectn.ConnectNFactory;

public class ConnectNFactoryExt extends ConnectNFactory {
	
	public ConnectNFactoryExt(){
		super();
	}
	
	public ConnectNFactoryExt(int dim){
		super(dim);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void createConsoleView(Observable<GameObserver> g, Controller c) {
		new GenericConsoleView(g, c);
	}

	@Override
	public void createSwingView(Observable<GameObserver> game, Controller ctrl, Piece viewPiece, Player randPlayer, Player aiPlayer) {
		throw new UnsupportedOperationException("There is no swing view");
	}


}
