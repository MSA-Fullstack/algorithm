class Solution {
    public long solution(long n) {
        long answer = 0;
        
        java.util.List<Integer> list = new java.util.ArrayList<>();
        
        //10으로 나누면서 각 자리수 나머지를 배열에 넣기
        while(n>0){
            list.add((int)n%10);
            n/=10;
        }
        
        //정렬
        list.sort(java.util.Collections.reverseOrder());
        //int 배열을 정수로 합하기
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<list.size();i++){
            sb.append(list.get(i));
        }
        answer = Long.parseLong(sb.toString());
        // System.out.print(answer);
        return answer;
    }
}