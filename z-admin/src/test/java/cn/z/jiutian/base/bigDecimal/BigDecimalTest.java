package cn.z.jiutian.base.bigDecimal;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cn.z.jiutian.BaseTest;

public class BigDecimalTest extends BaseTest {

	private static final Logger LOG = LoggerFactory.getLogger(BigDecimalTest.class);
	
	@Test
	public void bigDecimalTest() {
		BigDecimal a = new BigDecimal("300.00");
		BigDecimal b = new BigDecimal("300");
		
		
		LOG.info("a is {}", a);
		LOG.info("b is {}", b);
		LOG.info("flag is {}", a.compareTo(b));
	}
	
}
