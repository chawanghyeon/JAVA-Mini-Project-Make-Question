// ���� ������ ���� �� test
// �� ¦���� ���ؼ� �����Ӱ� ������ ����
// ������ �����ϰ� ¦���� �ҽ� �ϼ��ϱ�
// ���� ũ�ν� �˼�
package step02_happy;

import java.util.Scanner;
import model.domain.Customer;

public class ValidationCheck {
	public static void nameCheck() {
		Customer c = new Customer("������", 20, "vip");
		Scanner scanner = new Scanner(System.in);
		int i;
		for(i = 0; i < 3; i++) {
			System.out.print("�̸��� �Զ��ϼ���: ");
			String s = scanner.next();
			if(c.getName().equals(s)) {
				System.out.println("��ȿ�� �̸��Դϴ�.");
				break;
			}else{
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���.");	
			}
		}
		if(i == 3) {
			System.out.println("3�� Ʋ�Ƚ��ϴ�.");	
		}
	}
	public static void main(String[] args) {
			nameCheck();
	}
}
