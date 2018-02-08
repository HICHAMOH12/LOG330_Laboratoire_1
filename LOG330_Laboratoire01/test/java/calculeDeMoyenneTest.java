package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import Calcul.Variance.CalculImplementation;

public class calculeDeMoyenneTest {
	
	private ArrayList<Integer> ValeurTest ;
	
    private CalculImplementation calcul = new CalculImplementation(ValeurTest);
	 
		   

		@Test
		public void TestlmiteSuperieure() {
			
			
			ValeurTest.add(488888889);
			ValeurTest.add(455050505);
			ValeurTest.add(978787868);
			ValeurTest.add(566854338);
			ValeurTest.add(999999999);
			
			assertEquals(697916319,8000,calcul.calculeDeMoyenne() );
			
			
		}
		@Test
	    public void TestlmiteInfirieure() {
			
			
			ValeurTest.add(1);
			ValeurTest.add(1);
			ValeurTest.add(1);
			ValeurTest.add(1);
			ValeurTest.add(1);
			ValeurTest.add(1);
			
			assertEquals(1,000,calcul.calculeDeMoyenne() );
			
		}
	    @Test
	    public void TestValeurInvalide() {
	    	
	    	ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			ValeurTest.add(-1);
			
			assertEquals(-1,000,calcul.calculeDeMoyenne() );
			
			
			
		}
	}



