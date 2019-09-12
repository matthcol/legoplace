package test.big;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class TestBig {
	@Test
	void testBig() {
		var price = BigDecimal.valueOf(10999,2);
		System.out.println(price);
	}

}
