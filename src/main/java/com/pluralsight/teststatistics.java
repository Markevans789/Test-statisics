package com.pluralsight;

import java.util.Arrays;

class TestStatistics {
    public static void main(String[] args) {

        // Array of 10 test scores
        int[] testScores = {85, 92, 78, 95, 88, 73, 90, 84, 99, 81};

        int total = 0;
        int highScore = testScores[0];
        int lowScore = testScores[0];

        // Find total, high score, and low score
        for (int score : testScores) {
            total += score;

            if (score > highScore) {
                highScore = score;
            }

            if (score < lowScore) {
                lowScore = score;
            }
        }

        // Calculate average
        double average = (double) total / testScores.length;

        // Calculate median
        Arrays.sort(testScores);

        double median;
        median = (testScores[4] + testScores[5]) / 2.0;

        // Display statistics
        System.out.println("Average Score: " + average);
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);
        System.out.println("Median Score: " + median);
    }
}