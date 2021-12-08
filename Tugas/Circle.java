/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author FauziahKhoerunnisa
 */
public class Circle extends Shape{
    private static final String Circle = null;
    private float radius;
    private Point center;
	
    public Circle() {
	super(Circle);
	this.radius= (float) 1.0;
	this.center= new Point(0, 0);
    }	
    public void Circle(int xCenter, int yCenter, float radius) {
	center = new Point(xCenter, yCenter);
	this.radius = radius;
    }	
    public void Circle(Point center, float radius) {
	this.center = center;
	this.radius = radius;
    }	
    public float getRadius() {
	return this.radius;
    }
    public void setRadius(float radius) {
	this.radius = radius;
    }
    public Point getCenter() {
	return this.center;
    }
    public void setCenter(Point center) {
	this.center = center;
    }
    public int getCenterX() {
	return center.getX();
    }
    public void setCenterX(int x) {
	center.setX(x);
    }
    public int getCenterY() {
	return center.getY();
    }
    public String toString() {
	return "Circle[center= " + center + ",radius=" + radius +"]";
    }	
    public float Area(float radius) {
	return (float) (radius*radius*Math.PI);
    }	
    public float Circum() {
	return (float) (2.0*Math.PI*radius);
    }	
    public float setCenter() {
	return (float) (radius+radius/2);
    }	
    public float setRadius() {
	return this.radius;
    }	
    public void draw() {
	System.out.println("Menggambar Lingkaran");
    }
    public void erase() {

    }
    public void move() {
	
    }
    public void resize() {
	
    }
}
