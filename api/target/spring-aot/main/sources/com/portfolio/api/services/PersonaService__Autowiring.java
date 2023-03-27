package com.portfolio.api.services;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link PersonaService}.
 */
public class PersonaService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static PersonaService apply(RegisteredBean registeredBean, PersonaService instance) {
    AutowiredFieldValueResolver.forRequiredField("persoRepo").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
