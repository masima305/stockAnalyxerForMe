package stockAnalyxerForMe;

import java.sql.Connection;
import javax.inject.Inject;
import javax.sql.DataSource;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
 
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
 
public class dbTest {

	  @Inject 
	    private DataSource ds;
	    
	    @Test
	    public void testConnection() throws Exception {
	        try(Connection con = ds.getConnection()) {
	            System.out.println("Connection : " + con + "\n");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}	
