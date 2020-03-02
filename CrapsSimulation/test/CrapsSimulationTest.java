import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrapsSimulationTest
{

	@BeforeAll
	static void setUpBeforeClass() throws Exception
	{
	}

	@BeforeEach
	void setUp() throws Exception
	{
	}

	@Test
	void test_static1()
	{
		Die die = new CrookedDie1();
		assertEquals("Die.testStatic()", die.testStatic());
	}
	
	@Test
	void test_static2()
	{
		CrookedDie1 die = new CrookedDie1();
		assertEquals("CrookedDie1.testStatic()", die.testStatic());
	}

}
