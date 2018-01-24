import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import com.pillar.FizzBuzz;

public class FizzBuzzTest {
	FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
		assertEquals("1", fizzBuzz.fizz(1));
	}

	@Test
	public void whenFizzBuzzIsPassedATwoItReturnsATwo() {
		assertEquals("2", fizzBuzz.fizz(2));
	}
	
	@Test
	public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz() {
		assertEquals("fizz", fizzBuzz.fizz(3));
		assertEquals("fizz", fizzBuzz.fizz(6));
	}
}
