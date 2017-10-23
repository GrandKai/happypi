package com.magic.happypi.base;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: GrandKai
 * @create: 2017-09-16 21:50
 */
@ControllerAdvice
public class BaseController {


    @InitBinder()
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));

    }



    protected final Logger log = LoggerFactory.getLogger(this.getClass());

//	@Value("${customResourceSettings.page.title}")
//	private String pageTitle;

    public BaseController() {
    }
//
//    @ExceptionHandler({Throwable.class})
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public JSONResult throwableHandler(Exception exception) {
//        HttpServletRequest request = HttpContextUtils.getRequest();
//        this.log.error("运行时异常, URL:{}, Content-Type:{}, Params:{}, Method:{}, Protocol:{}, IP:{},  Cookie:{}, UserAgent:{}, exceptionStackTrace:{}", new Object[]{request.getRequestURL(), request.getContentType(), request.getQueryString(), request.getMethod(), request.getProtocol(),
//                HttpContextUtils.getRequestIp(), HttpCookieUtils.getCookieValues(request), request.getHeader("User-Agent"), SystemException.getStackTrace(exception)});
//        return new JSONResult().setException("不好意思，我们出了点小问题，请稍后重试");
//    }
//
//    //    @ExceptionHandler({ForbiddenException.class})
//    @ResponseStatus(HttpStatus.FORBIDDEN)
//    public JSONResult forbiddenExceptionHandler(Exception exception) {
//        this.log.warn(exception.getMessage());
//        return new JSONResult().setException(exception.getMessage());
//    }
//
//
//    @ExceptionHandler({IllegalArgumentException.class})
//    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
//    public JSONResult illegalArgumentHandler(Exception exception) {
//        this.log.warn(exception.getMessage());
//        return new JSONResult().setException(exception.getMessage());
//    }
//
//    @ExceptionHandler({HttpMessageNotReadableException.class})
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public JSONResult httpMessageNotReadableHandler(Exception exception) {
//        this.log.warn(exception.getMessage());
//        return new JSONResult().setException("请传入json格式body参数");
//    }
//
//    @ExceptionHandler({HttpMediaTypeNotSupportedException.class})
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public JSONResult httpMediaTypeNotSupportedExceptionHandler(Exception exception) {
//        this.log.warn(exception.getMessage());
//        return new JSONResult().setException("请设置Content-Type:application/json;charset=UTF-8");
//    }
//
//    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
//    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
//    public JSONResult httpRequestMethodNotSupportedHandler(Exception exception) {
//        this.log.warn(exception.getMessage());
//        return new JSONResult().setException("请求方式错误,请确认get/post/put/delete/option/head");
//    }
//
//    @InitBinder
//    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
//    }
//
//    /**
//     * 向ModelMap中绑定请求属性
//     */
//    @ModelAttribute
//    protected ModelMap modelBinder(HttpServletRequest request, ModelMap model) {
//        model.clear();
//        model.addAllAttributes(Util.getParameterValues(request));
//        SessionUser sessionUser = (SessionUser)request.getSession().getAttribute(ConstantUtil.SESSION_USER);
//        if(sessionUser != null){
//            model.put(ConstantUtil.SESSION_USER_ID,sessionUser.getUser().getUserId());
//            model.put(ConstantUtil.SESSION_USER,(SessionUser)request.getSession().getAttribute(ConstantUtil.SESSION_USER));
//        }
////		model.addAttribute("pageTitle", pageTitle);
//        return model;
//    }



    /**
     * 获取请求属性封装为Map类型
     *
     * @param request
     * @return
     */
    protected Map<String, Object> getRequestParameter(HttpServletRequest request) {
        Map<String, Object> conditions = new HashMap<>(16);
        Map map = request.getParameterMap();
        for (Object o : map.keySet()) {
            String key = (String) o;
            conditions.put(key, ((String[]) map.get(key))[0]);
        }
        String pageNumber = request.getParameter("pageNumber");
        String pageSize = request.getParameter("pageSize");

        // 处理分页信息
        if (StringUtils.isNotEmpty(pageNumber) && StringUtils.isNotEmpty(pageSize)) {
            Integer pageNumberInteger = Integer.valueOf(pageNumber);
            Integer pageSizeInteger = Integer.valueOf(pageSize);
            Integer limit = this.getLimit(pageNumberInteger, pageSizeInteger);
            conditions.put("limit", limit);
            conditions.put("offset", pageSizeInteger);

            conditions.remove("pageNumber");
            conditions.remove("pageSize");
        }

        return conditions;
    }

    /**
     * 获取分页参数
     *
     * @param pageNumber
     * @param pageSize
     * @return
     */
    protected int getLimit(Integer pageNumber, Integer pageSize) {
        int limit = 1;
        if (null != pageNumber && 0 != pageNumber) {
            limit = (pageNumber - 1) * pageSize;
        }
        return limit;
    }

    public ResponseEntity<byte[]> download(String fileName, File file) throws IOException {
        String dfileName = new String(fileName.getBytes("UTF-8"), "iso8859-1");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", dfileName);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }

    protected Result result = null;
}
