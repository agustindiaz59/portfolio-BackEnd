package com.portfolio.api.services;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ExperienciaService}.
 */
public class ExperienciaService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ExperienciaService apply(RegisteredBean registeredBean,
      ExperienciaService instance) {
    instance.repo = AutowiredFieldValueResolver.forRequiredField("repo").resolve(registeredBean);
    return instance;
  }
}
