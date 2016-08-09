package com.davisodom.here;

import java.util.Objects;

/**
 * Created by dodom1 on 8/9/2016.
 */
public class Post {
    private Object data;
    private String title;

    public Post(String title, Object data){
        this.data = data;
        this.title = title;
    }

    public Object getData() {
        return data;
    }

    public String getTitle() {
        return title;
    }

}
