/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

/**
 *
 * @author RAJAT GUPTA
 */
public class ExamPojo {
private String examid;
private String language;
private int total_questions;

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotal_questions() {
        return total_questions;
    }

    public void setTotal_questions(int total_questions) {
        this.total_questions = total_questions;
    }

    public ExamPojo(String examid, String language, int total_questions) {
        this.examid = examid;
        this.language = language;
        this.total_questions = total_questions;
    }

    public ExamPojo() {
    }

    @Override
    public String toString() {
        return "ExamPojo{" + "examid=" + examid + ", language=" + language + ", total_questions=" + total_questions + '}';
    }



    
}
