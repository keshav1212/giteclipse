import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calctest {
	calculator cal;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal=new calculator();
	}

	@After
	public void tearDown() throws Exception {
		cal=null;
	}

	@Test
	public void test() {
		assertEquals(10, cal.add(5, 5));
		assertEquals(10, cal.sub(20, 10));
		assertEquals(10, cal.mult(2, 5));
		assertEquals(10, cal.div(30, 3));
	}
	}
