package chapter7;
import java.util.*;
public class Vecter77 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10);//초기 용량이 10인 벡터 생성
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			v.add(sc.nextInt());
		}
		double num = 0; //비교할 숫자
		double cm = 0; //키 저장 할 곳
		int year = 0;
		for(int i =0; i<9; i++) {
			num = v.get(i+1) - v.get(i); //키가 큰 년도 - 이전 년도 
			if(cm < num) { //cm보다 크면 num값을 넘김
				cm = num;
				year = i; //2000년 ~ 2009년 까지 i는 0~9
			}
		}
		year += 2000; //i값만 저장 되므로 2000을 더해줌
		System.out.println("가장 키가 많이 자란 년도는 " + year + "년 " + cm);
		sc.close();
	}
}
