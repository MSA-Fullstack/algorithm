import java.util.Scanner;
class Solution {
public static int solution(String s) {
int answer=1;
if(s.charAt(0)=='-') {
System.out.print('-');
for(int i=1; i<s.length(); i++) {
System.out.print(s.charAt(i));
answer=s.charAt(i);
}

```
	}else {

		for(int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
		}

	}

	return answer;
}

public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	String s = sn.nextLine();

	solution(s);
}

```

}

 
