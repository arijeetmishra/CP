import java.io.*;
import java.util.*;

public class most_common_word {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int ind = 0, l = st.countTokens(), ct, max = -1;
        String ans="";
        String arr[] = new String[l];
        boolean visited[] = new boolean[l];
        while(st.hasMoreTokens())   arr[ind++] = st.nextToken();
        for(int i = 0; i < l; ++i) {
            ct = 0;
            for(int j = 0; j < l; ++j)
                if(!visited[j] && arr[i].equals(arr[j])){
                    ct++;
                    visited[j] = true;
                }
            if(ct > max){
                max = ct;
                ans = arr[i];
            }
        }
        System.out.println(ans);
        
    }
}