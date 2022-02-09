package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)//테스트 시 필요한 클래스 지정 
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")//xml 경로 지정
@Log4j
public class SampleTests {
	
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	@Test//JUnit는 해당 메서드가 단위 테스트의 대상인지 알려준다.
	public void testExist() {
		assertNotNull(restaurant);//restaurant 변수가 null이 아니어야만 테스트 기능을 성공한다
		
		log.info(restaurant);
		log.info("--------------------------------");
		log.info(restaurant.getChef());
		
	}
}
