package com.shang.spary.common.util;


import org.apache.commons.lang.StringUtils;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	private final static Pattern DYNAMIC_PATTERN = Pattern.compile("@\\d+\\s+");
	public static String addPrefix(int num,String prefix,int length) {   
	    return String.format("%04d", num);   
	}

	public static boolean isStringAvaliable(String string) {
		return string!=null && !"".equals(string.trim());
	}   
	
	/**
	 * 判断当前字符串是否为NUll或空格
	 * @param str
	 * @return
	 */
	public static boolean isNull(String str){
		return str==null||str.trim().length()==0;
	}
	
	/**
	 * 判断当前字符串是否不为NUll或空格
	 * @param str
	 * @return
	 */
	public static boolean isNotNull(String str){
		return str!=null&&str.trim().length()!=0;
	}
	
	
	/**
	 * 
	 * 判断链接是否以http开头的
	 * @param link
	 * @return
	 */
	public static boolean isHttpAvaliable(String link){
		Pattern pattern2 = Pattern.compile("(http|ftp|https):\\/\\/([\\w.]+\\/?)\\S*");
		Matcher matcher2 = pattern2.matcher(link);
		if(!matcher2.find()){
			return false;
		}
		return true;
	}
	
	/**
	 * 将字符串转换为整形
	 *
	 * @param str
	 * @return
	 */
	public static int toInt(final String str) {
		return toInt(str, 0);
	}
	
	/**
	 * 将字符串转换为整形
	 *
	 * @param str
	 * @param i
	 * @return
	 */
	public static int toInt(final String str, final int i) {
		int result = 0;

		try {
			result = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			result = i;
		}
		return result;
	}
	
	/**
	 * 将字符串转换为整形
	 *
	 * @param str
	 * @return
	 */
	public static Integer toInteger(final String str) {
		Integer o=null;
		if(str==null)
			return null;
		try{
			o=Integer.valueOf(str.trim());
		}catch(Exception e){
			e.printStackTrace();
		}
		return o;
	}
	/**
	 * 将字符串转换为整形
	 *
	 * @param str
	 * @return
	 */
	public static Long toLong(final String str) {
		Long o=null;
		if(str==null)
			return null;
		try{
			o=Long.valueOf(str.trim());
		}catch(Exception e){
			e.printStackTrace();
		}
		return o;
	}
	
	/**
	 * 
	 */
	/**  
	     * 删除input字符串中的html格式  
	     *   
	     * @param input  
	     * @param length  
	     * @return  
	     */  
	    public static String splitAndFilterString(String input, int length) {   
	        if (input == null || input.trim().equals("")) {   
	           return "";   
	        }   
	        // 去掉所有html元素,   
	        String str = input.replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll(   
	                "<[^>]*>", "");   
	        str = str.replaceAll("[(/>)<]", "");   
	        int len = str.length();   
	        if (len <= length) {   
	            return str;   
	        } else {   
	            str = str.substring(0, length);   
	            str += "......";   
	        }   
	        return str;   
	    }  
	    /**
	     * 去掉字符串的html代码
	     * @param htmlStr 字符串
	     * @return 结果
	     */
	public static String htmlToStr(String  htmlStr){
		String result = "";
		boolean flag = true;
		if(htmlStr==null){
    		return null;
		 }
    	char[] a = htmlStr.toCharArray();
    	int length=a.length;
    	for(int i=0;i<length;i++){
    		if(a[i]=='<'){
    			flag=false;
    			continue;
    		}
    		if(a[i]=='>'){
    			flag=true;
    			continue;
    		}
    		if(flag==true){
    			result+=a[i];
    		}
    	}
    	return result.toString();   
	} 

	
	 /**
     * 字符串按字节截取
     * @param text 原字符
     * @param length 截取长度
     * @return String
     * @author 张能军
     */

	public static String splitString(String text, int length) {
    	 return splitString(text, length, "...");

     }

     /**
      * 字符串按字节截取
      * @param text 原字符
      * @param length 截取长度
      * @param endWith 替代符
      * @return String
      * @author 张能军
      */

	public static String splitString(String text,int length,String endWith) {
		if (text == null || "".equals(text)) {
			return "";
		}
		if(length <= 0 ){
			return "";
		}
		int textLength = text.length();  
        int byteLength = 0;  
        StringBuffer returnStr =  new StringBuffer();
        String returnString ="";
        for(int i = 0; i<textLength && byteLength < length*2; i++){  
            String str_i = text.substring(i, i+1);   
            if(str_i.getBytes().length == 1){//英文  
                byteLength++;  
            }else{//中文  
                byteLength += 2 ;  
            }  
            returnStr.append(str_i);  
        }
        try {  
            if(byteLength<text.getBytes("GBK").length){//getBytes("GBK")每个汉字长2，getBytes("UTF-8")每个汉字长度为3  
                returnStr.append(endWith);  
            }  
            
            returnString = returnStr.toString();
            if(returnString.getBytes("GBK").length % 2 == 1 ){ //存在单数英文字符少截取一个字，避免显示错位。例如:“KHS单车生活馆”截取4个汉字时
            	returnString = returnString.substring(0, returnString.length()-1);
            }
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        
        return returnString;

	}
	public static String leftTime(Date RegistrationDeadline) throws ParseException{
		
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String systemTime = sdf.format(new Date()).toString();
		 Date sysTime = sdf.parse(systemTime);
		  //将截取到的时间字符串转化为时间格式的字符串
		  Date beginTime=RegistrationDeadline;   
		  String bgTime = sdf.format(beginTime).toString();
		  Date bgeTime = sdf.parse(bgTime);
		  //默认为毫秒，除以1000是为了转换成秒
		  long interval=(bgeTime.getTime()-sysTime.getTime())/1000;//秒
		  long day=interval/(24*3600);//天
		  long hour=interval%(24*3600)/3600;//小时
		  long minute=interval%3600/60;//分钟
		  if(interval<0){
			  return "";
		  }
		  return  "还有"+day+"天"+hour+"小时"+minute+"分";
	}

	public static String escapeSQLLike(String likeStr) {
        String str = StringUtils.replace(likeStr, "_", "\\_");
        str = StringUtils.replace(str, "%", "\\%");
        return str;
    }
	/***
	 * 抽取在动态内容中@id的userId
	 * @param content
	 * @return
	 */
	public static List<String> getUserIdsFromContent(String content){
		if(content==null||content.trim().length()==0)return null;
		Matcher mc = DYNAMIC_PATTERN.matcher(content);
		List<String> ids = new ArrayList<String>();
 	    while (mc.find()) {
	        String userUrl = mc.group();
	        String userId = userUrl.substring(1).trim();
	        if(!ids.contains(userId))ids.add(userId);
		}
	    return ids;
	}
	
    public static void main(String[] args) {
    	
        // TODO Auto-generated method stub   
//        String content="<p class=&quot;p0&quot; style=&quot;MARGIN: 0pt 40.8pt; WORD-BREAK: break-all; LINE-HEIGHT: 15.6pt; TEXT-ALIGN: left&quot;><span style=&quot;FONT-SIZE: 8pt; COLOR: rgb(0,0,0); FONT-FAMILY: &#8217;&#718;&#805;&#8217;; mso-spacerun: &#8217;yes&#8217;&quot;>有居民来咨询，男方户籍在本地，女方户籍在省外且是农业户籍的，<font face=&quot;Arial&quot;>如何办理生殖健康服务证</font>。</span><span style=&quot;FONT-SIZE: 8pt; COLOR: rgb(0,0,0); FONT-FAMILY: &#8217;&#718;&#805;&#8217;; mso-spacerun: &#8217;yes&#8217;&quot;><o:p></o:p></span></p><p class=&quot;p0&quot; style=&quot;MARGIN-TOP: 0pt; MARGIN-BOTTOM: 0pt&quot;>&nbsp;</p><!--EndFragment-->";   
//        content=htmlToStr(content);  
//        System.out.println(content);   
        
//        String text = "。发.。篇>所q阿s似hf的f＊*发千万s";  
//        for(int i = 0; i< text.length();i++){  
//            String s = StringUtil.splitString(text,i+1,"...");  
//            System.out.println(s+"--------------------------"+(i+1));  
//        }  
    	
    	System.out.println(splitString("KHS单车生活馆",4,""));
    }  
	
}
