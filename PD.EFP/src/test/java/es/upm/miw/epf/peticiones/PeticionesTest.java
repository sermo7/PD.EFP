package es.upm.miw.epf.peticiones;

import static org.junit.Assert.assertEquals;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PeticionesTest {

    private PeticionRed peticionRed = new PeticionRed();
    private PeticionLocal peticionLocal = new PeticionLocal();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    
    @Test
    public void out() {
        System.out.println("hello");
        assertEquals("hello"+System.getProperty("line.separator"), outContent.toString());
    }

    @Test
	public void testAccion1(){
		Accion1 accion1 = new Accion1(peticionRed);
		accion1.execute();
		assertEquals("[INFO] PeticionRed:red1"+System.getProperty("line.separator"), outContent.toString());
	}
    
    @Test
	public void testAccion2(){
		Accion2 accion2 = new Accion2(peticionRed);
		accion2.execute();
		assertEquals("[INFO] PeticionRed:red2"+System.getProperty("line.separator"), outContent.toString());
	}
    
    @Test
	public void testAccion3(){
		Accion3 accion3 = new Accion3(peticionRed);
		accion3.execute();
		assertEquals("[INFO] PeticionRed:red3"+System.getProperty("line.separator"), outContent.toString());
	}
    
    @Test
	public void testAccion4(){
		Accion4 accion4 = new Accion4(peticionLocal);
		accion4.execute();
		assertEquals("[INFO] PeticionLocal:local1"+System.getProperty("line.separator"), outContent.toString());
	}
    
    @Test
	public void testAccion5(){
		Accion5 accion5 = new Accion5(peticionLocal);
		accion5.execute();
		assertEquals("[INFO] PeticionLocal:local2"+System.getProperty("line.separator"), outContent.toString());
	}

}
