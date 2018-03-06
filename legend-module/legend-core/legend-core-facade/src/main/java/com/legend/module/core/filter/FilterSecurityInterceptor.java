package com.legend.module.core.filter;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSourceAware;

import javax.servlet.Filter;

/**
 * @author Administrator
 * @date 2018/3/4
 */
public interface FilterSecurityInterceptor extends InitializingBean,
        ApplicationEventPublisherAware, MessageSourceAware, Filter {
}
