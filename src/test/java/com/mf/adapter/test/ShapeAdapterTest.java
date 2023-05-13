package com.mf.adapter.test;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import com.mf.adapter.ShapeAdapter;
import com.mf.adapter.Triangle;

public class ShapeAdapterTest {
    
	@Test
    public void testShapeAdapter() {
        Triangle triangle = new Triangle();
        ShapeAdapter adapter = new ShapeAdapter(triangle);
        assertNotNull(adapter);
    }
	
}
