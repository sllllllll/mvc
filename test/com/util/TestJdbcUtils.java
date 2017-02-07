package com.util;

import java.util.List;

import org.junit.Test;

public class TestJdbcUtils {
	
	@Test
	public void testQuery(){
		List list=JdbcUtils.query("select *from user");
		System.out.println(list);
	}
	@Test
	public void testQuery2(){
		List list = JdbcUtils.query("select * from user where id= 1 ");
		System.out.println(list.size());
	}
	
	@Test
	public void testQuerySingle(){
		int i = JdbcUtils.querySingle("select count(*) from user");
		System.out.println(i);
	}
	
	@Test
	public void testQuery3(){
		List list = JdbcUtils.query("select * from user where id=?  ", new Object[]{"1"});
		System.out.println(list);
	}
	
}
