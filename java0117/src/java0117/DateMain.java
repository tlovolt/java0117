package java0117;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		//java.util.Date 는 년도는 1900년 이후 지나온 년도, 월은 0부터 시작, 일은 1부터 시작
		//2020년 1월 17일을 만들고자 하는 경우
		//Date date = new Date(2020, 1, 17); //3920년 2월 17일이 됩니다.
		Date date = new Date(120, 0, 17);
		System.out.println(date);
		
		//Calendar 클래스의 인스턴스를 생성
		//Calendar 클래스는 추상 클래스 - 추상 클래스는 인스턴스를 생성할 수 없습니다.
		//이렇게 작성을 하면 Calendar 클래스의 인스턴스를 만드는 것이 아니고
		//Calendar 클래스를 상속받은 클래스의 Anonymous Class를 생성해서 인스턴스를 만든 후 리턴
		//자바에서 인터페이스나 추상클래스를 리턴타입으로 하는 모든 메소드는 이 원리가 적용됩니다.
		Calendar cal = Calendar.getInstance();
		//toString이 너무 많은 양의 데이터를 리턴하도록 만들어져서 보기 어려움
		//System.out.println(cal);
		
		//필요한 데이터만 추출 - 월은 0부터 시작하기 때문에 출력할 때는 +1
		System.out.println(cal.get(Calendar.MONTH) + 1);
		
		//1월 부터 12월 까지의 날 수를 배열에 저장
		//int [] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//2월의 날수
		//months[1];
		
		//프로그래밍의 편리성을 위해서 첫번째 위치에 의미없는 값을 삽입해서
		//인덱스와 데이터의 위치를 맞추는 경우가 있습니다.
		int [] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//2월의 날수
		//months[2];
		
		Date today = new Date();
		//날짜를 문자열로 변경해주는 클래스 - 생성할 때 서식을 입력
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd EEEE a hh:mm:dd");
		String msg = sdf.format(today);
		System.out.println(msg);

	}

}








