package com.sparta.grr.final_example;

public class FinalConsumer extends FinalExample {

    private final int score = 70;

    @Override
    public int getScore(){
        return score;
    }

    public void setScore(int score){
        //this.score = score;
    }

}
