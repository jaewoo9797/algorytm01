package String.String11;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
/*        String answer = "";
        int count = 1;
        for (int i=0; i<str.length(); i++) {

            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                if(count == 1) {
                    answer += str.charAt(i);
                    count = 1;
                } else {
                    answer = answer + str.charAt(i) + count;
                    count = 1;
                }
            }

        }
        return answer;*/

        /*
        * 강의에서 푼 방식
        * */
        String answer = "";
        str+=" ";
        int cnt =1;
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                answer += str.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T  = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
