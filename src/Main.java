public class Main {
    public static void main(String[] args) {
        // Zadacha 1 //

        System.out.println("Задача 1");
        int purpose = 2459000;
        int sum = 0;
        int month = 0;
        while (sum < purpose){
            sum = sum + 15000;
            month ++;
        }
        System.out.println("Месяцев понадобится -- " + month + ". Сумма накоплений -- " + sum + " рублей");

        // Zadacha 2 //

        System.out.println("Задача 2");
        int i = 1;
        while (i < 11){

            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Zadacha 3 //

        System.out.println("Задача 3");
        int population = 12000000;
        int plus = 17;
        int minus = 8;
        int years = 10;
        while (years > 0){
            population = ((population / 1000) * plus - (population / 1000) * minus) + population;
            years--;
            System.out.println("Год " + (10 - years) + " численность населения состовляет" + population);
        }

        // Zadacha 4 //

        System.out.println("Задача 4");
        /*int percent = 7;
        double firstSum = 15000;
        int lastSum = 12000000;
        int period = 0;
        while (firstSum < lastSum){
            firstSum = firstSum + (firstSum * percent)/1000;
            period++;
            System.out.println("Месяц " + period + " Сумма накоплений -- " + firstSum);
        }

        // Zadacha 5 //

        System.out.println("Задача 5");
        int percent = 7;
        double firstSum = 15000;
        int lastSum = 12000000;
        int period = 0;
        while (firstSum < lastSum)
        {
            firstSum = firstSum + (firstSum * percent)/1000;
            period++;
            if (period % 6 == 0) {
                System.out.println("Месяц " + period + " Сумма накоплений -- " + firstSum);
            }
        }
         */
        // Zadacha 6 //

        System.out.println("Задача 6");
        int percent = 7;
        double firstSum = 15000;
        int lastSum = 12000000;
        int period = 0;
        while (firstSum < lastSum && period < 108)
        {
            firstSum = firstSum + (firstSum * percent)/1000;
            period++;
            if (period % 6 == 0) {
                System.out.println("Месяц " + period + " Сумма накоплений -- " + firstSum);
            }
        }

        // Zadacha 7 //

        System.out.println("Задача 7");
        int friday = 1;
        int days = 31;
        int count = 0;
        while (friday < days){
            if (count % 7 == 0){
                System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет");
            }
            count++;
            friday++;
        }

        // Zadacha 8 //

        System.out.println("Задача 8");
        int startYear = 0;
        int interval = 79;
        int today = 2020;
        while (startYear < (today+100)){

            if ((today - 200) < startYear ){
                System.out.println(startYear);
            }
            startYear = startYear + interval;
        }
        System.out.println();

    }
}