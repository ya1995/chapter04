package lang;

public class StringTest03 {
	public static void main(String[] args) {
		String s = "abcAbcabcABC";
		
		//charAt
		char c = s.charAt( 2 );
		System.out.println( c );
		
		//indexOf
		System.out.println( s.indexOf( "Abc" ) );
		System.out.println( s.indexOf( "ab" ) );
		System.out.println( s.lastIndexOf( "ab" ) ); 	//lastIndexOf는 언제 마지막에 나오는지 찾음
		System.out.println( s.indexOf( "XYZ" ) ); 		//없는것을 찾으면 -1이 출력됨
	
		//replace(치환)
		System.out.println( s.replace( "bc" , "12" ) ); //bc를 12로 바꾸기
		System.out.println( s.replaceAll( "[a-zA-Z]+" , "12" ) );// replaceALL은 정규표현식으로 써야함 -> a부터z까지 A부터Z까지 시작하는 모든것을 바꿔라  
		System.out.println( s.replaceAll( "bc", "12") );		// 정규표현식으로 bc를 쓰면 그냥 bc로 인식
		
		//substring
		System.out.println( s.substring( 3, 7 ) ); 	// 시작index, 끝index을 설정해주면 시작index부터 끝index-1 까지만 나옴
		
		//case
		System.out.println( s.toLowerCase() );		// 소문자로 바꾸기
		System.out.println( s.toUpperCase() );		// 대문자로 바꾸기
		
		//concat
		String str1 = " ab cd     ";
		String str2 = ",efg";
		
		str1 = str1.concat( str2 );
		System.out.println( str1 );
		//trim -> 홈페이지 만들 때 로그인하는 부분에서 실수로 앞에 스페이스바를 눌러서 공백이 생기는 경우에 사용 가능
		System.out.println( "---" + str1 + "---" );
		System.out.println( "---" + str1.trim() + "---" );	// 앞뒤 공백을 지워줌, 가운데 공백은 제거 불가
		
		//split
		String[] tokens = str1.split( "," );
		for( String token : tokens ) {
			System.out.println( token );
		}
		
		//split 예외
		tokens = "abcdefg".split( "," );
		for( String token : tokens ) {
			System.out.println( token );
		}		// 없는걸로 분리하라그러면 그냥 그대로 보여줌
		
		tokens = "".split( "," );
		System.out.println( tokens.length );	// 객체가 나옴, length를 사용하면 객체 참조값이 나옴 -> null은 절대 출력되지 않고 배열을 리턴해줌..
		System.out.println( "--" + tokens[0] + "--" );
		
	}

}
