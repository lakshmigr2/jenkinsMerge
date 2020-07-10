package Pline.SampleMerge;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@InjectMocks
	private App app;
    
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	
    /**
     *  Test 1
     */
	@Test
    public void testApp1()
    {
    	String result = app.Calc("2", "1");
        assertThat(result, is("Strings") );
    }
	
	/**
     *  Test 2
     */
	@Test
    public void testApp2()
    {
    	String result = app.Calc("", "1");
        assertThat(result, is("Empty") );
    }
}
