# JAVA-Mini-Project-Make-Question

## 문제
유효성 검사를 최대 3번 할 수 있다. 3번 안에 하면 '유효한 아이디 입니다.' 출력 3번 넘으면 '3번 틀렸습니다.' 출력

## problem
Validation can be done up to 3 times. If it's within three times, it's a valid ID. If it's over three times, it's 'wrong three times.'

Answer
```
public class ValidationCheck {
	public static void nameCheck() {
		Customer c = new Customer("차왕현", 20, "vip");
		Scanner scanner = new Scanner(System.in);
		int i;
		for(i = 0; i < 3; i++) {
			System.out.print("이름을 입락하세요: ");
			String s = scanner.next();
			if(c.getName().equals(s)) {
				System.out.println("유효한 이름입니다.");
				break;
			}else{
				System.out.println("틀렸습니다. 다시 입력하세요.");	
			}
		}
		if(i == 3) {
			System.out.println("3번 틀렸습니다.");	
		}
	}
	public static void main(String[] args) {
			nameCheck();
	}
}
```
