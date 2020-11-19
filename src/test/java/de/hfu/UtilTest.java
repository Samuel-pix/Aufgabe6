package de.hfu;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
public class UtilTest {
	 @Test
	    public void testIstErstesHalbjahr() {
	    	 final boolean istWert1 = Util.istErstesHalbjahr(6);
	    	 final boolean sollWert1 = true;
	    	 
	    	 final boolean istWert2=Util.istErstesHalbjahr(7);
	    	 final boolean sollWert2=false;
	    	 
	    	 assertEquals(sollWert1, istWert1);
	    	 assertEquals(sollWert2,istWert2);
	    	 
	    	 try{
				 Util.istErstesHalbjahr(13);
				 } catch(IllegalArgumentException e){
				 } 
	    	 }

}
