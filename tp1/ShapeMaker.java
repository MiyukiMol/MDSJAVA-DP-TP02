package com.tactfactory.designpatternniveau1.facade.tp1;

import java.util.Arrays;
import java.util.List;

public interface ShapeMaker {
	
	String CIRCLE = null;

	void draw();

	void drawCircle();

	void drawRectangle();

	void drawSquare();

	void draw(String circle2);
	
	List<ShapeMaker> shapemaker = new Arrays<ShapeMaker>;
		add.shapemaker(new Rectangle());
		add.shapemaker(new Square());
		add.shapemaker(new Circle());
	
	for (ShapeMaker shapemaker1 : shapemaker) {
		if(shapemaker instanceof Circle) {
			shapemaker1.drawCircle();
	    }else if(shapemaker instanceof Rectangle) {
	    	shapemaker1.drawRectangle();
	    }else if(shapemaker instanceof Rectangle) {
	    	shapemaker1.drawSquare();
	    }
		
	

	}	
}}
