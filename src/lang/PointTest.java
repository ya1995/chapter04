package lang;

public class PointTest {
	public static void main(String[] args) {
		Point point = new Point();
		
		
		System.out.println( point.getClass().getName() );
		System.out.println( point.hashCode() );		// 참조값인거같음 강사님 추측ㅋㅋㅋㅋㅋㅋ
		System.out.println( point.toString() );		// 문자열 return
		// getClass().getName() + "@" + hashCode() -> 이게 toString
		System.out.println( point );
		
		System.out.println( "=======================" );
		// String 객체와 비교
		String s = new String( "hello" );
		System.out.println( s.getClass().getName() );
		System.out.println( s.hashCode() );		
		System.out.println( s.toString() );		
		System.out.println( s );
		
		
	}
}
