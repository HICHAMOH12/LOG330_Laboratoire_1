package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import Calcul.Variance.CalculImplementation;

public class calculDeVarianceTest {
	
private ArrayList<Integer> ValeurTest ;
	
    private CalculImplementation calcul = new CalculImplementation(ValeurTest);
	 
		   

		@Test
		public void TestlmiteSuperieure() {
			
			ValeurTest.add(888899999);
			ValeurTest.add(877777777);
            ValeurTest.add(999999999);
			ValeurTest.add(777788899);
			ValeurTest.add(998888888);
			
			
			assertEquals(8738915360875827,0000,calcul.calculDeVariance() );
			
			
		}
		@Test
	    public void TestlmiteInfirieure() {
			
			
			ValeurTest.add(1);
			ValeurTest.add(1);
			ValeurTest.add(1);
			ValeurTest.add(3);
			ValeurTest.add(3);
			
			
			assertEquals(1,2000,calcul.calculDeVariance() );
			
		}
	    @Test
	    public void TestValeurInvalide() {
	    	
	    	ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			
			assertEquals(-1,000,calcul.calculDeVariance());
			
			
			
		}
	}




