package com.smart.blog.model;

import java.util.Date;
import java.util.List;

/**
 * 博文
 * <p>
 * Created by zhangjinhua on 16-4-8.
 */
public class Blog {
    private int id;//数据库主键
    private String blogNo;//博客编号
    private BlogDetail blogDetail;//博文详细信息
    private Date createTime;//创建时间
    private Date updateTime;//更新时间
    private String brief;//摘要
    private String imageUrl;//博文配图
    private String title;//标题
    private Author author;//作者
    private List<Comment> commentList;//博文评论

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", blogNo='" + blogNo + '\'' +
                ", blogDetail=" + blogDetail +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", brief='" + brief + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", commentList=" + commentList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBlogNo() {
        return blogNo;
    }

    public void setBlogNo(String blogNo) {
        this.blogNo = blogNo;
    }

    public BlogDetail getBlogDetail() {
        return blogDetail;
    }

    public void setBlogDetail(BlogDetail blogDetail) {
        this.blogDetail = blogDetail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
