import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ManagementCompanyTestSTUDENT {
	Property p1 ,p2,p3,p4,p5,p6;
	ManagementCompany m ; 
	@Before
	public void setUp() throws Exception {
		p1 = new Property ("Walder", "Glendale", 4844.00, "Jjohn Adams",2,1,2,2);
		p2 = new Property ("Lake Laoga", "Lakewood", 4114, "Rod Manson",4,1,2,2);
		p3 = new Property ("Muddy Branch", "Peninsula", 4905, "Kito Armstrong",6,1,2,2);
		
		m= new ManagementCompany("Wilson", "3333333333",6);
		 
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
	}

	@After
	public void tearDown() {
		p1=p2=p3=p4=p5=p6=null;
		m=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		p4 = new Property ("Terrace", "Bontman", 2613, "Johny Sampson",2,5,2,2);
		p5 = new Property ("Mystic Grove", "Lake Mead", 5327, "Krin Haley",4,5,2,2);
		p6 = new Property ("Too Many Properties", "Lakepointe", 1000, "JoeyBadman",6,5,2,2);	
	}
 
	@Test
	public void testMaxRentProp() {
		assertEquals(m.totalRent(),13863.0,0);
	}

	@Test
	public void testTotalRent() {
		String maxRentString = m.maxRentProp().split("\n")[3];
		assertTrue(maxRentString.contains("4905.0"));
	}

 }