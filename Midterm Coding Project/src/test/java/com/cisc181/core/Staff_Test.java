package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		ArrayList<Staff> staffTest = new ArrayList<Staff>();

		Staff A = new Staff(null);
		A.setSalary(150000);
		staffTest.add(A);

		Staff B = new Staff(null);
		B.setSalary(125000);
		staffTest.add(B);

		Staff C = new Staff(null);
		C.setSalary(100000);
		staffTest.add(C);

		Staff D = new Staff(null);
		D.setSalary(75000);
		staffTest.add(D);

		Staff E = new Staff(null);
		E.setSalary(50000);
		staffTest.add(E);

		double average = ((A.getSalary() + B.getSalary() + C.getSalary() + D.getSalary() + E.getSalary()) / 5);
		double actual = 100000;

		assertEquals(actual, average, .000000000001);
	}

	@Test
	public void testPhoneNumber() throws PersonException {

		String correct = "123 456 7890";

		Staff personA = new Staff(null);
		personA.setPhone(correct);

		String actualNumber = personA.getPhone();

		assertEquals(correct, actualNumber);
	}

	@Test
	public void testDOB() {

		boolean caught = false;
		try {
			setDOB(100000000, 6, 02);
		} catch (Exception e) {
			caught = true;
		}

		assertTrue(caught);
	}

	private void setDOB(int i, int j, int k) {
		// TODO Auto-generated method stub

	}

}
