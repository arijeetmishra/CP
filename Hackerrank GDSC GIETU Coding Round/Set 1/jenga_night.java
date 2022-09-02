import java.io.*;
import java.util.*;
public class jenga_night {

    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");    //String Input.. You can Find the explanation for this in Set 2 second_max_number.md file Side Note
            int arr[] = new int[st.countTokens()];
            int ind = 0;
            while(st.hasMoreTokens())   arr[ind++] = Integer.parseInt(st.nextToken());
            if(arr[1] % arr[0] == 0)
                System.out.printf("YES\n");
            else
                System.out.printf("NO\n");
        }
        
    }
}