package com.shang.spary.modules.controller.manage.news;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.shang.spary.modules.mapper.news.News;
import com.shang.spary.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * info:资讯内容
 * Created by shang on 16/6/14.
 */
@Controller
@RequestMapping("/news")
public class NewsController extends BaseController{


	/**资讯列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/list")
	public Map<String,Object> list(){
		Map<String,Object> map=new HashMap<>();
		Page<News> newses=newsService.selectPageAll(1,3);
		PageInfo<News> pageInfo=new PageInfo<>(newses);
		_logger.info("------info------");
		map.put("newses",pageInfo);
		return map;
	}
	

}
