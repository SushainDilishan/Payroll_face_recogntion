/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shenal_Jerome
 */
public class FaceDetectorIT {
    
    public FaceDetectorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of detectFace method, of class FaceDetector.
     */
    @Test
    public void testDetectFace() {
        System.out.println("detectFace");
        BufferedImage imgfile = null;
        FaceDetector instance = new FaceDetector();
        BufferedImage expResult = null;
        BufferedImage result = instance.detectFace(imgfile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
