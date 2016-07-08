package com.shang.spray.modules.service;

import com.shang.spray.common.base.BaseServiceImpl;
import com.shang.spray.modules.entity.News;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NewsServiceImpl extends BaseServiceImpl<News> implements NewsService {

}
