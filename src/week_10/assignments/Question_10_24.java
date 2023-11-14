package week_10.assignments;

public class Question_10_24 {
    public static void main(String[] args) {
        Character character1 = 'C';
        System.out.println(character1.compareTo('z'));
        Character character2 = '5';
        String str = character2.toString();
        Character character3 = 'C';
        System.out.println(character3.equals(character1));

        Character charactera = 'a';
        System.out.println(charactera);

        Character characterz = 'z';
        System.out.println(characterz);

        System.out.println(charactera.compareTo(characterz));

        System.out.println(charactera.compareTo('a'));

        char ch = 'Y';
        System.out.println(characterz.compareTo(ch));

        System.out.println(charactera.equals(ch));

        char[] chars = "javaaaaaa".toCharArray();

        for (char ch1 : chars) {
            System.out.print(ch1 + " ");

        }
        System.out.println();
        char[] char1 = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = "123456";

        s.getChars(2, 5, char1, 3);

        for (char a : char1) {
            System.out.print(a + " ");
        }
        System.out.println();
        String emir = String.valueOf(1235);
        System.out.println(emir);

    }
}
