package com.gabdev.greedyAlgorithm;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        int amount = 18;
        Integer[] coins = {5,2,1};

        int numCoins = giveChange(amount, coins);
        System.out.println(numCoins);
    }

    public static int giveChange(int value, Integer[] coins) {
        int numCoins = 0;

        for (int coin : coins) {
            while (value >= coin) {
                value -= coin;
                numCoins++;
                System.out.println("Used a " + coin + " cent. Remaining amount: " + value);
            }
        }

        return numCoins;
    }
}
