import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);
        System.out.println("sim " + sim.simulate());

        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        System.out.println(exampleOne.numMatches() + " e1");

        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        System.out.println(exampleTwo.numMatches());

        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println(exampleThree.numMatches() + "e3");


        StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        System.out.println(sc1.isValid("happy"));
        System.out.println(sc1.isValid("happy$"));
        System.out.println(sc1.isValid("Code"));
        System.out.println(sc1.isValid("happyCode"));

        StringChecker sc2 = new CodeWordChecker("pass");
        System.out.println(sc2.isValid("MyPass"));
        System.out.println(sc2.isValid("Mypassport"));
        System.out.println(sc2.isValid("happy"));
        System.out.println(sc2.isValid("1,000,000,000,000,000"));

        int[][] arr2D = {{0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {9, 5, 3}};

        int[] result = ArrayTester.getColumn(arr2D, 1);
        System.out.println(Arrays.toString(result));

        int[][] Latin1 = {{1, 2, 3},
                {2, 3, 1},
                {3, 1, 2}};

        int[][] Latin2 = {{10, 30, 20, 0},
                {0, 20, 30, 10},
                {30, 0, 10, 20},
                {20, 10, 0, 30}};

        int[][] notLatin1 = {{1, 2, 1},
                {2, 1, 1},
                {1, 1, 2}};

        int[][] notLatin2 = {{1, 2, 3},
                {3, 1, 2},
                {7, 8, 9}};

        int[][] notLatin3 = {{1, 2,},
                {1, 2}};

        System.out.println(ArrayTester.isLatin(Latin1));
        System.out.println(ArrayTester.isLatin(Latin2));
        System.out.println(ArrayTester.isLatin(notLatin1));
        System.out.println(ArrayTester.isLatin(notLatin2));
        System.out.println(ArrayTester.isLatin(notLatin3));



    }

}