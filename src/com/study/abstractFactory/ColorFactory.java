package com.study.abstractFactory;

public class ColorFactory extends AbstractFactory {
	@Override
	public Color getColor(String colorType) {
		if(colorType==null) {
			return null;
		}
		if(colorType.equalsIgnoreCase("Red")) {
			return new Red();
		}else if(colorType.equalsIgnoreCase("Green")) {
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}
}
