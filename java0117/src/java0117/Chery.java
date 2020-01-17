package java0117;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Chery {

	public static void main(String[] args) {
		String [] image = {"!", "@", "#", "$", "%", "^"};
		//Random 객체 생성
		Random r = new Random();
		List<String> list = new ArrayList<String>();
		
		for(int i=0; i<3; i=i+1) {
			String temp = image[r.nextInt(image.length)];
			System.out.print(temp);
			list.add(temp);
		}
		System.out.print("\n");
		
		if(list.get(0) == list.get(1) && list.get(1) == list.get(2)) {
			System.out.println("3개가 모두 일치");
		}else if(list.get(0) == list.get(1)) {
			System.out.println("앞의 2개가 일치");
		}else {
			System.out.println("꽝");
		}
		
		//랜덤한 문자열 만들기 - 이미지 파일 등을 업로드 했을 때 파일이름 그리고 유저를 구분하기 위한 이름
		//등을 만들 때 이용
		String name = UUID.randomUUID().toString();
		System.out.println(name);
		
	}

}



