
import org.junit.Test;

public class Tests {

	@Test
	public void test1() {
		assert(true);
	}
	@Test
	public void test2() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assert(true);
	}
	@Test
	public void test3() {
		assert(true);
	}
	@Test
	public void test4() {
		assert(true);
	}
	@Test
	public void test5() {
		assert(true);
	}

}
