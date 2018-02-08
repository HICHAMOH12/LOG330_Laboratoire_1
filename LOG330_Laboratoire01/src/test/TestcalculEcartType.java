package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import Calcul.Variance.CalculImplementation;

public class TestcalculEcartType{
	
    private ArrayList<Integer> ValeurTest ;
	
    private CalculImplementation calcul = new CalculImplementation(ValeurTest);
	 
		   

		@Test
		public void TestlmiteSuperieure() {
			
			
			ValeurTest.add(477777789);
			ValeurTest.add(999999885);
			ValeurTest.add(888888999);
			ValeurTest.add(888888888);
            ValeurTest.add(889898989);
			
			assertEquals(202163311,9627,calcul.calculEcartType() );
			
			
		}
		@Test
	    public void TestlmiteInfirieure() {
			
			
			ValeurTest.add(1);
			ValeurTest.add(1);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			
			
			assertEquals(1,6432,calcul.calculEcartType() );
			
		}
	    @Test
	    public void TestValeurInvalide() {
	    	
	    	ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			
			assertEquals(Double.NaN,calcul.calculEcartType());
			
			
			
		}
}
