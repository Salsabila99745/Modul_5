/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author FauziahKhoerunnisa
 */
public class Assignment {
    private double mark = -1;
    Assignment(){}
    public double getMark() throws NotYetSetException{
        if(mark==-1) {
            throw new NotYetSetException("Mark is not yet set");
	}
            return mark;
    }
    public void setMark(int m) {
	mark=m;
    }
}
