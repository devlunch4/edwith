import java.util.Scanner;

public class findnumbergameif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이 클래스는 연습하기 위한 클래스입니다. 언제든 막 사용해도 좋습니다
		 */

		/*
		 * 컴퓨터가 환산한 숫자 찾기
		 * 5개의 숫자 중 랜덤을 컴퓨터가 돌림
		 * 5 초과한 값이 선택되면 게임 끝
		 * 5 이상 값이면 사용자에게 첫번째 기회로 입력 숫자 요구
		 * 틀리면 입력 그 숫자가 높은지 낮은지 힌트를 주고 마지막 기회를 줌 
		 * 마지막 입력 후 최종 입력 값에 맞추어 답을 환산
		 */

		Scanner sc = new Scanner(System.in);

		int x = (int) (Math.random() * 10 + 1);
		if (x <= 5) {
			System.out.println("5 이하의 랜덤 수가 확정 되었습니다");
			System.out.println("5 이하 중 숫자를 입력해주세요");
			int y = Integer.parseInt(sc.nextLine());
			if (x == y) {
				System.out.println("한번에 입력값을 맞추었습니다. 랜덤값은 " + x + "입니다");
			} else if (x > y) {
				System.out.println("랜덤값이 입력값보다 큽니다. 한번더 입력하세요");
				y = Integer.parseInt(sc.nextLine());
				if (x == y) {
					System.out.println("두 번만에 입력값을 맞추었습니다. 랜덤값은 " + x + "입니다");

				} else {
					System.out.println("두 번의 기회 날아갔습니다. 랜덤값은 " + x + "입니다");
				}
			} else if (x < y) {
				System.out.println("랜덤값이 입력값보다 작습니다. 한번더 입력하세요");
				y = Integer.parseInt(sc.nextLine());
				if (x == y) {
					System.out.println("두 번만에 입력값을 맞추었습니다. 랜덤값은 " + x + "입니다");

				} else {
					System.out.println("두 번의 기회 날아갔습니다. 랜덤값은 " + x + "입니다");
				}
			}
		} else
			System.out.println("랜덤값 비선정 꽝입니다. 랜덤값은 " + x + " 입니다.");

	}
}
