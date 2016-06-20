package org.secuso.privacyfriendlyrockpaperscissorsboardgame.core;

/**
 * Created by david on 14.06.2016.
 */
public class RPSGameFigure {

    RPSFigure type;
    boolean hidden;
    int owner;

    public RPSGameFigure(int owner, RPSFigure type){
        this.owner=owner;
        this.type=type;
        this.hidden=true;
    }

    public boolean isHidden() {
        return hidden;
    }

    public RPSFigure discover(){
        this.hidden=false;
        return this.type;
    }

    public RPSFigure getType(){
        return this.type;
    }

    public int getOwner() {
        return owner;
    }

    public String toString(){
        String result;
        result=""+type;
        result+=hidden?"Versteckt":"offen";
        return result;
    }
}