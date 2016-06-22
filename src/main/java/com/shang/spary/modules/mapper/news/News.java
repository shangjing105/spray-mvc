package com.shang.spary.modules.mapper.news;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "news")
public class News {
    private Integer id;
    private Integer typeid;
    private String title;
    private String subtitle;
    private Integer sort;

    private String info;
    private String cphoto;
    private String link;

    private String author;

    private String source;

    private String label;

    private Integer clicknumber;

    private String filelink;

    private String seotitle;

    private String seokey;

    private String seodes;

    private Integer plactop;
    private Integer recommend;

    private Integer audit;

    private Integer addid;

    private Integer updid;

    private Date updtime;

    private Date addtime;
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCphoto() {
        return cphoto;
    }

    public void setCphoto(String cphoto) {
        this.cphoto = cphoto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getClicknumber() {
        return clicknumber;
    }

    public void setClicknumber(Integer clicknumber) {
        this.clicknumber = clicknumber;
    }

    public String getFilelink() {
        return filelink;
    }

    public void setFilelink(String filelink) {
        this.filelink = filelink;
    }

    public String getSeotitle() {
        return seotitle;
    }

    public void setSeotitle(String seotitle) {
        this.seotitle = seotitle;
    }

    public String getSeokey() {
        return seokey;
    }

    public void setSeokey(String seokey) {
        this.seokey = seokey;
    }

    public String getSeodes() {
        return seodes;
    }

    public void setSeodes(String seodes) {
        this.seodes = seodes;
    }

    public Integer getPlactop() {
        return plactop;
    }

    public void setPlactop(Integer plactop) {
        this.plactop = plactop;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public Integer getAddid() {
        return addid;
    }

    public void setAddid(Integer addid) {
        this.addid = addid;
    }

    public Integer getUpdid() {
        return updid;
    }

    public void setUpdid(Integer updid) {
        this.updid = updid;
    }

    public Date getUpdtime() {
        return updtime;
    }

    public void setUpdtime(Date updtime) {
        this.updtime = updtime;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public String getTypeidDesc(){
        for (NewsType.NewsTypeEnum newsTypeEnum :NewsType.NewsTypeEnum.values()) {
            if (newsTypeEnum.getCode().equals(this.typeid)) {
                return newsTypeEnum.getName();
            }
        }
        return "";
    }


}