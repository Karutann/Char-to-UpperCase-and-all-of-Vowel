import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ll = new Scanner(System.in);
        ArrayList<Character> akson = new ArrayList<>();
        int vowel = 0;
        while (true){
            char ch = ll.next().charAt(0);
            if (ch == 'q'){
                break;
            }
            akson.add(ch);
            if ("aeiou".indexOf(ch)>=0){
                vowel++;
            }
        }
        for (char c : akson) {
            System.out.println(Character.toUpperCase(c));
        }
        System.out.println(vowel);
    }
}
