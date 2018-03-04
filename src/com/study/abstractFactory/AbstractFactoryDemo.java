package com.study.abstractFactory;
/**
 * 抽象工厂设计模式，即为工厂再设计个工厂
 * @author Donkey Hu
 *
 */
public class AbstractFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");
		
		Shape shape1=shapeFactory.getShape("Rectangle");
		shape1.draw();
		Shape shape2=shapeFactory.getShape("Circle");
		shape2.draw();
		Shape shape3=shapeFactory.getShape("Square");
		shape3.draw();
		
		AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");
		Color color1=colorFactory.getColor("Red");
		color1.fill();
		Color color2=colorFactory.getColor("Green");
		color2.fill();
	}
}
