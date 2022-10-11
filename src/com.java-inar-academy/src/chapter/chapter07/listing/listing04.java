package chapter.chapter07.listing;

public class listing04 {
    public static void main(String[] args) {
        char[] chars = createArray();
        System.out.println("The lower case letter are ");
        displayArray(chars);
        int[] counts=countletters(chars);


        System.out.println();
        System.out.println("The occurance of each lettter are");
        displayCounts(counts);


    }

    public static char[] createArray() {
        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = chapter.chapter06.listing.RandomCharacterlisting10.getRandomLowerCaseLetter();
        }
        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else
                System.out.print(chars[i] + " ");
        }
    }

    public static int[] countletters(char chars[]) {
        int[] counts = new int[26];

        for (int i = 0; i < counts.length; i++)
            counts[chars[i] - 'a']++;
        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            else
                System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
        }

    }

}
