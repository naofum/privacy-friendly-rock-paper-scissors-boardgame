package org.secuso.privacyfriendlyrockpaperscissorsboardgame.core;

/**
 * Created by David Giessing on 07.05.2016.
 */
public class GameState {
    /**
     * The Game Pane as follows. The y Axis 0,1 are the start of player 0. The Y axis 6 and 7  are player 1s starting poistions.
     */
    private RPSGameFigure[][] gamePane;
    private IPlayer[] players;
    private int playerOnTurn;

    public GameState(int x, int y,IPlayer p0, IPlayer p1){
        players= new IPlayer[2];
        players[0]=p0;
        players[1]=p1;
        gamePane= new RPSGameFigure[x][y];
    }

    public void setGamePane(RPSGameFigure[][] gamePane){
        if(gamePane.length!=this.gamePane.length||gamePane[0].length!=this.gamePane[0].length)
            throw new IllegalArgumentException("Could not set GamePane sizes as they are incompatible\n");
        else
            this.gamePane=gamePane;

    }
    public int[] getPlayerIds(){
        int[] result = new int[players.length];
        for(int i = 0; i<players.length;i++){
            result[i]= players[i].getId();
        }
        return result;

    }

    public RPSGameFigure[][] getGamePane() {
        return gamePane;
    }
}
