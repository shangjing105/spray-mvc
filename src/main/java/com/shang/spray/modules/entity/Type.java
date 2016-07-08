package com.shang.spray.modules.entity;

import java.util.Date;
import javax.persistence.*;

public class Type {
    @Id
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String info;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 上级类别
     */
    private Integer tid;

    @Column(name = "createDate")
    private Date createdate;

    @Column(name = "modifyDate")
    private Date modifydate;

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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取上级类别
     *
     * @return tid - 上级类别
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * 设置上级类别
     *
     * @param tid 上级类别
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * @return createDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return modifyDate
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * @param modifydate
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}