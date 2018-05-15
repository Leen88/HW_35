package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SubtractTest {
	@Test
	public void Subtract_test_instanceOf() {
		assertThat(Calculator.subtract(2, 2), instanceOf(Double.class));
	}

	@Test
	public void Subtract_test_2_param() {
		assertThat(Calculator.subtract(2, 2), equalTo(0.0));
	}

	@Test
	public void Subtract_test_3_param() {
		assertThat(Calculator.subtract(2, 2, 2), equalTo(-2.0));
	}

	@Test
	public void Subtract_test_4_param() {
		assertThat(Calculator.subtract(2, 2, 2, 2), equalTo(-4.0));
	}
}
