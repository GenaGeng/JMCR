package concurrent.util.classes.tests;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;

import concurrent.util.classes.BlockingDeque;
import concurrent.util.classes.LinkedBlockingDeque;
import edu.tamu.aser.exploration.JUnit4MCRRunner;

@RunWith(JUnit4MCRRunner.class)
public class LinkedBlockingDequeTest {
	
	public static void main(String args[]) {
//		BlockingDeque<String> deque1 = new LinkedBlockingDeque<String>();
		BlockingDeque<String> deque1 = new LinkedBlockingDeque<>();
		

		deque1.addFirst("1");
		deque1.addLast("2");
	//
		try {
			String two = deque1.takeLast();
			System.out.println(two);
			String one = deque1.takeFirst();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test() throws InterruptedException {
		try {
			LinkedBlockingDequeTest.main(null);
		} catch (Exception e) {
			System.err.println("here");
			e.printStackTrace();
//			System.out.println(e.getMessage());
			fail();
		}
	}
}
