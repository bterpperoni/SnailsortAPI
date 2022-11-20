package com.snail.sort.SnailsortAPI;

import com.snail.sort.SnailsortAPI.service.SnailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;

import static com.snail.sort.SnailsortAPI.service.SnailService.Sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SnailsortApiApplicationTests {

	@Autowired
	private SnailService ssr;

	@Test
	void contextLoads() {
	}

	@Test
	public void testSnailArrays(){
		int[] excepted = {1,2,3,4,5,6,7,8,9};
		int[] result = ssr.getSnailArray().getTabTort();
		int exceptId = 0;
		int id = ssr.getSnailArray().getTabId();
		assertEquals(exceptId,id);
		assertEquals(Arrays.toString(excepted), Arrays.toString(result));
	}

	@Test
	public void testSortArray(){
		int[][] result = ssr.getSnailArray().getTortTab();
		Sort(result);
	}
}
