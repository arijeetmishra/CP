import java.io.*;
import java.util.*;

public class play_with_strings {

    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String S = bf.readLine(), word = "", r_word = "";
        S += " ";   //to apply my logic
        for(int i = 0; i < S.length(); ++i)
            if(S.charAt(i) == ' ') {
                if(word.length() % 2 == 0)
                    System.out.print(word + " ");
                else {
                    r_word = "";
                    for(int j = 0; j < word.length(); ++j)
                        r_word = word.charAt(j) + r_word;
                    System.out.print(r_word + " ");
                }
                word = "";
            }
            else
                word += S.charAt(i);
    }
}