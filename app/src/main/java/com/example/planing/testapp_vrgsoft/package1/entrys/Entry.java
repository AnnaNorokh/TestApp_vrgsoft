package com.example.planing.testapp_vrgsoft.package1.entrys;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "entry", strict = false)
public class Entry implements Serializable {

    @Element(name = "content")
    private String content;

    @Element(name = "author")
    private String author;

    @Element(name = "title")
    private String title;

    @Element(name = "date")
    private String date;

    public Entry() {

    }

    public Entry(String content, String author, String title, String date) {
        this.content = content;
        this.author = author;
        this.title = title;
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
