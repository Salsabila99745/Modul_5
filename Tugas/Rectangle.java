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
public class Rectangle extends Shape{
    private float length, width;
	
    public Rectangle(String Rectangle, int length, int width) {
	super(Rectangle);
	this.length = length;
	this.width = width;
    }
	
    public String toString() {
	return "Rectangle[length=" + length + ", width=" + width + "," +super.toString() +"]";		
    }	
    public float getArea() {
	return (float) (length*width);
    }	
    public float circum() {
	return (float) (2*(length*width));
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
