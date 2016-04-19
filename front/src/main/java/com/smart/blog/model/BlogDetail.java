package com.smart.blog.model;

/**
 * 博文详细信息
 * <p>
 * Created by zhangjinhua on 16-4-8.
 */
public class BlogDetail {
    private int id;//数据库主键
    private String blog;//博客正文

    @Override
    public String toString() {
        return "BlogDetail{" +
                "id=" + id +
                ", blog='" + blog + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
}
