package com.patterns.behavioral.strategy;

public class Client {

    public static void main(String[] args) {

        Chess chess = new Chess(new EasyChessAlgorithm());
        System.out.println("Calculate next step: " + chess.calculateNextStep());

        chess.setAlgorithm(new MediumChessAlgorithm());
        System.out.println("Calculate next step: " + chess.calculateNextStep());

        chess.setAlgorithm(new HardChessAlgorithm());
        System.out.println("Calculate next step: " + chess.calculateNextStep());

    }
}
