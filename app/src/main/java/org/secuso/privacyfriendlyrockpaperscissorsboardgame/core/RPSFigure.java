package org.secuso.privacyfriendlyrockpaperscissorsboardgame.core;

import org.secuso.privacyfriendlyrockpaperscissorsboardgame.R;

import java.util.List;

/**
 * Created by David Giessing on 06.05.2016.
 * The RPSFigure Class represents the Entities participating on the board. Each RPSFigure has weaknesses of Type Figures against which it will loose a fight.
 */
public enum RPSFigure {

    ROCK(R.drawable.rock),
    PAPER(R.drawable.paper),
    SCISSOR(R.drawable.scissor),
    LIZARD(R.drawable.lizard),
    SPOCK(R.drawable.spock),
    FLAG(R.drawable.flag),
    GHOST(R.drawable.ghost);
    int imageID;
    private RPSFigure secretType;

    RPSFigure(int imageID) {
        this.imageID = imageID;
    }

    public int getImageResourceId() {
            return imageID;
    }

    public boolean getsBeatenBy(RPSFigure enemy){
        switch(this){
            case ROCK:
                return enemy==PAPER||enemy==SPOCK;
            case PAPER:
                return enemy==SCISSOR||enemy==LIZARD;
            case SCISSOR:
                return enemy==ROCK||enemy==SPOCK;
            case SPOCK:
                return enemy==PAPER||enemy==LIZARD;
            case LIZARD:
                return enemy==SCISSOR||enemy==ROCK;
            case FLAG:
                return true;
            default: return false;
        }
    }


}