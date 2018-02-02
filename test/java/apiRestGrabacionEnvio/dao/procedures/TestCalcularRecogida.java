package apiRestGrabacionEnvio.dao.procedures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import es.chx.exceptions.ProcedureException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
public class TestCalcularRecogida {
		
	/** GetCustomerByIdXMLProcedure */
//	@Autowired
//	private GetCustomerByIdXMLProcedure getCustomerByIdXMLProcedure;
	
	/**
	 * test del metodo
	 * @throws ProcedureException 
	 */
	@Test
	public void test() {
		
		for (int i = 0; i < 50; i++){
			try {
				//getCustomerByIdXMLProcedure.execute(101);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	}

}
