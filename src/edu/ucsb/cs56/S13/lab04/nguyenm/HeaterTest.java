package edu.ucsb.cs56.S13.lab04.nguyenm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HeaterTest {
	@Test
	public void test_NoArgConstructor() {
		Heater heater = new Heater();
		assertEquals(heater.getBrandName(), "Dyson");
		assertEquals(heater.getTemperature(), 30);
	}

	@Test
	public void test_TwoArgConstructor() {
		Heater heater = new Heater("asdf", 22);
		assertEquals(heater.getBrandName(), "asdf");
		assertEquals(heater.getTemperature(), 22);
	}

	@Test
	public void test_GetBrandName() {
		Heater heater = new Heater();
		heater.setBrandName("BrandName");
		assertEquals(heater.getBrandName(), "BrandName");
	}

	@Test
	public void test_GetTemperature() {
		Heater heater = new Heater();
		heater.setTemperature(999);
		assertEquals(heater.getTemperature(), 999);
	}

	@Test
	public void test_Equals() {
		Heater heater1 = new Heater();
		Heater heater2 = new Heater();
		Heater heater3 = new Heater("Git Yolo", 666);
		assertEquals(true, heater1.equals(heater2));
		assertEquals(false, heater2.equals(heater3));
		assertEquals(false, heater3.equals(heater1));
	}

	@Test
	public void test_ToString() {
		Heater heater = new Heater("BrandName", 0);
		assertEquals(heater.toString(), "[brandName=BrandName, temperature=0]");
	}
}
