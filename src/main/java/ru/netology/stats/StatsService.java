package ru.netology.stats;

//public class StatsService {
//
//    public int calculateSum(int[] sales) {
//        int sum = 0;
//        for (int sale : sales) {
//            sum += sale;
//        }
//        return sum;
//    }
//
//    public int findAvg(int[] sales) {
//        return calculateSum(sales) / sales.length;
//    }
//
//    public int soldMaximum(int[] sales) { //продал максимум
//        int currentMaх = 0; //текущий максимум
//        int month = 0;
//        for (int sale : sales) {
//            if (sale >= currentMaх) {
//                currentMaх = month;
//            }
//            month += 1;
//        }
//        return currentMaх + 1;
//    }
//
//}

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) { //найти средне значение
        return calculateSum(sales) / sales.length;
    }

    public int soldMaximum(int[] sales) { //продал максимум
        int currentMaх = sales[0]; //текущий максимум продаж
        int currentMaxMonth = 0; // текущий максимальный месяц
        int month = 0;
        for (int sale : sales) {
            if (sale >= currentMaх) {
                currentMaх = sale;
                currentMaxMonth = month + 1;
            }
            month += 1;
        }
        return currentMaxMonth;
    }


    public int soldMinimum(int[] sales) { //продал минимум
        int currentMin = sales[0]; //текущий минимум продаж
        int currentMaxMonth = 0; // текущий максимальный месяц
        int month = 0;
        for (int sale : sales) {
            if (sale <= currentMin) {
                currentMin = sale;
                currentMaxMonth = month + 1;
            }
            month += 1;
        }
        return currentMaxMonth;
    }

    public int calculateSalesBelowAvg(int[] sales) { //подсчитать продажи ниже среднего
        int counter = 0;
        for (int sale : sales) {
            if (sale < findAvg(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int calculateSalesHigherAvg(int[] sales) { //подсчитать продажи выше среднего
        int counter = 0;
        for (int sale : sales) {
            if (sale > findAvg(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
