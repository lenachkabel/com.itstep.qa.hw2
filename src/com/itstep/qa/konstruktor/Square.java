package com.itstep.qa.konstruktor;

public class Square {
    private double L;

    public double getL() {
        return L;
    }
    public void setL(double l) {
        L = l;
    }
    public Square (double L){
        this.L = L;
    }
    public Square (){
        this.L=0;
    }
    public double getSquare(){
        return L*L;

    }
    public void vol(double N){
        this.L=L*Math.sqrt(N);
    }

}
