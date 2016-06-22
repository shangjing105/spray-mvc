package com.shang.spary.modules.service.news;

import com.shang.spary.common.base.BaseServiceImpl;
import com.shang.spary.modules.mapper.news.News;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NewsServiceImpl extends BaseServiceImpl<News> implements NewsService {


}
