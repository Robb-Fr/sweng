package ch.epfl.sweng.project.location;

import android.location.Criteria;
import android.location.LocationManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocationModule_ProvideLocationProviderFactory implements Factory<String> {
  private final Provider<LocationManager> locationManagerProvider;

  private final Provider<Criteria> locationCriteriaProvider;

  public LocationModule_ProvideLocationProviderFactory(
      Provider<LocationManager> locationManagerProvider,
      Provider<Criteria> locationCriteriaProvider) {
    this.locationManagerProvider = locationManagerProvider;
    this.locationCriteriaProvider = locationCriteriaProvider;
  }

  @Override
  @Nullable
  public String get() {
    return provideLocationProvider(locationManagerProvider.get(), locationCriteriaProvider.get());
  }

  public static LocationModule_ProvideLocationProviderFactory create(
      Provider<LocationManager> locationManagerProvider,
      Provider<Criteria> locationCriteriaProvider) {
    return new LocationModule_ProvideLocationProviderFactory(locationManagerProvider, locationCriteriaProvider);
  }

  @Nullable
  public static String provideLocationProvider(LocationManager locationManager,
      Criteria locationCriteria) {
    return LocationModule.provideLocationProvider(locationManager, locationCriteria);
  }
}
