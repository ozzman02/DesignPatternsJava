package com.patterns.behavioral.strategy;

public class Chess {

    private ChessAlgorithm algorithm;

    public Chess(ChessAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public int calculateNextStep(){
        return algorithm.calculateNextStep();
    }

    public void setAlgorithm(ChessAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
}
