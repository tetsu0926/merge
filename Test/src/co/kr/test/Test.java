package co.kr.test;

public class Test {
	
	public static final String CODE_CONSTRANTS = "상수";
	
	public static void main(String[] args) {

		int turmCnt = 50;
		int dayDiv = 9;
		// 1번이 큰 값을 구합니다.
		int firstValue = turmCnt % dayDiv;
		// 나머지 값들은 동일하게 계산합니다.
		int otherValues = (turmCnt - firstValue) / dayDiv;
		System.out.println("1번 값: " + (firstValue+otherValues));
		System.out.println("나머지 값들: " + otherValues);
	}
	
	
	public void pre_release() {}
	

	public void test(){
		System.out.println("8/7 - 이클립스에서 작성 ");
		System.out.println("8/7 - 인텔리제이 작성");
	}

}
