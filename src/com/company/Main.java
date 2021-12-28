package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double array[] = {1.5, -16.4,17.3,76.2,-33.8,88.8,-71.3,96.3,-12.3,-34.2,43.6,-12,4,11.6,-56.4,23.3};
        int i = 0;
        for (i = 0; i < array.length; i++) ;


        double result = 0;
        for (double d : array) {
            result += d;
        }
        for (i = 0; i < 1; i++) {
            double k = result - i;
            if (i < 0) {
                break;

            }
            System.out.println("arithmetic mean" + " " + (result + k) / array.length);
        }


        }

        }


