/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.util.Vector;
import java.util.Enumeration;
/**
 *
 * @author FauziahKhoerunnisa
 */
public class Course {
    private String title;
    private Vector courseRecords;
    
    Course() {
        courseRecords=new Vector();
    }
    public String getTitle() {return title;}
    public void setTitle( String t) {title=t;}
    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }
    public Enumeration getCourseRecords() {
        return courseRecords.elements();
    }
    public void printCourseStudents(){
        /*
        */
    }
    public void printBestStudent(){
        /*
        */
    }
    public void printFinalExamStudent(){
        /*
        */
    }
}
