package com.shang.spary.common.base;

import com.shang.spary.modules.service.news.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

	@Autowired
	protected NewsService newsService;

	protected final Logger _logger = LoggerFactory.getLogger(getClass());

	protected BaseApiResult sucResult(String content) {
		return new BaseApiResult(BaseApiResult.ApiResultCode.SUC, content);
	}

	protected BaseApiResult failResult(String content) {
		return new BaseApiResult(BaseApiResult.ApiResultCode.FAIL, content);
	}

}
