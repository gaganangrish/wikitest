package test;

import java.sql.Timestamp;

public class timestamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date date= new java.util.Date();
		String timeStamp = new Timestamp(date.getTime()).toString();
		System.out.println(timeStamp);
	}

}
