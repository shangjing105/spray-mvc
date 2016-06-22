package com.shang.spary.common.base;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleMappingExceptionResolver extends org.springframework.web.servlet.handler.SimpleMappingExceptionResolver {
/*

    @Autowired
    private ExceptionRecordMapper exceptionRecordMapper;

    /
     * 打印简单错误日志
     */

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) {
//        exceptionRecordMapper.insertException(getExceptionContent(exception));
        exception.printStackTrace();
        return super.doResolveException(request, response, handler, exception);
    }


    private String getExceptionContent(Exception exception) {
        StringBuilder builder = new StringBuilder(exception.toString());
        StackTraceElement[] elements = exception.getStackTrace();
        builder.append("\n##########错误开始##########");
        for (StackTraceElement element : elements) {
            builder.append("\n#####类:").append(element.getClassName()).append("\t#####方法:").append(element.getMethodName()).append("\t#####行:").append(element.getLineNumber());
        }
        builder.append("\n##########错误结束##########");
        return builder.toString();
    }

}
