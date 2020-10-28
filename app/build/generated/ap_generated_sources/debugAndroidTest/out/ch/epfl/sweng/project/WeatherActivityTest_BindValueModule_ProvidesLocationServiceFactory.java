package ch.epfl.sweng.project;

import ch.epfl.sweng.project.location.LocationService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherActivityTest_BindValueModule_ProvidesLocationServiceFactory implements Factory<LocationService> {
  private final Provider<WeatherActivityTest> testProvider;

  public WeatherActivityTest_BindValueModule_ProvidesLocationServiceFactory(
      Provider<WeatherActivityTest> testProvider) {
    this.testProvider = testProvider;
  }

  @Override
  public LocationService get() {
    return providesLocationService(testProvider.get());
  }

  public static WeatherActivityTest_BindValueModule_ProvidesLocationServiceFactory create(
      Provider<WeatherActivityTest> testProvider) {
    return new WeatherActivityTest_BindValueModule_ProvidesLocationServiceFactory(testProvider);
  }

  public static LocationService providesLocationService(WeatherActivityTest test) {
    return Preconditions.checkNotNull(WeatherActivityTest_BindValueModule.providesLocationService(test), "Cannot return null from a non-@Nullable @Provides method");
  }
}
