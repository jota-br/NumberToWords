public class NumberToWords {
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        
        int digitCount = getDigitCount(number);
        int reverseNumber = reverse(number);
        int leadingZeroes = digitCount - getDigitCount(reverseNumber);
        
        while (reverseNumber != 0) {
            switch (reverseNumber % 10) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            };
            reverseNumber /= 10;
        }
        
        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
        
    }
    
    public static int reverse (int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse;
    }
    
    public static int getDigitCount (int number) {
        int digitCount = 0;
        
        if (number < 0) {
            return -1;
        }
        
        if (number == 0) {
            return 1;
        }
        
        for (int i = 1; i <= number; i *= 10) {
            digitCount++;
        }
        return digitCount;
    }
}
