package jp.techacademy.hato.yasuhiko.taskapp;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hatoy37 on 2/8/17.
 */

public class Task extends RealmObject implements Serializable {
    private String title; // タイトル
    private String contents; // 内容
    private Date date; // 日時

    // id をプライマリーキーとして設定
    @PrimaryKey
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // FIXME
    // When a tasks is deleted with long tap a list, the app is terminated here.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
