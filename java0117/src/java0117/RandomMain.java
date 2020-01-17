package java0117;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		//seed 설정 없이 랜덤 인스턴스 생성 - seed 가 현재 시간을 설정
		Random r1 = new Random();
		//seed를 1번으로 설정
		Random r2 = new Random(1);
		
		//실행할 때 마다 다르게 나옴
		int result1 = r1.nextInt();
		//실행할 때 마다 동일하게 나옴
		int result2 = r2.nextInt();
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		
		//빨강, 파랑, 녹색 을 랜덤하게 출력
		//랜덤하게 출력되는 것에 제한을 가하기 위한 배열을 생성
		String [] colors = {"머니", "머니", "아이템1", "아이템2", "아이템3"};
		//배열에서 배열안의 인덱스가 랜덤하게 나오도록 r1.nextInt(colors.length)
		//배열의 인덱스에 적용
		for(int i=0; i<10; i=i+1) {
			String color = colors[r1.nextInt(colors.length)];
			System.out.println("color:" + color);
		}
		
		//비복원 추출 - 훈련데이터 와 테스트데이터 샘플링, 로또, 고스톱, 포커
		List<String> list = new ArrayList<String>();
		//1-45까지 저장
		for(int i=1; i<=45; i=i+1) {
			list.add(i + "");
		}
		//20개의 숫자를 비복원 추출
		for(int i=0; i<20; i=i+1) {
			//list 사이즈 내에서 데이터를 추출
			String x = list.get(r1.nextInt(list.size()));
			//그 데이터를 제거
			list.remove(x);
			System.out.print(x + "\t");
		}

	}
}







