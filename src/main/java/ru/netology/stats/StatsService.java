package ru.netology.stats;

public class StatsService {


    public int sum(int[] purchaces) {

        int result = 0;

        for (int purchace : purchaces) {
            result += purchace;
        }

        return result;
    }

    public int average(int[] purchaces) {
        int sum = sum(purchaces);

        return sum / purchaces.length;

    }

    public int MonthWithMax(int[] purchaces) {

        int max = purchaces[0];
        for (int purchace : purchaces) {
            if (purchace > max) {
                max = purchace;
            }
        }

        int monthNumber = 0;
        int monthWithMax = 0;
        for (int purchace : purchaces) {
            monthNumber++;
            if (purchace == max) {
                monthWithMax = monthNumber;

            }

        }

        return monthWithMax;

    }

    public int MonthWithMin(int[] purchaces) {

        int min = purchaces[0];
        for (int purchace : purchaces) {
            if (purchace < min) {
                min = purchace;
            }
        }

        int monthNumber = 0;
        int monthWithMin = 0;
        for (int purchace : purchaces) {
            monthNumber++;
            if (purchace == min) {
                monthWithMin = monthNumber;

            }

        }

        return monthWithMin;

    }

    public int moreThenAverage(int[] purchaces) {
        int average = average(purchaces);

        int count = 0;

        for (int purchace : purchaces) {
            if (purchace > average) {
                count++;
            }
        }

        return count;

    }

    public int moreLessAverage(int[] purchaces) {
        int average = average(purchaces);

        int count = 0;

        for (int purchace : purchaces) {
            if (purchace < average) {
                count++;
            }


        }

        return count;
    }
}
