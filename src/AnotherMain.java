import model.Human;

public class AnotherMain {
    public static void main(String[] args) {
        Human firstHuman = new Human("Vahan", "Martirosyan ", 1998, 'm');
        Human secondHuman = new Human("Arman", "Sahakyan ", 1997, 'm');
        Human thirdHuman = new Human("Anna", "Petrosyan", 2000, 'f');
        Human forthHuman = new Human("Lala", "Andreasyan ", 1995, 'f');
        Human[] humans = {firstHuman, secondHuman, thirdHuman, forthHuman};

        FunctionManager manager = new FunctionManager();

        //2.12

        //2.1
        System.out.println(manager.sum(5, 6));

        //2.2
        System.out.println(manager.multiplication(2.3, 8.1));

        //2.3
        manager.printFirstIsGreaterThanSecond(3.5f, 4.6f);

        //2.4
        manager.printGreatestNumber(798202l, 3321156l, 3646543l);

        //2.5
        manager.printIsMale(firstHuman);

        //2.6
        System.out.println(manager.getOldestLastname(firstHuman, secondHuman, thirdHuman));

        //2.7
        manager.printBothNames(firstHuman, secondHuman);

        //2.8
        manager.printFirstnameOrLastname(true, firstHuman);

        //2.9
        System.out.println(manager.maxElement(new int[]{2, 5, 6, -98, 708, 654, 657, 24,}));

        //2.10
        System.out.println(manager.minIndex(new float[]{1.2f, 12f, 72.3f, -23.9f, -7.23f}));

        //2.11
        manager.printInfoByAscendingBornYear(humans);
    }
}
