import java.io.*;
import java.util.*;

public class second_maximum_number {

    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," "); 
        int arr[] = new int[st.countTokens()];
        int ind = 0;
        while(st.hasMoreTokens())   arr[ind++] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        if(arr.length > 1)
            System.out.println(arr[arr.length - 2]);
        else
            System.out.println(arr[0]);
            
    }
}