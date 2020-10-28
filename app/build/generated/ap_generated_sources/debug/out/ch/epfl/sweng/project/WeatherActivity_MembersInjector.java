package ch.epfl.sweng.project;

import ch.epfl.sweng.project.geocoding.GeocodingService;
import ch.epfl.sweng.project.location.LocationService;
import ch.epfl.sweng.project.weather.WeatherService;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class WeatherActivity_MembersInjector implements MembersInjector<WeatherActivity> {
  private final Provider<LocationService> mLocationServiceProvider;

  private final Provider<WeatherService> mWeatherServiceProvider;

  private final Provider<GeocodingService> mGeocodingServiceProvider;

  public WeatherActivity_MembersInjector(Provider<LocationService> mLocationServiceProvider,
      Provider<WeatherService> mWeatherServiceProvider,
      Provider<GeocodingService> mGeocodingServiceProvider) {
    this.mLocationServiceProvider = mLocationServiceProvider;
    this.mWeatherServiceProvider = mWeatherServiceProvider;
    this.mGeocodingServiceProvider = mGeocodingServiceProvider;
  }

  public static MembersInjector<WeatherActivity> create(
      Provider<LocationService> mLocationServiceProvider,
      Provider<WeatherService> mWeatherServiceProvider,
      Provider<GeocodingService> mGeocodingServiceProvider) {
    return new WeatherActivity_MembersInjector(mLocationServiceProvider, mWeatherServiceProvider, mGeocodingServiceProvider);}

  @Override
  public void injectMembers(WeatherActivity instance) {
    injectMLocationService(instance, mLocationServiceProvider.get());
    injectMWeatherService(instance, mWeatherServiceProvider.get());
    injectMGeocodingService(instance, mGeocodingServiceProvider.get());
  }

  @InjectedFieldSignature("ch.epfl.sweng.project.WeatherActivity.mLocationService")
  public static void injectMLocationService(WeatherActivity instance,
      LocationService mLocationService) {
    instance.mLocationService = mLocationService;
  }

  @InjectedFieldSignature("ch.epfl.sweng.project.WeatherActivity.mWeatherService")
  public static void injectMWeatherService(WeatherActivity instance,
      WeatherService mWeatherService) {
    instance.mWeatherService = mWeatherService;
  }

  @InjectedFieldSignature("ch.epfl.sweng.project.WeatherActivity.mGeocodingService")
  public static void injectMGeocodingService(WeatherActivity instance,
      GeocodingService mGeocodingService) {
    instance.mGeocodingService = mGeocodingService;
  }
}
