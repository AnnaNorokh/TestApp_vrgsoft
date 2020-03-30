package com.example.planing.testapp_vrgsoft.package1;

import com.example.planing.testapp_vrgsoft.package1.entrys.Entry;

import java.io.Serializable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

import androidx.annotation.NonNull;

@Root(name = "feed", strict = false)
public class Feed implements Serializable {


    @Element(name = "id")
    private String id;

    @Element(required = false, name = "author")
    private String author;

    @Element(name = "updated")
    private String updated;

    @Element(name = "content")
    private String content;

    @Element(name = "title")
    private String title;



    @ElementList(inline = true, name = "entry")
    private List<Entry> entrys;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return updated;
    }

    public void setDate(String updated) {
        this.updated = updated;
    }


    public String getComments() {
        return content;
    }

    public void setComments(String comments) {
        this.content = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Entry> getEntrys() {
        return entrys;
    }

    public void setEntrys(List<Entry> entrys) {
        this.entrys = entrys;
    }

    @Override
    public String toString() {
        return "Feed: \n [Entrys : " +entrys+ "]";
    }
}
