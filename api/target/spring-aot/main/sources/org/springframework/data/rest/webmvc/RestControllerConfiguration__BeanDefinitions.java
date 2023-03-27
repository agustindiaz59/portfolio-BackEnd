package org.springframework.data.rest.webmvc;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.repository.support.Repositories;
import org.springframework.data.repository.support.RepositoryInvokerFactory;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.RepositoryResourceMappings;
import org.springframework.data.rest.webmvc.alps.AlpsController;
import org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverter;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.server.EntityLinks;

/**
 * Bean definitions for {@link RestControllerConfiguration}
 */
public class RestControllerConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.data.rest.webmvc.RestControllerConfiguration'.
   */
  private static BeanInstanceSupplier<RestControllerConfiguration> getRestControllerConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RestControllerConfiguration>forConstructor(RepositoryRestConfiguration.class, RepositoryResourceMappings.class, PagedResourcesAssembler.class, Repositories.class)
            .withGenerator((registeredBean, args) -> new RestControllerConfiguration(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'restControllerConfiguration'
   */
  public static BeanDefinition getRestControllerConfigurationBeanDefinition() {
    Class<?> beanType = RestControllerConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRestControllerConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositoryController'.
   */
  private static BeanInstanceSupplier<RepositoryController> getRepositoryControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositoryController>forFactoryMethod(RestControllerConfiguration.class, "repositoryController", EntityLinks.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RestControllerConfiguration.class).repositoryController(args.get(0)));
  }

  /**
   * Get the bean definition for 'repositoryController'
   */
  public static BeanDefinition getRepositoryControllerBeanDefinition() {
    Class<?> beanType = RepositoryController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoryControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositoryEntityController'.
   */
  private static BeanInstanceSupplier<RepositoryEntityController> getRepositoryEntityControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositoryEntityController>forFactoryMethod(RestControllerConfiguration.class, "repositoryEntityController", RepositoryEntityLinks.class, HttpHeadersPreparer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RestControllerConfiguration.class).repositoryEntityController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'repositoryEntityController'
   */
  public static BeanDefinition getRepositoryEntityControllerBeanDefinition() {
    Class<?> beanType = RepositoryEntityController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoryEntityControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositoryPropertyReferenceController'.
   */
  private static BeanInstanceSupplier<RepositoryPropertyReferenceController> getRepositoryPropertyReferenceControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositoryPropertyReferenceController>forFactoryMethod(RestControllerConfiguration.class, "repositoryPropertyReferenceController", RepositoryInvokerFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RestControllerConfiguration.class).repositoryPropertyReferenceController(args.get(0)));
  }

  /**
   * Get the bean definition for 'repositoryPropertyReferenceController'
   */
  public static BeanDefinition getRepositoryPropertyReferenceControllerBeanDefinition() {
    Class<?> beanType = RepositoryPropertyReferenceController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositoryPropertyReferenceControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositorySearchController'.
   */
  private static BeanInstanceSupplier<RepositorySearchController> getRepositorySearchControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositorySearchController>forFactoryMethod(RestControllerConfiguration.class, "repositorySearchController", RepositoryEntityLinks.class, HttpHeadersPreparer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RestControllerConfiguration.class).repositorySearchController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'repositorySearchController'
   */
  public static BeanDefinition getRepositorySearchControllerBeanDefinition() {
    Class<?> beanType = RepositorySearchController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositorySearchControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'repositorySchemaController'.
   */
  private static BeanInstanceSupplier<RepositorySchemaController> getRepositorySchemaControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RepositorySchemaController>forFactoryMethod(RestControllerConfiguration.class, "repositorySchemaController", PersistentEntityToJsonSchemaConverter.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(RestControllerConfiguration.class).repositorySchemaController(args.get(0)));
  }

  /**
   * Get the bean definition for 'repositorySchemaController'
   */
  public static BeanDefinition getRepositorySchemaControllerBeanDefinition() {
    Class<?> beanType = RepositorySchemaController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getRepositorySchemaControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'alpsController'.
   */
  private static BeanInstanceSupplier<AlpsController> getAlpsControllerInstanceSupplier() {
    return BeanInstanceSupplier.<AlpsController>forFactoryMethod(RestControllerConfiguration.class, "alpsController")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RestControllerConfiguration.class).alpsController());
  }

  /**
   * Get the bean definition for 'alpsController'
   */
  public static BeanDefinition getAlpsControllerBeanDefinition() {
    Class<?> beanType = AlpsController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getAlpsControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'profileController'.
   */
  private static BeanInstanceSupplier<ProfileController> getProfileControllerInstanceSupplier() {
    return BeanInstanceSupplier.<ProfileController>forFactoryMethod(RestControllerConfiguration.class, "profileController")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(RestControllerConfiguration.class).profileController());
  }

  /**
   * Get the bean definition for 'profileController'
   */
  public static BeanDefinition getProfileControllerBeanDefinition() {
    Class<?> beanType = ProfileController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getProfileControllerInstanceSupplier());
    return beanDefinition;
  }
}
