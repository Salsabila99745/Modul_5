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
public class Point {
    private int x,y;
    
    public Point(int xCenter, int yCenter) {
	this.x=0;
	this.y=0;
    }	
    public int getX() {
	return this.x;
    }	
    public void setX(int x) {
	this.x = x;
    }	
    public int getY() {
	return this.y;
    }	
    public void setY(int y) {
	this.y=y;
    }	
    public String toString() {
	return "(" +this.x+ "," +this.y+ ")";
    }
}
