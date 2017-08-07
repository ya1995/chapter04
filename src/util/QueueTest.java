package util;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer( "둘리" );
		queue.offer( "마이콜" );
		queue.offer( "도우너" );
		queue.offer( "고길동" );
		
		System.out.println( queue.isEmpty() );
		System.out.println( queue.poll() );
		System.out.println( queue.poll() );
		System.out.println( queue.peek() );
		System.out.println( queue.poll() );
		System.out.println( queue.poll() );
		
		System.out.println( queue.isEmpty() );
		
		//queue는 stack과 다르게 비어있을때 poll()을 호출해도
		//예외가아닌 null이 리턴됨
		System.out.println( queue.poll() );
		
		
	}

}
