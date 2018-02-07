package test;

import java.util.ArrayList;

import org.junit.Test;

public class calculeDeMoyenneTest {
	
	private ArrayList<Integer> ValeurTest ;
	

	 
		   

		@Test
		public void TestlmiteInferieure() {
			
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			
		}
		@Test
	    public void TestlmiteSuperieure() {
			
			
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
		}
	    @Test
	    public void TestValeurInvalide() {
	    	
	    	ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			
		}
	}



