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
public abstract class Shape {
    private String Circle;
    private String Rectangle;
    private String Polygon;

    public Shape(String Circle) {
	this.Circle="Circle";
    }
    public void Shape2(String Rectangle) {
	this.Rectangle="Rectangle";
    }
    public String getCircle() {
	return this.Circle;
    }
    public void setCircle(String Circle) {
	this.Circle = Circle;
    }
    public String getRectangle() {
	return this.Rectangle;
    }
    public void setRectangle(String Rectangle) {
        this.Rectangle = Rectangle;
    }
    public String getPolygon() {
        return this.Polygon;
    }
    public void setPolygon(String Polygon) {
	this.Polygon = Polygon;
    }
    public void draw() {
		
    }
    public void erase() {
		
    }
    public void move() {
		
    }
    public void resize() {
		
    }
}
