package com.snail.sort.SnailsortAPI;

import com.snail.sort.SnailsortAPI.service.SnailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static com.snail.sort.SnailsortAPI.service.SnailService.Sort;
import static com.snail.sort.SnailsortAPI.service.SnailService.setArray;
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
		String id = ssr.getSnailArray().getId();
		assertEquals(exceptId,id);
		assertEquals(Arrays.toString(excepted), Arrays.toString(result));
	}

	@Test
	public void testSortArray(){
		Sort(ssr.getSnailArray());
	}

	@Test
	public void set2DArray(){
		setArray(ssr.getSnailArray());
	}
}
