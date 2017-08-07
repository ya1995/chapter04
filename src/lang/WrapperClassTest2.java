package lang;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		System.out.println( Character.toLowerCase( 'A' ) );
		System.out.println( Character.isDigit( '1' ) ); 	//숫자냐 아니냐
		System.out.println( Character.isDigit( '@' ) );
		
		
		String s = "1234";				 
		if( s.matches("\\d+")==false ) {		//정규표현식 : \d+ ->숫자, .* ->문자 		=> 검색하면 나옴ㅋㅋㅋㅋ
			System.out.println( "숫자가 아닙니다." );
		}else {
			int i= Integer.parseInt( s );
		}
		
		//프로그램 로직( 변수 검증) 할때는
		//try-catch문으로 하지 말것
		//비용이 너무 많이 듬 , 위 방식으로 해야해
		/*try {
			int i = Integer.parseInt( s );
		} catch( NumberFormatException e ) {
			System.out.println( "숫자가 아닙니다." );
		}*/
		
		System.out.println( Integer.parseInt( "12345", 10 ) );
		System.out.println( Integer.parseInt( "A", 16 ) );
		System.out.println( Integer.toBinaryString( 255 ) );
		System.out.println( Integer.toHexString( 255 ) );
		System.out.println( Double.parseDouble( "44.13e-16") );
		System.out.println( Long.parseLong( "1234567890" ) );
		
		System.out.println( String.valueOf( 12345 ) );
	}

}
