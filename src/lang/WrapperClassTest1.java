package lang;

public class WrapperClassTest1 {

	public static void main(String[] args) {
		Integer i = new Integer( 10 );
		Character c = new Character( 'c' );
		Float f = new Float( 3.14 );
		Boolean b = new Boolean( true );
		
		//Auto Boxing
		Integer j = 10;
		//Auto Unboxing
		//int k = 20 + j.intValue();
		int k = 20 + j;
		
		swap( i, k );
	}
	public static void swap( Integer a, Integer b ) {
		int temp = a; //unboxing
		// 객체이지만 내부를 수정할 수 없음
		// a = b;
		
	}

}
