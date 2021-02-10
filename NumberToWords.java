public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int digitValue = 0;

            if(number > reverse(number)) {
                digitValue = getDigitCount(number) - (getDigitCount(reverse(number)));
            }
            number = reverse(number);
            getDigitCount(number);
            int x = 0;
            String stringNumber = "";
            do {
                if (number >= 10) {
                    x = (number % 10);
                } else if (number <= -10) {
                    x = (number % 10);
                } else {
                    x = number;
                }
                switch (x) {
                    case 1:
                    case -1:
                        stringNumber = "One";
                        break;
                    case 2:
                    case -2:
                        stringNumber = "Two";
                        break;
                    case 3:
                    case -3:
                        stringNumber = "Three";
                        break;
                    case 4:
                    case -4:
                        stringNumber = "Four";
                        break;
                    case 5:
                    case -5:
                        stringNumber = "Five";
                        break;
                    case 6:
                    case -6:
                        stringNumber = "Six";
                        break;
                    case 7:
                    case -7:
                        stringNumber = "Seven";
                        break;
                    case 8:
                    case -8:
                        stringNumber = "Eight";
                        break;
                    case 9:
                    case -9:
                        stringNumber = "Nine";
                        break;
                    case 0:
                        stringNumber = "Zero";
                        break;
                }
                System.out.println(stringNumber);
                number /= 10;
            } while (number != 0);

            if(digitValue > 0){
                for(int i = 0; i < digitValue; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int x = 0;
        while (number != 0) {
            if (number >= 10) {
                x = (number % 10) + (x * 10);
            } else if (number <= -10) {
                x = (number % 10) + (x * 10);
            } else {
                x = number + (x * 10);
            }
            number /= 10;
        }
        return x;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int x = 0;
        while(number > 0) {
            x++;
            number /= 10;
        }
        return x;
    }
}