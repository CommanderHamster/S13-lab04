package edu.ucsb.cs56.S13.lab04.YunSuk;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/** test class for Gun
 
  @author Yun Suk Chang
  @version CS56, S13, lab04
  @see Gun
 
*/
public class GunTest{
	@Test
	public void test_defaultConstructor()
	{
		Gun g= new Gun();
		assertEquals("Hand Gun", g.getModel());
		assertEquals(0,g.getBulletsRemaining());
		assertEquals(6,g.getMaxBullets());
	}
	@Test
	
	public void test_3argConstructor1()
	{
		Gun g= new Gun("AK-47",23,30);
		assertEquals("AK-47", g.getModel());
		assertEquals(23,g.getBulletsRemaining());
		assertEquals(30,g.getMaxBullets());
	}
	@Test
	
	public void test_3argConstructor2(){
	
		Gun g= new Gun(null,2,234);
		assertEquals(null,g.getModel());
		assertEquals(2,g.getBulletsRemaining());
		assertEquals(234,g.getMaxBullets());
	}
	@Test
	
	public void test_3argConstructor3(){
	
		Gun g= new Gun("",21,2);
		assertEquals("",g.getModel());
		assertEquals(2,g.getBulletsRemaining());
		assertEquals(2,g.getMaxBullets());
	}
	@Test
	
	public void test_3argConstructor4(){
	
		Gun g=new Gun("s",-23,2);
		assertEquals("s",g.getModel());
		assertEquals(0,g.getBulletsRemaining());
		assertEquals(2,g.getMaxBullets());
	}
	@Test
	
	public void test_3argConstructor5(){
	
		Gun g=new Gun(" ",23,-4);
		assertEquals(" ",g.getModel());
		assertEquals(0,g.getBulletsRemaining());
		assertEquals(0,g.getMaxBullets());	
		
	}		
	@Test
	
	public void test_getMaxBullets1()
	{
		Gun g= new Gun();
		assertEquals(6,g.getMaxBullets());
	}
	@Test
	
	public void test_getMaxBullets2(){

		Gun g= new Gun("A",2,234);
		assertEquals(234,g.getMaxBullets());
	}
	@Test
	
	public void test_getMaxBullets3(){
		Gun g= new Gun("n",21,-24);
		assertEquals(0,g.getMaxBullets());
	}
	@Test
	
	public void test_getMaxBullets4(){
		Gun g=new Gun("s",-23,-2);
		assertEquals(0,g.getMaxBullets());
	}
	@Test
	
	public void test_getMaxBullets5(){
		Gun g= new Gun("x",234,15);
		assertEquals(15,g.getMaxBullets());
	}
	@Test
	
	public void test_getMaxBullets6(){
		Gun g=new Gun("0",2,0);
		assertEquals(0,g.getMaxBullets());	
	}
	@Test
	
	public void test_getModel1()
	{
		Gun g=new Gun();
		assertEquals("Hand Gun",g.getModel());
	}
	@Test
	
	public void test_getModel2()
	{	
		Gun g= new Gun(" ",2,2);
		assertEquals(" ",g.getModel());
	}
	@Test
	
	public void test_getModel3()
	{
		Gun g =new Gun("",2,2);
		assertEquals("",g.getModel());
	}
	@Test
	
	public void test_getModel4()
	{
		Gun g=new Gun(null,2,2);
		assertEquals(null,g.getModel());
	}
	@Test
	
	public void test_getModel5()
	{
		Gun g=new Gun("AK-47",2,2);
		assertEquals("AK-47",g.getModel());
	}
	@Test
	
	public void test_getBulletsRemaining1()
	{
		Gun g= new Gun();
		assertEquals(0,g.getBulletsRemaining());
	}
	@Test
	
	public void test_getBulletsRemaining2()
	{
		Gun g= new Gun("a",234,234);
		assertEquals(234,g.getBulletsRemaining());
	}
	@Test
	
	public void test_getBulletsRemaining3()
	{
		Gun g= new Gun("a",23,7);
		assertEquals(7,g.getBulletsRemaining());
	}
	@Test
	
	public void test_getBulletsRemaining4()
	{
		Gun g= new Gun("a",-7,3);
		assertEquals(0,g.getBulletsRemaining());
	}
	@Test
	
	public void test_getBulletsRemaining5()
	{
		Gun g= new Gun("a",4,-2);
		assertEquals(0,g.getBulletsRemaining());
	}
	@Test
	
	public void test_getBulletsRemaining6()
	{
		Gun g= new Gun("a",0,0);
		assertEquals(0,g.getBulletsRemaining());
	}
	@Test
	
	public void test_setModel1()
	{
		Gun g = new Gun();
		g.setModel(null);
		assertEquals(null,g.getModel());
	}
	@Test
	
	public void test_setModel2()
	{
		Gun g = new Gun();
		g.setModel("");
		assertEquals("",g.getModel());
	}
	@Test
	
	public void test_setModel3()
	{
		Gun g = new Gun();
		g.setModel(" ");
		assertEquals(" ",g.getModel());
	}
	@Test
	
	public void test_setModel4()
	{
		Gun g = new Gun();
		g.setModel("AK-47");
		assertEquals("AK-47",g.getModel());
	}

	@Test
	
	public void test_setBulletsRemaining1()
	{
		Gun g = new Gun();
		g.setBulletsRemaining(-2);
		assertEquals(0,g.getBulletsRemaining());
	}

	@Test
	
	public void test_setBulletsRemaining2()
	{
		Gun g = new Gun();
		g.setBulletsRemaining(10);
		assertEquals(6,g.getBulletsRemaining());
	}

	@Test
	
	public void test_setBulletsRemaining3()
	{
		Gun g = new Gun();
		g.setBulletsRemaining(2);
		assertEquals(2,g.getBulletsRemaining());
	}
	@Test
	
	public void test_setBulletsRemaining4()
	{
		Gun g = new Gun("a",12,34);
		g.setBulletsRemaining(0);
		assertEquals(0,g.getBulletsRemaining());
	}
	@Test
	
	public void test_setMaxBullets1()
	{
		Gun g = new Gun();
		g.setMaxBullets(-4);
		assertEquals(0,g.getMaxBullets());
	}
	@Test
	
	public void test_setMaxBullets2()
	{
		Gun g = new Gun();
		g.setMaxBullets(0);
		assertEquals(0,g.getMaxBullets());
	}
	@Test
	
	public void test_setMaxBullets3()
	{
		Gun g = new Gun();
		g.setMaxBullets(23);
		assertEquals(23,g.getMaxBullets());
	}

	@Test
	
	public void test_toString1()
	{
		Gun g = new Gun();
		assertEquals("Model: Hand Gun   BulletsRemaining: 0   MaxBullets: 6",g.toString());
	}
	@Test
	
	public void test_toString2()
	{
		Gun g = new Gun("AK-47",20,30);
		assertEquals("Model: AK-47   BulletsRemaining: 20   MaxBullets: 30",g.toString());
	}
	@Test
	
	public void test_toString3()
	{
		Gun g = new Gun("",120,30);
		assertEquals("Model:    BulletsRemaining: 30   MaxBullets: 30",g.toString());
	}
	@Test
	
	public void test_toString4()
	{
		Gun g = new Gun(null,-1,30);
		assertEquals("Model: null   BulletsRemaining: 0   MaxBullets: 30",g.toString());
	}
	@Test
	
	public void test_toString5()
	{
		Gun g = new Gun(" ",20,-2);
		assertEquals("Model:     BulletsRemaining: 0   MaxBullets: 0",g.toString());
	}
	@Test
	
	public void test_toString6()
	{
		Gun g = new Gun("AK-47",-20,-3);
		assertEquals("Model: AK-47   BulletsRemaining: 0   MaxBullets: 0",g.toString());
	}

	@Test
	
	public void test_equals1()
	{
		Gun g= new Gun();
		assertEquals(false,g.equals(null));
	}
	@Test
	
	public void test_equals2()
	{
		Gun g= new Gun();
		assertEquals(false,g.equals("asd"));
	}
	@Test
	
	public void test_equals3()
	{
		Gun g= new Gun();
		assertEquals(false,g.equals(new Gun("",0,6)));
	}
	@Test
	
	public void test_equals4()
	{
		Gun g= new Gun();
		assertEquals(false,g.equals(new Gun("Hand Gun",0,5)));
	}
	@Test
	
	public void test_equals5()
	{
		Gun g= new Gun();
		assertEquals(false,g.equals(new Gun("Hand Gun",1,6)));
	}
	@Test
	
	public void test_equals6()
	{
		Gun g= new Gun();
		assertEquals(true,g.equals(new Gun()));
	}
	@Test
	
	public void test_equals7()
	{
		Gun g= new Gun();
		assertEquals(true,g.equals(new Gun("Hand Gun",-3,6)));
	}
	@Test
	
	public void test_equals8()
	{
		Gun g= new Gun();
		assertEquals(false,g.equals(new Gun("Hand Gun",-2,-4)));
	}
	@Test
	
	public void test_equals9()
	{
		Gun g= new Gun("a",0,0);
		assertEquals(true,g.equals(new Gun("a",-3,-4356)));
	}

	@Test
	
	public void test_shoot1()
	{
		Gun g = new Gun();
		g.shoot();
		assertEquals(0,g.getBulletsRemaining());
	}
	@Test
	
	public void test_shoot2()
	{
		Gun g = new Gun("a",5,4);
		g.shoot();
		assertEquals(3,g.getBulletsRemaining());
	}
	@Test
	
	public void test_shoot3()
	{
		Gun g = new Gun("a",3,-2);
		g.shoot();
		assertEquals(0,g.getBulletsRemaining());
	}

	@Test
	
	public void test_isEmpty1()
	{
		Gun g = new Gun();
		assertEquals(true,g.isEmpty());
	}
	@Test
	
	public void test_isEmpty2()
	{
		Gun g = new Gun("a",1,0);
		assertEquals(true,g.isEmpty());
	}
	@Test
	
	public void test_isEmpty3()
	{
		Gun g = new Gun("a",2,3);
		assertEquals(false,g.isEmpty());
	}
	@Test
	
	public void test_isEmpty4()
	{
		Gun g = new Gun("a",-2,9);
		assertEquals(true,g.isEmpty());
	}

	@Test
	
	public void test_reload1()
	{
		Gun g = new Gun();
		g.reload();
		assertEquals(6,g.getBulletsRemaining());
	}
	@Test
	
	public void test_reload2()
	{
		Gun g = new Gun("a",4,-2);
		g.reload();
		assertEquals(0,g.getBulletsRemaining());
	}
	@Test
	
	public void test_reload3()
	{
		Gun g = new Gun("a",0,0);
		g.reload();
		assertEquals(0,g.getBulletsRemaining());
	}
	
}
