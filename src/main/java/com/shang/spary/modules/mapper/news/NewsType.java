package com.shang.spary.modules.mapper.news;

import java.util.Date;

public class NewsType {
    private Integer id;

    private String name;

    private String link;

    private String note;

    private Integer sort;

    private String pagetype;

    private Integer suptype;

    private String info;

    private String cphoto;

    private String text;

    private String seotitle;

    private String seokey;

    private String seodes;

    private Integer addid;

    private Integer updid;

    private Date updtime;

    private Date addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getPagetype() {
        return pagetype;
    }

    public void setPagetype(String pagetype) {
        this.pagetype = pagetype;
    }

    public Integer getSuptype() {
        return suptype;
    }

    public void setSuptype(Integer suptype) {
        this.suptype = suptype;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
    
    public String getSuptypeDesc(){
		for(NewsTypeEnum statusEnum : NewsTypeEnum.values()){
			if(statusEnum.getCode() == suptype){
				return statusEnum.getName();
			}
		}
		return ""+suptype;
	}
    
    
    public enum NewsTypeEnum {
    	/**
    	 * newstype(1,"资讯类别"),vediotype(2,"视频类别"),
    	 * CJWT(3,"常见问题"),LCJS(4,"理财介绍"),ZJAQ(5,"资金安全"),KHDCZ(6,"操作帮助"),SMJJ(7,"私募基金"),GQJJ(8,"股权基金"),ZFXG(9,"支付相关"),YQFL(10,"邀请返利"),
    	 * about(11,"关于盈加"),CONTACTUS(12,"我的客服列表"),BANNERIMG(13,"Banner图片");
    	 */
    	ROOTTYPE(0,"根类别"),
    	NEWSTYPE(1,"资讯类别"),VEDIOTYPE(2,"视频类别"),
    	CJWT(3,"常见问题"),LCJS(4,"理财介绍"),ZJAQ(5,"资金安全"),KHDCZ(6,"操作帮助"),
    	SMJJ(7,"私募基金"),GQJJ(8,"股权基金"),ZFXG(9,"支付相关"),YQFL(10,"邀请返利"),
    	ABOUT(11,"关于盈加"),CONTACTUS(12,"我的客服列表"),BANNERIMG(13,"Banner图片"),
    	YJZX(14,"资讯资讯"),CFQY(15,"财富前沿"),SMMT(16,"趋势名谈"),LCSY(17,"理财私语"),
    	ADIMAGE(18,"APP广告图");

    	private Integer code;
    	private String name;

    	public Integer getCode() {
    		return code;
    	}
     
    	public String getName() {
    		return name;
    	}
    	NewsTypeEnum(Integer code, String name) {
    		this.code = code;
    		this.name = name;
    	}


    }
}