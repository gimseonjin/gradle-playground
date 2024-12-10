/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        double[] value = {1.2, 2.4, 3.6, 4.8, 6.0};

        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

        for (double v : value) {
            descriptiveStatistics.addValue(v);
        }

        double mean = descriptiveStatistics.getMean();
        double variance = descriptiveStatistics.getVariance();

        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
    }
}
