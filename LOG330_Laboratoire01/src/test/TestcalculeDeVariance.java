package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import Calcul.Variance.CalculImplementation;

public class TestcalculeDeVariance {
	
	private ArrayList<Integer> ValeurTest ;
	
    private CalculImplementation calcul = new CalculImplementation(ValeurTest);
	 
		   

		@Test
		public void TestlmiteSuperieure() {
			
			
			ValeurTest.add(8888889);
			ValeurTest.add(5050505);
			ValeurTest.add(78787868);
			ValeurTest.add(66854338);
			ValeurTest.add(99999999);
			
			assertEquals(697916319,8000,calcul.calculDeVariance() );
			
			
		}
		@Test
	    public void TestlmiteInfirieure() {
			
			
			ValeurTest.add(1);
			ValeurTest.add(1);
			ValeurTest.add(1);
			ValeurTest.add(3);
			ValeurTest.add(3);
			
			
			assertEquals(1,2000,calcul.calculDeVariance());
			
		}
	    @Test
	    public void TestValeurInvalide() {
	    	
	    	ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			
			assertEquals(Double.NaN,calcul.calculDeVariance() );
			
			
			
		}
	}



