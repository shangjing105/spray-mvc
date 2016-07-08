package com.shang.spray.modules.controller.web;

import com.github.pagehelper.PageInfo;
import com.shang.spray.common.base.BaseApiResult;
import com.shang.spray.common.base.BaseController;
import com.shang.spray.modules.entity.News;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * info:精选web接口
 * Created by shang on 16/6/22.
 */
@Controller
@RequestMapping("/select")
public class SelectController extends BaseController{


    @RequestMapping(value = "")
    public String index(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "10") Integer pageSize, Model model) {
        List<News> newses=newsService.selectPageAll(pageNum,pageSize);
        PageInfo<News> pageInfo=new PageInfo<>(newses);

        model.addAttribute(pageInfo);
        model.addAttribute(BaseApiResult.successResult());
        return "/index";
    }


    @RequestMapping(value = "/get")
    public String get(Integer id, Model model) {

        News news=newsService.selectByPrimaryKey(id);

        model.addAttribute(news);
        model.addAttribute(BaseApiResult.successResult());
        return "/index";
    }


}
