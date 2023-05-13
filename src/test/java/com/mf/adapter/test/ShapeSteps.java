package com.mf.adapter.test;

import static org.junit.Assert.assertEquals;

import com.mf.adapter.Circle;
import com.mf.adapter.Rectangle;
import com.mf.adapter.Shape;
import com.mf.adapter.ShapeAdapter;
import com.mf.adapter.Triangle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShapeSteps {
	private Shape shape;
	private String output;

	@Given("I have a rectangle")
	public void i_have_a_rectangle() {
		shape = new Rectangle();
	}

	@Given("I have a circle")
	public void i_have_a_circle() {
		shape = new Circle();
	}

	@Given("I have a triangle")
	public void i_have_a_triangle() {
		shape = new ShapeAdapter(new Triangle());
	}

	@When("I draw the rectangle")
	public void i_draw_the_rectangle() {
		shape.draw();
	}

	@When("I draw the circle")
	public void i_draw_the_circle() {
		shape.draw();
	}

	@When("I draw the triangle using the ShapeAdapter")
	public void i_draw_the_triangle_using_the_ShapeAdapter() {
		shape.draw();
	}

	@Then("\"{string}\" should be printed")
	public void should_be_printed(String expectedOutput) {
		assertEquals(expectedOutput, output);
	}
}
