package java0117;

//class 를 만드는 경우는 대부분 인스턴스를 2개 이상 만드는 경우
class Threadext extends Thread{
	public void run() {
		//스레드 자신의 이름을 10번 출력(1초마다 쉬면서)
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
				System.out.println(getName());
			}
			//InterruptedException이 발생했을 때 return 하도록 만들어주면 스레드가
			//강제로 종료될 수 있습니다.
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class Main4 {

	public static void main(String[] args) {
		Threadext th1 = new Threadext();
		Threadext th2 = new Threadext();
		Threadext th3 = new Threadext();
		
		//스레드 우선 순위 설정 : 확률적으로 th3 이 먼저 시작할 가능성이 높아집니다.
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(3000);
			//th2 스레드에게 인터럽트 발생
			th2.interrupt();
		}catch(Exception e) {}

	}

}




