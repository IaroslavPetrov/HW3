package com.company;

public class Main {

    public static void main(String[] args) {

        byte bananas = 5;
        short milk100g = 2;
        int iceCream = 2;
        long eggs = 4L;
        float a = 23.45f;
        double b = 32.12;

        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        float allWeightBoxer = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес боксеров " + allWeightBoxer + " кг");
        float deltaWeightBoxer = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница веса между боксерами " + deltaWeightBoxer + " кг");

        byte weightBanana = 80;
        byte weightMilk = 105;
        byte weghtIceCream = 100;
        byte weghtEggs = 70;
        int totalBananas = bananas * weightBanana;
        int totalMilk = milk100g * weightMilk;
        int totalIceCream = iceCream * weghtIceCream;
        long totalEggs = eggs * weghtEggs;
        long totalBrekfastWeght = totalBananas + totalMilk + totalIceCream + totalEggs;
        System.out.println("Вес завтрака " + totalBrekfastWeght + " г");
        long brekfastWeghtKg = totalBrekfastWeght / 1000;
        System.out.println("Вес завтрака " + brekfastWeghtKg + " кг");

        short totalWeghtLoss = 7000;
        short minWeghtLoss = 250;
        short maxWeghtLoss = 500;
        int maxDayLoss = totalWeghtLoss / minWeghtLoss;
        int minDayLoss = totalWeghtLoss / maxWeghtLoss;
        System.out.println("При потери 250 грамм в день спортсмен похудеет за " + maxDayLoss + " дней");
        System.out.println("При потери 500 грамм в день спортсмен похудеет за " + minDayLoss + " дней");
        int averageWeghtLoss = (maxDayLoss + minDayLoss) / 2;
        System.out.println("Средний срок похудения " + averageWeghtLoss + " день");

        int currentSalaryMary = 67760;
        int currentSalaryDenis = 83690;
        int currentSalaryChristy = 76230;
        double indexSalaryMary = currentSalaryMary * 0.1 + currentSalaryMary;
        double indexSalaryDenis = currentSalaryDenis * 0.1 + currentSalaryDenis;
        double indexSalaryChristy = currentSalaryChristy * 0.1 + currentSalaryChristy;
        double deltaSalaryMary = indexSalaryMary - currentSalaryMary;
        double deltaSalaryDenis = indexSalaryDenis - currentSalaryDenis;
        double deltaSalaryChristy = indexSalaryChristy - currentSalaryChristy;
        System.out.println("Маша теперь получает " + indexSalaryMary + " рублей. Годовой доход вырос на " + deltaSalaryMary + " рублей");
        System.out.println("Денис теперь получает " + indexSalaryDenis + " рублей. Годовой доход вырос на " + deltaSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + indexSalaryChristy + " рублей. Годовой доход вырос на " + deltaSalaryChristy + " рублей");

    }
}
