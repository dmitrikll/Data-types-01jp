public class HomeWorkApp {

    public static void main(String[] args) {

        HomeWorkApp main = new HomeWorkApp();

        main.printThreeWords();
        main.checkSumSign();
        main.printColor();
        main.compareNumbers();

        boolean sumInRangeNum = main.isSumInRangeNum(2, 7);
        System.out.println(sumInRangeNum);

        String numTypeWord = main.printTypeNum(5);
        System.out.println(numTypeWord);

        boolean numTypeSign = main.checkTypeNum(-1);
        System.out.println(numTypeSign);

        main.printMessageCount("Your message", 3);

        boolean leapYear = main.checkLeapYear(2021);
        System.out.println(leapYear);
    }

    private void printThreeWords() {
        System.out.println("Orange\n\nBanana\n\nApple\n");
    }

    private void checkSumSign() {
        int a = 21;
        int b = -13;

        if ((a + b) >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    private void printColor() {
        int value = 122;

        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }

    private void compareNumbers() {
        int a = 400;
        int b = 700;

        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a >= b");
        }
    }

    private boolean isSumInRangeNum(int num1, int num2) {
        return (num1 + num2) >= 10 && (num1 + num2) <= 20;
    }

    private String printTypeNum(int num) {
        if (num < 0) {
            return "від’ємне число";
        } else {
            return "додатнє число";
        }
    }

    private boolean checkTypeNum(int num) {
        return num < 0;
    }

    private void printMessageCount(String message, int count) {
        for (int i = 0; i < count; i += 1) {
            System.out.println(message);
        }
    }

    private boolean checkLeapYear(int year) {
        boolean check;

        check = (year % 4 == 0)
                &&
                (year % 100 != 0)
                ||
                (year % 400 == 0);

        return check;
    }
}
