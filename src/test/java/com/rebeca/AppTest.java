package com.rebeca;


import org.junit.Test;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	@Test
	  public void testCrearVersiculos() {
		Versiculos v = new Versiculos("Isaias", "42:6", "Yo Jehová te he llamado en justicia, y te sostendré por la mano; te guardaré y te pondré por pacto al pueblo, por luz de las naciones.");
		  assertEquals("Isaias", v.getLibro());
		  assertEquals("42:6", v.getNumVersiculo());
		  assertEquals("Yo Jehová te he llamado en justicia, y te sostendré por la mano; te guardaré y te pondré por pacto al pueblo, por luz de las naciones.", v.getVersiculo());
		  
		  
 }
	
	
    
    
	
}
