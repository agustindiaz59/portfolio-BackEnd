package com.portfolio.api.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ApiController}.
 */
public class ApiController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ApiController apply(RegisteredBean registeredBean, ApiController instance) {
    AutowiredFieldValueResolver.forRequiredField("eduService").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("persoService").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("habService").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("proyService").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("expService").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("personaRepository").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("educacionRepository").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("userService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
