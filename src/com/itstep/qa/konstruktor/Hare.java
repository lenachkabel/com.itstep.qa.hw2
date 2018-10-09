package com.itstep.qa.konstruktor;

public class Hare {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int g;
    private int z1;
    private int z2;

    public Hare (int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    public Hare (int y1, int y2, int g){
        this.y1 = y1;
        this.y2 = y2;
        this.g = g;
    }
    public void setg (){
        z1 = x1+y1;
        z2 = x2+y2;
    }
    public void teleportatcia(int z1, int z2){


    }


}

