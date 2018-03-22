package shiyan;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SjxTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test1(){
		Sjx test1=new Sjx(1,1,1);
		String rs=test1.cal();
		System.out.println(rs);
	}
	@Test
	public void test2() {
		Sjx test2=new Sjx(1,2,1);
		String rs=test2.cal();
		System.out.println(rs);
	}
	@Test
	public void test3() {
		Sjx test3=new Sjx(5,5,4);
		String rs=test3.cal();
		System.out.println(rs);
	}
	@Test
	public void test4() {
		Sjx test4=new Sjx(2,3,4);
		String rs=test4.cal();
		System.out.println(rs);
	}
}
