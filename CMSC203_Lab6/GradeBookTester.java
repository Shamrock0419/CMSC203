import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	GradeBook gb;
	GradeBook gb2;
	@BeforeEach
	void setUp() throws Exception {
		gb = new GradeBook(5);
		gb2 = new GradeBook(5);
		gb.addScore(70);
		gb.addScore(80);
		gb.addScore(95);
		gb2.addScore(60);
		gb2.addScore(85);
		gb2.addScore(90);
	}

	@AfterEach
	void tearDown() throws Exception {
		gb = null;
		gb2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gb.toString().equals("70.0 80.0 95.0 "));
		assertTrue(gb2.toString().equals("60.0 85.0 90.0 "));
	}

	@Test
	void testSum() {
		assertEquals(245, gb.sum(), .0001);
		assertEquals(235, gb2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(70, gb.minimum(), .001);
		assertEquals(60, gb2.minimum(), .0001);
	}

	@Test
	void testFinalScore() {
		assertEquals(175, gb.finalScore(), .0001);
		assertEquals(175, gb2.finalScore(), .0001);
		
	}

}
