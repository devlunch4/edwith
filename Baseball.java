package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//숫자 야구게임 만들기
	/*
	 * 설명
	  
        //예시1 시작
		135 : 기준
		123 : 1S 1B 1O
			
		S 숫자가 동일
		B 숫자가 다름 
		O 숫자가 없음
				
		345 : 1S 1B 1O
		
		3=볼(숫자가 있으나 자리가 다름)
		4=아웃(다름)
		5=스트라이크(숫자와 자리가 같음
		세자리숫자를 모두 맞추면 아웃
		
		147 : 1S 0B 2O
		
				
		//예시2 게임시작
		랜덤 설정
		맞춰보기
		
		438
		
		345 : 0S 2B 1O  두숫자는 맞으나 자리가 다름 한숫자는 없음
		572 : 0S 0B 3O	숫자가 없음
		134 : 1S 1B 1O	1=없는숫자o 3=숫자와 자리동일1s 4= 
		439 : 2S 0B 1O
		438 : 3S 0B 0O
		정답 :  438
		
		
		//조건 : 1~9 숫자
		각자리가 중복되지 않게
		
		//코딩 예정 방법 순서 
		1차
		랜덤수 추출 abc 
		랜덤 중복숫자 금지확인
		
		2차
		입력 및 랜덤숫자비교
		입력 받아서 맞는지 힌트(SBO)출력
		xyz
		
		3차
		틀릴시 반복
		맞출 경우 맞춤 출력
		*/
		
		// ///////////////////////////////////////////
		// 코딩시작
		// 랜덤수 추출각 자리로 지정하여 추출한다
		// 백/십/일의 자리 수 추출 그리고 중복 되지 않도록
/*
		Scanner sc = new Scanner(System.in);

		int x = 0; // 백의자리
		int y = 0; // 십의자리
		int z = 0; // 일의자리
		int com = 0; // 랜덤수결정

		// 난수 설정
		while (x == 0 || x == 10) {
			x = (int) (Math.random() * 10);
		}
		while (y == 0 || y == x) {
			y = (int) (Math.random() * 10);
		}
		while (z == 0 || z == x || z == y) {
			z = (int) (Math.random() * 10);
		}

		com = (x * 100 + y * 10 + z);
		
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;
		int user = 0; // 최종입력값

		int strike = 0;	// 스트라이크
		int ball = 0;	// 볼
		int out = 0; 	// 아웃
		int count = 0;	// 반복 횟수
				
		// 입력 및 숫자 비교 시작 및 틀리면 반복
		do {
			// 입력시작
			System.out.println("숫자 야구 시작!");
			System.out.println("백의자리 숫자 하나를 입력해주세요"); // 백
			user1 = Integer.parseInt(sc.nextLine());
			System.out.println("십의자리 숫자 하나를 입력해주세요"); // 십
			user2 = Integer.parseInt(sc.nextLine());
			System.out.println("일의자리 숫자 하나를 입력해주세요"); // 일
			user3 = Integer.parseInt(sc.nextLine());
			user = (100 * user1 + 10 * user2 + user3); // 입력 된 숫자 확정
			System.out.println("입력된 숫자 : " + user);

			// 판정1
			strike = 0; // 반복문 후 초기화
			ball = 0; // 반복문 후 초기화
			out = 0; // 반복문 후 초기화

			if (user1 == x) {
				strike++;
			} else if (user1 == y || user1 == z) {
				ball++;
			} else if (user1 != x || user1 != y || user1 != z) {
				out++;
			}
			if (user2 == y) {
				strike++;
			} else if (user2 == x || user2 == z) {
				ball++;
			} else if (user2 != x || user2 != y || user2 != z) {
				out++;
			}
			if (user3 == z) {
				strike++;
			} else if (user3 == y || user3 == x) {
				ball++;
			} else if (user3 != x || user3 != y || user3 != z) {
				out++;
			}

			System.out.println("스크라이트 : " + strike + ", 볼 : " + ball + ", 아웃: "
					+ out);
			count++;
		} while (strike != 3); // 삼진 아웃 게임 종료
	
		
		//do문 종료 및 최종 출력 
		System.out.println("축하합니다." + count + " 번 만에 맞추셨습니다");
		System.out.println("정답 : " + com);
*/
		
		
		
		
		//////////////////////
		//	강사 코드
		//	랜덤 숫자 부분 (do while 과 if 를 사용)
		
		
		//숫자야구 게임을 만들어주세요.
		 
		int a1 = (int) (Math.random() * 9) + 1;
		int a2;
		int a3;

		do {
			a2 = (int) (Math.random() * 9) + 1;
		} while (a1 == a2);

		do {
			a3 = (int) (Math.random() * 9) + 1;
		} while (a1 == a3 || a2 == a3);

		System.out.println("정해진 랜덤 값 : " + a1 + a2 + a3);

		Scanner s = new Scanner(System.in);
		int count = 0;
		while (true) {
			// 강사코드; input으로 3자리 숫자를 한번에 입력 받음
			System.out.println("3자리의 숫자>");
			int input = Integer.parseInt(s.nextLine());

			int i3 = input % 10; // 1의자리
			input /= 10;
			int i2 = input % 10; // 10의자리
			input /= 10;
			int i1 = input % 10; // 100의자리

			int strike = 0;
			int ball = 0;
			int out = 0;

			if (a1 == i1)
				strike++;
			if (a2 == i2)
				strike++;
			if (a3 == i3)
				strike++;

			if (a1 == i2 || a1 == i3)
				ball++;
			if (a2 == i1 || a2 == i3)
				ball++;
			if (a3 == i1 || a3 == i2)
				ball++;

			out = 3 - strike - ball;

			System.out.println(++count + "차 시도(" + i1 + i2 + i3 + ") : "
					+ strike + "S " + ball + "B " + out + "O");
			System.out.println("----------------------------");
			if (strike == 3) {
				System.out.println("정답입니다!!");
				break;
			}
		}
		
	}
}
