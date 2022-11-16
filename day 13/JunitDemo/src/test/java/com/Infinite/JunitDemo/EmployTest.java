package com.Infinite.JunitDemo;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class EmployTest {

	//@Test
	//public void test() {
	//fail("Not yet implemented");
	//}

	@Test
	public void testConstructor() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Employ employ = new Employ();
		Employ employNew = new Employ(1,"Sahithi","sahithibathula29@gmail.com","9553825207",
				sdf.parse("2000-03-29"),"Java", 1030279, 10);
		assertNotNull(employ);
		assertEquals(1,employNew.getEmpId());
		assertEquals("Sahithi", employNew.getEmpName());
		assertEquals("sahithibathula29@gmail.com",employNew.getEmpId());
		assertEquals("9553825207",employNew.getEmpMobNo());
		assertEquals(sdf.parse("2000-03-29"),employNew.getEmpdtJoin());
		assertEquals("Java",employNew.getEmpDept());
		assertEquals("1030279",employNew.getEmpManagerId());
		assertEquals("10",employNew.getEmpAvailLeaveBal());
	}
	
	@Test 
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employ employ2 = new Employ(1, "Bhargavi", "bhargavi@gmail.com", "9346298926", sdf.parse("2022-10-10"), "java", 1000, 18);
		
		String result ="Employ [empId=" + 1 + ", empname=" + "Bhargavi" + ", empMail=" + "bhargavi@gmail.com" + ", empMobNo=" + "9346298926"
				+ ", empDtJoin=" + sdf.parse("2022-10-10") + ", empDept=" + "java" + ", empManagerId=" + 1000
				+ ", empAvailLeaveBal=" + 18 + "]";
		
		assertEquals(result, employ2.toString());
	}
	
	@Test
	public void testGetterAndSetter() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employ employ1 = new Employ();
		employ1.setEmpId(1);
		employ1.setEmpName("Bhargavi");
		employ1.setEmpMail("bhargavi@gmail.com");
		employ1.setEmpMobNo("9346298926");
		employ1.setEmpdtJoin(sdf.parse("2022-10-10"));
		employ1.setEmpDept("java");
		employ1.setEmpManagerId(1000);
		employ1.setEmpAvailLeaveBal(18);
		assertEquals(1, employ1.getEmpId());
		assertEquals("Bhargavi", employ1.getEmpName());
		assertEquals("bhargavi@gmail.com", employ1.getEmpMail());
		assertEquals("9346298926", employ1.getEmpMobNo());
		assertEquals(sdf.parse("2022-10-10"), employ1.getEmpdtJoin());
		assertEquals("java", employ1.getEmpDept());
		assertEquals(1000, employ1.getEmpManagerId());
		assertEquals(18, employ1.getEmpAvailLeaveBal());
		
		
	}
	
}
