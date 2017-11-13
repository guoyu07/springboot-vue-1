package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求日志
 *
 * @author jiangchong
 * @since 2017/8/23 13:28
 */
@Aspect
@Component
public class WebLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebLogger.class);

    @Pointcut("execution(public * com.example.controller.*.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = null;
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        try {
            LOGGER.info("【URL】: {}", request.getRequestURL().toString());
            LOGGER.info("【HTTP_METHOD】: {}", request.getMethod());
            LOGGER.info("【IP】: {}", request.getRemoteAddr());
            LOGGER.info("【QUERY_PARAMS】: {}", request.getQueryString());
            LOGGER.info("【CLASS_METHOD】: {}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
            LOGGER.info("【ARGS】: {}", joinPoint.getArgs());

            obj = joinPoint.proceed(joinPoint.getArgs());

            LOGGER.info("【RESPONSE】: {}", obj.toString());

        } catch (Exception e) {
            LOGGER.error("【ERROR】: {}", e.getMessage());
        }

        return obj;
    }
}
