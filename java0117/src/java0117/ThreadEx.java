package java0117;

public class ThreadEx extends Thread {

	public void run() {
		//1초마다 Hello Thread 라는 문자열을 10번 출력
		for(int i=0; i<10; i=i+1) {
			System.out.println("Hello Thread");
			try {
				//현재 스레드 1초 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
