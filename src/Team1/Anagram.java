package Team1;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "hello world my name jabbar is what";
       String str2[]=str1.split(" ");
        System.out.println(Arrays.toString(str2));
        System.out.println(isAnagram(str1));
    }

    private static ArrayList<Character> isAnagram(String str1) {
        ArrayList <Character> result=new ArrayList<>();
        Map<Character, Integer> map1 = createMap(str1);
        ArrayList<Character>characters=new ArrayList<>(map1.keySet());
        for (int i = 0; i <map1.size() ; i++) {
            if (map1.get(characters.get(i))==1){
                result.add(characters.get(i));
            }
        }
        return result;

    }

    private static Map<Character, Integer> createMap(String str1) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            if (result.containsKey(ch)) {
                result.replace(ch, result.get(ch) + 1);
            } else {
                result.put(ch, 1);
            }
        }
        return result;
    }
}
