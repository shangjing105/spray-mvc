package com.shang.spary.modules.controller.manage;

import com.shang.spary.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * info:后台主页
 * Created by shang on 16/6/14.
 */
@Controller
public class IndexController extends BaseController {



    @RequestMapping(value="/")
    public String login(){

        return "/login";
    }

    @RequestMapping(value="/index")
    public String index(){

        return "/index";
    }
}
