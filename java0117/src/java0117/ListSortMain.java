package java0117;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSortMain {

	public static void main(String[] args) {
		//문자열 List를 생성하고 데이터를 저장
		ArrayList<String> list = new ArrayList<String>();
		list.add("야구");
		list.add("농구");
		list.add("축구");
		list.add("배구");
		
		//Comparator 인터페이스를 implements 한 클래스의 인스턴스를 만들어서 정렬
		StringComp comp = new StringComp();
		//데이터 정렬 - Comparator를 매개변수로 요구
		list.sort(comp);
		
		//Comparator의 Anonymous Class 만들기
		//클래스 없이 Comparator 인터페이스를 구현한 클래스의 인스턴스를 바로 만들기
		//이 문법의 확장인 람다가 자바의 함수형 프로그래밍을 지원
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		list.sort(c);
		
		//데이터 출력
		for(String temp : list) {
			System.out.print(temp + "\t");
		}

	}

}
