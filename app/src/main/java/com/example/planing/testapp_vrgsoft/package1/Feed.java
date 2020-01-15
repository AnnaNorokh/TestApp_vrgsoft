package com.example.planing.testapp_vrgsoft.package1;

import com.example.planing.testapp_vrgsoft.package1.entrys.Entry;

import java.io.Serializable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "feed", strict = false)
public class Feed implements Serializable {

    @Element(name = "id")
    private String id;

    @Element(required = false, name = "author")
    private String author;

    @Element(name = "date")
    private String date;

    @Element(name = "pic")
    private String pic;

    @Element(name = "comments")
    private String comments;

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
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
}
