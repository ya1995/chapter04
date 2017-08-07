package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		//현재시간
		Date now = new Date();
		System.out.println( now );
		printDate1( now );
		printDate2( now );
		
		//특정시간 세팅(2000/08/04)
		Date d1 = new Date( 100, 7, 4 );
		printDate2( d1 );
		
		//특정시간 세팅(2000/08/04 14:30:30)
		Date d2 = new Date( 100, 7, 4 , 14, 30, 30 );
		printDate2( d2 );
		
		//1970년 1월1일 00:00:00 기준
		//milliseconds 값을 세팅
		Date d3 = new Date( 24L * 60 * 60 * 1000 * 365 * 30 );
		printDate2( d3 );
		
		
	}
	private static void printDate1( Date date ) {
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy년MM월dd일 hh시mm분ss초" );		//정해져있는 포맷문자열
		System.out.println( sdf.format( date ) );
		
	}
	private static void printDate2( Date date ) {
		//년도 (+1900을 해줘야됨)
		int year = date.getYear();
		
		//월(0~11)
		int month = date.getMonth();
		
		//일
		int day = date.getDay();
		
		//시
		int hour = date.getHours();
		
		//분
		int minute = date.getMinutes();
		
		//초
		int second = date.getSeconds();
		
		System.out.println(
				( year + 1900 ) + "년" +
				( month + 1 ) + "월" + 
				day + "일" +
				hour + ":" +
				minute + ":" +
				second );
	}

}
