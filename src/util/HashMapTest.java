package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put( "둘리" , 100 );
		map.put( "마이콜" , 50 );
		map.put( "도우너" , 80 );
		map.put( "고길동" , 90 );
		
		//중복
		map.put( "둘리" , 50 );	//둘리의 점수가 100점에서 50점으로 바뀜
		
		//auto unboxing
		int score = map.get( "둘리" );
		System.out.println( score + "점" );
		
		//삭제
		map.remove( "둘리" );		
		
		//평균구하기
		int sum = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while( it.hasNext() ) {
			String key = it.next();
			System.out.println( key );
			int s = map.get( key );
			sum += s;
		}
		System.out.println( "평균: " + ( sum / keySet.size() ) );
		 
		
	}

}
