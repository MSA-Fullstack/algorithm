class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a<b){
            while(a<=b){
                answer += a;
                a++;
            }
        }else if(a==b){
            answer = a;
        }else{
            while(a>=b){
                answer += b;
                b++;
            }
        }


        return answer;
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/12912