// 검증 로직을 구현 및 test
// 내 짝꿍을 위해서 자유롭게 본인이 선택
// 문제를 제시하고 짝꿍이 소스 완성하기
// 서로 크로스 검수
package step02_happy;

import java.util.Scanner;
import model.domain.Customer;

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
