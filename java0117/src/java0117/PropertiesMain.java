package java0117;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		//프로퍼티를 저장할 수 있는 인스턴스를 생성하고 데이터를 저장
		Properties props = new Properties();
		
		//프로퍼티 저장
		props.setProperty("name", "베르캄프");
		props.setProperty("nation", "holland");
	
		//프러퍼티 나 맵(dictionary, hashtable 라고도 합니다.)
		//프로퍼티나 맵에 없는 key의 값을 주었을 때 동작 방식
		String name = props.getProperty("name");
		//자바는 없는 key를 사용하면 null
		String age = props.getProperty("age");
		
		System.out.println(name);
		System.out.println(age);
		
		//props를 현재 디렉토리에 temp.xml 파일로 내보내기
		try {
			props.storeToXML(new FileOutputStream("./temp.xml"), "주석");
		}catch(Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}
	}
}





