package ch.epfl.sweng.project.geocoding;

import android.location.Geocoder;
import dagger.internal.Factory;
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
public final class AndroidGeocodingService_Factory implements Factory<AndroidGeocodingService> {
  private final Provider<Geocoder> geocoderProvider;

  public AndroidGeocodingService_Factory(Provider<Geocoder> geocoderProvider) {
    this.geocoderProvider = geocoderProvider;
  }

  @Override
  public AndroidGeocodingService get() {
    return newInstance(geocoderProvider.get());
  }

  public static AndroidGeocodingService_Factory create(Provider<Geocoder> geocoderProvider) {
    return new AndroidGeocodingService_Factory(geocoderProvider);
  }

  public static AndroidGeocodingService newInstance(Geocoder geocoder) {
    return new AndroidGeocodingService(geocoder);
  }
}
