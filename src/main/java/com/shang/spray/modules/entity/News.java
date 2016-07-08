package com.shang.spray.modules.entity;

import java.util.Date;
import javax.persistence.*;
public class News {
    @Id
    private Integer id;

    /**
     * 所属类别
     */
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String info;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 链接地址
     */
    private String link;

    /**
     * 作者
     */
    private String author;

    /**
     * 来源
     */
    private String source;

    /**
     * 标签
     */
    private String label;

    /**
     * 点赞
     */
    @Column(name = "thumb_up")
    private Integer thumbUp;

    /**
     * 是否置顶
     */
    @Column(name = "placed_top")
    private Boolean placedTop;

    /**
     * 是否推荐
     */
    private Boolean recommend;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 添加时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改时间
     */
    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 内容
     */
    private String content;

    @Transient
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取所属类别
     *
     * @return type_id - 所属类别
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置所属类别
     *
     * @param typeId 所属类别
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取描述
     *
     * @return info - 描述
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置描述
     *
     * @param info 描述
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取链接地址
     *
     * @return link - 链接地址
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置链接地址
     *
     * @param link 链接地址
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取来源
     *
     * @return source - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取标签
     *
     * @return label - 标签
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置标签
     *
     * @param label 标签
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取点赞
     *
     * @return thumb_up - 点赞
     */
    public Integer getThumbUp() {
        return thumbUp;
    }

    /**
     * 设置点赞
     *
     * @param thumbUp 点赞
     */
    public void setThumbUp(Integer thumbUp) {
        this.thumbUp = thumbUp;
    }

    /**
     * 获取是否置顶
     *
     * @return placed_top - 是否置顶
     */
    public Boolean getPlacedTop() {
        return placedTop;
    }

    /**
     * 设置是否置顶
     *
     * @param placedTop 是否置顶
     */
    public void setPlacedTop(Boolean placedTop) {
        this.placedTop = placedTop;
    }

    /**
     * 获取是否推荐
     *
     * @return recommend - 是否推荐
     */
    public Boolean getRecommend() {
        return recommend;
    }

    /**
     * 设置是否推荐
     *
     * @param recommend 是否推荐
     */
    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取添加时间
     *
     * @return create_date - 添加时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置添加时间
     *
     * @param createDate 添加时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改时间
     *
     * @return modify_date - 修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置修改时间
     *
     * @param modifyDate 修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}