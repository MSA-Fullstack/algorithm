class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        
        int pNum = 0;
        int yNum = 0;
        for(int i = 0;i<arr.length;i++){
            String str = String.valueOf(arr[i]);
            if(str.toLowerCase().equals("p")){
                pNum++;
            }
            if(str.toLowerCase().equals("y")){
                yNum++;
            }
        }
        if(pNum == 0 && yNum == 0){
            answer = true;
        }else if(pNum == yNum){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}