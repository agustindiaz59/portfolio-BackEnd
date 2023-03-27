package com.portfolio.api.services;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EducacionService}.
 */
public class EducacionService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EducacionService apply(RegisteredBean registeredBean, EducacionService instance) {
    AutowiredFieldValueResolver.forRequiredField("eduRepo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
