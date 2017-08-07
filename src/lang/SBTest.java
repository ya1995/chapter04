package lang;

public class SBTest {
	public static void main(String[] args) {
		//생성
		StringBuffer sb = new StringBuffer( "This" );
		System.out.println( sb.length() + " : " + sb.capacity() ); 	//lengt는 길이 capacity는 크기
		System.out.println( sb );
		
		//문자열 추가
		sb.append( " is pencil!" );
		System.out.println( sb );
		
		//삽입 
		sb.insert( 7, " my" );
		System.out.println( sb );
		
		//치환
		sb.replace( 8, 10, "your" );	//바꿔줄 부분의 시작과 끝을 설정 
		System.out.println( sb );
		
		//Buffer 크기 조절
		sb.setLength( 3 );				//줄여버림
		System.out.println( sb );
		
		//문자열 + 연산은 내부적으로 StringBuffer로 객체로 변환
		String s1 = "Hello" + "World" + 10 + true;
		System.out.println( s1 ); 		//잘됨! => 객체들끼리 연산은 안되지만 걍 해줌
		
		String s2 = new StringBuffer( "Hello" ).append( " World" )
				.append( 10 ).append( true ).toString();;	//Method Chain
		
				System.out.println( s2 );
		
	}

}
