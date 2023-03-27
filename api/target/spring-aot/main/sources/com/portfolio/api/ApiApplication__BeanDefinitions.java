package com.portfolio.api;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link ApiApplication}
 */
public class ApiApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'apiApplication'
   */
  public static BeanDefinition getApiApplicationBeanDefinition() {
    Class<?> beanType = ApiApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(ApiApplication.class);
    beanDefinition.setInstanceSupplier(ApiApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
