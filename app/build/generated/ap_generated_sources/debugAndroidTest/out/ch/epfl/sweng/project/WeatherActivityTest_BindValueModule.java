package ch.epfl.sweng.project;

import android.content.Context;
import ch.epfl.sweng.project.geocoding.GeocodingService;
import ch.epfl.sweng.project.location.LocationService;
import ch.epfl.sweng.project.weather.WeatherService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.internal.testing.TestApplicationComponentManager;
import dagger.hilt.android.internal.testing.TestApplicationComponentManagerHolder;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.codegen.OriginatingElement;
import javax.annotation.Generated;

@OriginatingElement(
    topLevelClass = WeatherActivityTest.class
)
@Generated("dagger.hilt.android.processor.internal.bindvalue.BindValueGenerator")
@Module
@InstallIn(ApplicationComponent.class)
public final class WeatherActivityTest_BindValueModule {
  @Provides
  static WeatherActivityTest providesWeatherActivityTest(@ApplicationContext Context context) {
    return (WeatherActivityTest) ((TestApplicationComponentManager) ((TestApplicationComponentManagerHolder) context).componentManager()).getTestInstance();
  }

  @Provides
  static GeocodingService providesGeocodingService(WeatherActivityTest test) {
    return test.geocodingService;
  }

  @Provides
  static LocationService providesLocationService(WeatherActivityTest test) {
    return test.locationService;
  }

  @Provides
  static WeatherService providesWeatherService(WeatherActivityTest test) {
    return test.weatherService;
  }
}
