package com.smart.blog.model;


/**
 * 博文评论
 * <p>
 * Created by zhangjinhua on 16-4-8.
 */
public class Comment {
    private int id;//数据库主键
    private int blogId;//博客id
    private String comment;//评论
    private String createTime;//创建时间
    private int parentId = 0;//父评论id
    private String loginAuthor;//该条评论作者（已登录用户）
    private String noLoginAuthor;//该评论作者（未登录用户）

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", blogId=" + blogId +
                ", comment='" + comment + '\'' +
                ", createTime='" + createTime + '\'' +
                ", parentId=" + parentId +
                ", loginAuthor='" + loginAuthor + '\'' +
                ", noLoginAuthor='" + noLoginAuthor + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getLoginAuthor() {
        return loginAuthor;
    }

    public void setLoginAuthor(String loginAuthor) {
        this.loginAuthor = loginAuthor;
    }

    public String getNoLoginAuthor() {
        return noLoginAuthor;
    }

    public void setNoLoginAuthor(String noLoginAuthor) {
        this.noLoginAuthor = noLoginAuthor;
    }
}
