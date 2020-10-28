package ch.epfl.sweng.project;

import ch.epfl.sweng.project.geocoding.GeocodingService;
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
public final class WeatherActivityTest_BindValueModule_ProvidesGeocodingServiceFactory implements Factory<GeocodingService> {
  private final Provider<WeatherActivityTest> testProvider;

  public WeatherActivityTest_BindValueModule_ProvidesGeocodingServiceFactory(
      Provider<WeatherActivityTest> testProvider) {
    this.testProvider = testProvider;
  }

  @Override
  public GeocodingService get() {
    return providesGeocodingService(testProvider.get());
  }

  public static WeatherActivityTest_BindValueModule_ProvidesGeocodingServiceFactory create(
      Provider<WeatherActivityTest> testProvider) {
    return new WeatherActivityTest_BindValueModule_ProvidesGeocodingServiceFactory(testProvider);
  }

  public static GeocodingService providesGeocodingService(WeatherActivityTest test) {
    return Preconditions.checkNotNull(WeatherActivityTest_BindValueModule.providesGeocodingService(test), "Cannot return null from a non-@Nullable @Provides method");
  }
}
