public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");

        byte ram = 16;
        short cpuFrequency = 2500;
        int memoryBandwidth = 34133;
        long hardDiskInBytes = 998_902_018_867L;
        float display = 15.60F;
        double hardDiskInTb = 0.9084960938D;
        char laptopMood = '\u263A';
        boolean bigDisplay = display > 17;
        System.out.println("RAM = " + ram + " GB\n" +
                "CPU Frequency = " + cpuFrequency + " MHz\n" +
                "Memory Bandwidth = " + memoryBandwidth + " MB/s\n" +
                "Hard Disk = " + hardDiskInBytes + " byte\n" +
                "Display = " + display + "\"\n" +
                "Hard Disk = " + hardDiskInTb + " TB\n" +
                "Laptop Mood = " + laptopMood +
                "\nBig display? = " + bigDisplay);

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int pen = 100;
        int book = 200;
        byte discount = 11;
        int sumWithoutDiscount = pen + book;
        int sumWithDiscount = sumWithoutDiscount - sumWithoutDiscount * discount / 100;

        System.out.println("i. Общая стоимость товаров без скидки = " + sumWithoutDiscount + " руб." +
                "\nii. Сумма скидки = " + discount + "%" +
                "\niii. Общая стоимость товаров со скидкой = " + sumWithDiscount + " руб.");

        System.out.println("\n3. Вывод слова JAVA");

        System.out.println("\n   J    a  v     v  a" +
                "\n   J   a a  v   v  a a" +
                "\nJ  J  aaaaa  V V  aaaaa" +
                "\n JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");

        byte byteMaxVal = 127;
        System.out.println("\nПервоначальное значение byte = " + byteMaxVal +
                "\nЗначение после инкремента на единицу = " + ++byteMaxVal +
                "\nЗначение после декремента на единицу = " + --byteMaxVal);

        short shortMaxVal = 32767;
        System.out.println("\nПервоначальное значение short = " + shortMaxVal +
                "\nЗначение после инкремента на единицу = " + ++shortMaxVal +
                "\nЗначение после декремента на единицу = " + --shortMaxVal);

        int intMaxVal = 2147483647;
        System.out.println("\nПервоначальное значение int = " + intMaxVal +
                "\nЗначение после инкремента на единицу = " + ++intMaxVal +
                "\nЗначение после декремента на единицу = " + --intMaxVal);

        long longMaxVal = 9223372036854775807L;
        System.out.println("\nПервоначальное значение long = " + longMaxVal +
                "\nЗначение после инкремента на единицу = " + ++longMaxVal +
                "\nЗначение после декремента на единицу = " + --longMaxVal);

        System.out.println("\n5. Перестановка значений переменных");

        int num1 = 2;
        int num2 = 5;
        System.out.println("\ni. с помощью третьей переменной" +
                "\nисходные значения" +
                "\nnum1 = " + num1 +
                "\nnum2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("новые значения" + "\nnum1 = " + num1 + "\nnum2 = " + num2);

        System.out.println("\nii. с помощью арифметических операций" +
                "\nисходные значения" +
                "\nnum1 = " + num1 +
                "\nnum2 = " + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новые значения" + "\nnum1 = " + num1 + "\nnum2 = " + num2);

        System.out.println("\niii. с помощью побитовой операции ^" +
                "\nисходные значения" +
                "\nnum1 = " + num1 +
                "\nnum2 = " + num2);

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("новые значения" + "\nnum1 = " + num1 + "\nnum2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");

        char sign1 = '#', sign2 = '&', sign3 = '@', sign4 = '^', sign5 = '_';
        System.out.println((int) sign1 + " " + sign1 + "\n" +
                (int) sign2 + " " + sign2 + "\n" +
                (int) sign3 + " " + sign3 + "\n" +
                (int) sign4 + " " + sign4 + "\n" +
                (int) sign5 + " " + sign5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backSlash = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("\n    " + slash + backSlash +
                "\n   " + slash + "  " + backSlash +
                "\n  " + slash + sign5 + leftBracket + " " + rightBracket + backSlash +
                "\n " + slash + "      " + backSlash +
                "\n" + slash + sign5 + sign5 + sign5 + sign5 +
                slash + backSlash + sign5 + sign5 + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");

        int threeDigitNumber = 123;
        int hundreds = threeDigitNumber / 100;
        int tens = threeDigitNumber % 100 / 10;
        int ones = threeDigitNumber % 100 % 10;
        int sumOfDigits = hundreds + tens + ones;
        int multiplicationOfDigits = hundreds * tens * ones;
        System.out.println("\nЧисло " + threeDigitNumber + " содержит:\n" +
                hundreds + " сотню\n" +
                tens + " десятка\n" +
                ones + " единицы\n" +
                "Сумма его цифр = " + sumOfDigits +
                "\nПроизведение = " + multiplicationOfDigits);

        System.out.println("\n9. Вывод времени");

        int secondQuantity = 86399;
        int hour = secondQuantity / 60 / 60;
        int minute = secondQuantity % 60;
        int second = secondQuantity / 60 % 60;
        System.out.println("ЧЧ:ММ:СС = " + hour + ":" + minute + ":" + second);

        System.out.println("my first push");
    }
}