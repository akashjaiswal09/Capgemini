package com.capgemini.junit92;

import org.junit.Assert;
import org.junit.Test;


public class DateTest {

	public static void main(String[] args) {
		
		@Test
		public void testForDate() {
			int testData=11;
			String expectedResult="Odd";
			Date obj = new Date(11,8,2017);
			Date actualResult=obj;
			Assert.assertEquals(expectedResult, actualResult);
		
		}

	}

}
