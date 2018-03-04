package com.study.factory;
/**
 * 测试简单的工厂类
 * @author Donkey.Hu
 *
 */
public class ShapeFactoryDemo {
	public static void main(String[] args) {
		ShapeFactory factory=new ShapeFactory();
		
		Shape shape1=factory.getShape("Rectangle");
		shape1.draw();
		Shape shape2=factory.getShape("Circle");
		shape2.draw();
		Shape shape3=factory.getShape("Square");
		shape3.draw();
	}
}
