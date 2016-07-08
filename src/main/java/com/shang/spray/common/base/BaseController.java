package com.shang.spray.common.base;

import com.shang.spray.modules.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

public class BaseController {

	@Autowired
	protected NewsService newsService;

	protected final Logger _logger = LoggerFactory.getLogger(getClass());


}
