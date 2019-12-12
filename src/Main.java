public class Main {
    public static void main(String[] args) {
        //1.1
        String[] strings1 = {"Task", "number", "one"};
        for (String el : strings1) {
            System.out.println(el);
        }

        //1.2
        int[] ints2 = new int[10];

        //1.3
        int[] ints3 = new int[1000];
        for (int i = 0; i < ints3.length; ) {
            ints3[i] = ++i;
        }

        //1.4
        byte[] bytes4 = new byte[31];
        for (int i = 0; i < bytes4.length; i++) {
            bytes4[i] = (byte) (-30 + i * 2);
        }

        //1.5
        short[] shortArray5 = new short[150];
        for (int i = 0; i < shortArray5.length; i++) {
            shortArray5[i] = (short) (1 + i * 2);
        }

        //1.6
        int[] ints6 = new int[100];
        for (int i = 0; i < ints6.length; i++) {
            ints6[i] = i;
        }
        for (int el : ints6) {
            if (el % 5 == 0) {
                System.out.println(el);
            }
        }

        //1.7
        double[] doubles7 = new double[]{51.21, 1234.34, 6846.7, -20.4, 10.63};
        for (double el : doubles7) {
            if (el > 24.56) {
                System.out.println(el);
            }
        }

        //1.8
        float[] floats8 = new float[]{51.21f, 124.34f, 8.7f, 0.4f, -100.63f};
        for (float el : floats8) {
            if (el > 35.56 || el < -34.655) {
                System.out.println(el);
            }
        }

        //1.9
        double temp;
        double[] doubles9 = new double[]{51.21, 1234.34, 6846.7, -20.4, 10.63};
        //ascending order
        for (int i = 0; i < doubles9.length - 1; i++) {
            for (int j = 0; j < doubles9.length - i - 1; j++) {
                if (doubles9[j] > doubles9[j + 1]) {  // if (doubles9[j] < doubles9[j + 1]) {  //for descending order
                    temp = doubles9[j + 1];
                    doubles9[j + 1] = doubles9[j];
                    doubles9[j] = temp;
                }
            }
        }

        //1.10
        int count10 = 0;
        String text = "Just one letter a in this sentence.";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count10++;
            }
        }
        System.out.println(count10);

        //1.11
        boolean bInText = false;
        String text11 = "Armenian alphabet was invented in AD 405 by Mesrop Mashtots.";
        for (int i = 0; i < text11.length(); i++) {
            if (text11.charAt(i) == 'b') {
                bInText = true;
                break;
            }
        }
        System.out.println(bInText ? "Yes" : "No");

        //1.12
        int[] intArray12 = {2, 11, -74, 16, 65, 36, 95, 256, 1};
        int count12 = 0;
        for (int value : intArray12) {
            if (value > 0 && (value & value - 1) == 0) {
                count12++;
            }
        }
        System.out.println(count12);
    }
}
