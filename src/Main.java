public class Main {
    public static void main(String[] args) {
        int a = 245869;
        System.out.println("Значение переменной " + "a" + " с типом " + "int " + " равно " + a);
        byte s = 65;
        System.out.println("Значение переменной " + "s" + " с типом " + "byte " + " равно " + s);
        short k = 767 ;
        System.out.println("Значение переменной " + "k" + " с типом " + "short " + " равно " + k);
        long f = 849576494;
        System.out.println("Значение переменной " + "f" + " с типом " + "long " + " равно " + f);
        float g = 3.4f ;
        System.out.println("Значение переменной " + "g" + " с типом " + "float" + " равно " + g);
        double h =5.85958363;
        System.out.println("Значение переменной " + "h" + " с типом " + "double " + " равно " + h);

        float q = 27.12f;
        System.out.println(q);
        long w = 987678965549L;
        System.out.println(w);
        double e = 2.786;
        System.out.println(e);
        int member = 22;
        boolean seminarParticipant = member >= 23;
        System.out.println(seminarParticipant);
        short r = 569;
        System.out.println(r);
        int t = -159;
        System.out.println(t);

        byte lydmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int allStudents = lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper/allStudents + " листов бумаги" );

        byte bottle = 16;
        byte time = 2;
        int timeForOneBottle = bottle/time;
        int twentyminutes = 20;
        System.out.println("За 20 минут " + "машина произвела " + timeForOneBottle * twentyminutes + " штук" );
        int day = 1440;
        System.out.println("За сутки " + "машина произвела " + timeForOneBottle * day + " штук" );
        int threeDays = 4320;
        System.out.println("За 3 дня " + "машина произвела " + timeForOneBottle * threeDays + " штук" );
        int month = 43200;
        System.out.println("За 1 месяц " + "машина произвела " + timeForOneBottle * month + " штук" );

        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int numberOfClasses = allPaint / (whitePaint + brownPaint);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfClasses * 2 + " банок белой краски и " + numberOfClasses * 4 + " банок коричневой краски." );

        byte bananas = 5;
        byte oneBanana = 80;
        short milk = 200;
        byte oneMilk = 105;
        byte iceCream = 2;
        byte oneIceCream = 100;
        byte eggs = 4;
        byte omeEgg = 70;
        int breakfast = bananas * oneBanana + milk * oneMilk + iceCream * oneIceCream + eggs * omeEgg;
        System.out.println("Вес завтрака " +  breakfast + " грамм");
        int gr = 1000;
        System.out.println("Вес завтрака " + breakfast / gr + " кг");

        byte lossWeight = 7;
        short firstDiet = 250;
        System.out.println("При первом варианте понадобится " + lossWeight * 1000 / firstDiet + " дней");
        short secondDiet = 500;
        System.out.println("При втором варианте понадобится " + lossWeight * 1000 / secondDiet + " дней");

        int mashaSalary = 67760;
        float nMS = mashaSalary * 0.1f;
        float extraM = mashaSalary * (1 + 0.1f);
        System.out.println(" Маша теперь получает " + extraM  + " рублей." + " Годовой доход вырос на " + nMS + " рублей" );
        int denisSalary = 83690;
        float nDS = denisSalary * 0.1f;
        float extraD = denisSalary * (1 + 0.1f);
        System.out.println(" Денис теперь получает " + extraD + " рублей." + " Годовой доход вырос на " + nDS + " рублей" );
        int christinaSalary = 76230;
        float nCS = christinaSalary * 0.1f;
        float extraC = christinaSalary * (1 + 0.1f);
        System.out.println(" Кристина теперь получает " + extraC + " рублей." + " Годовой доход вырос на " + nCS + " рублей" );




    }
}