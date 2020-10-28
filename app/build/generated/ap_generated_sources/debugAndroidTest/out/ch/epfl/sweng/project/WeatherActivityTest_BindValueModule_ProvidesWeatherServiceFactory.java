package ch.epfl.sweng.project;

import ch.epfl.sweng.project.weather.WeatherService;
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
public final class WeatherActivityTest_BindValueModule_ProvidesWeatherServiceFactory implements Factory<WeatherService> {
  private final Provider<WeatherActivityTest> testProvider;

  public WeatherActivityTest_BindValueModule_ProvidesWeatherServiceFactory(
      Provider<WeatherActivityTest> testProvider) {
    this.testProvider = testProvider;
  }

  @Override
  public WeatherService get() {
    return providesWeatherService(testProvider.get());
  }

  public static WeatherActivityTest_BindValueModule_ProvidesWeatherServiceFactory create(
      Provider<WeatherActivityTest> testProvider) {
    return new WeatherActivityTest_BindValueModule_ProvidesWeatherServiceFactory(testProvider);
  }

  public static WeatherService providesWeatherService(WeatherActivityTest test) {
    return Preconditions.checkNotNull(WeatherActivityTest_BindValueModule.providesWeatherService(test), "Cannot return null from a non-@Nullable @Provides method");
  }
}
