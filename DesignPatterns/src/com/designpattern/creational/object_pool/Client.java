package com.designpattern.creational.object_pool;

import java.sql.Connection;
import java.sql.DriverManager;

public class Client {
	public static void main(String[]args) {
		JDBCConnectionPool pool = new JDBCConnectionPool("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3306","root","1111");
		Connection conn0 = pool.checkOut();
		pool.checkIn(conn0);
		final int TIMES = 200;
		long time1;
		long time2;
		
		
		//use pool
		time1 = System.nanoTime();
		for(int i=0; i<TIMES; i++) {
			Connection conn = pool.checkOut();
			//System.out.println(conn);
			pool.checkIn(conn);
		}
		time2 = System.nanoTime();
		System.out.println("time used: "+ (time2-time1) );
		
		
		//no use pool
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
		time1 = System.nanoTime();
		for(int i=0; i<TIMES; i++) {
			try{
				Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "1111");
				conn2.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		time2 = System.nanoTime();
		System.out.println("time used: "+ (time2-time1) );
		
	}

}
