package com.portfolio.api.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ApiController}
 */
public class ApiController__BeanDefinitions {
  /**
   * Get the bean definition for 'apiController'
   */
  public static BeanDefinition getApiControllerBeanDefinition() {
    Class<?> beanType = ApiController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<ApiController> instanceSupplier = InstanceSupplier.using(ApiController::new);
    instanceSupplier = instanceSupplier.andThen(ApiController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
