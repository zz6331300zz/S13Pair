import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pair1 {

    public static void main(String[] args) {

        int n = 10;

        String[] strArr = String.valueOf(n).split("");
        int sum = 0;
        for(int i=0;i<strArr.length;i++){
            sum += Integer.parseInt(strArr[i]);
        }
        boolean answer = false;
        if(n%sum==0){
            answer = true;
        }
        System.out.println(answer);
    }

}