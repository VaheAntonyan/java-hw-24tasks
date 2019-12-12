import model.Human;

public class FunctionManager {
    //2.1
    static int sum(int a, int b) {
        return a + b;
    }

    //2.2
    static double multiplication(double a, double b) {
        return a * b;
    }

    //2.3
    static void printFirstIsGreaterThanSecond(float a, float b) {
        System.out.println(a > b ? "Yes" : "No");
    }

    //2.4
    static void printGreatestNumber(long a, long b, long c) {
        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
    }

    //2.5
    static void printIsMale(Human h1) {
        System.out.println(h1.getGender() == 'm' ? "Yes" : "No");
    }

    //2.6
    static String getOldestLastname(Human h1, Human h2, Human h3) {
        Human oldest = h1.getYear() < h2.getYear() ? h1 : h2;
        oldest = oldest.getYear() < h3.getYear() ? oldest : h3;
        return oldest.getLastName();
    }

    //2.7
    static void printBothNames(Human h1, Human h2) {
        System.out.println(h1.getFirstName() + " " + h2.getFirstName());
    }

    //2.8
    static void printFirstnameOrLastname(boolean b, Human h1) {
        System.out.println(b ? h1.getFirstName() : h1.getLastName());
    }

    //2.9
    static int maxElement(int[] ints) {
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        return max;
    }

    //2.10
    static int minIndex(float[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int indexOfMinElement = 0;
        for (int index = 1; index < numbers.length; ++index) {
            if (numbers[indexOfMinElement] > numbers[index]) {
                indexOfMinElement = index;
            }
        }
        return indexOfMinElement;
    }

    //2.11
    static void printInfoByAscendingBornYear(Human[] humans) {
        for (int i = 0; i < humans.length - 1; i++) {
            for (int j = 0; j < humans.length - i - 1; j++) {
                if (humans[j].getYear() > humans[j + 1].getYear()) {
                    Human temp = humans[j + 1];
                    humans[j + 1] = humans[j];
                    humans[j] = temp;
                }
            }
        }
        for (Human h : humans) {
            h.printInfo();
        }
    }
}

