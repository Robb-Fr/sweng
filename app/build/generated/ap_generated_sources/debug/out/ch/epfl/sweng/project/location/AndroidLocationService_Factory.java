package ch.epfl.sweng.project.location;

import android.location.Criteria;
import android.location.LocationManager;
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
public final class AndroidLocationService_Factory implements Factory<AndroidLocationService> {
  private final Provider<LocationManager> locationManagerProvider;

  private final Provider<String> locationProvider;

  private final Provider<Criteria> locationCriteriaProvider;

  public AndroidLocationService_Factory(Provider<LocationManager> locationManagerProvider,
      Provider<String> locationProvider, Provider<Criteria> locationCriteriaProvider) {
    this.locationManagerProvider = locationManagerProvider;
    this.locationProvider = locationProvider;
    this.locationCriteriaProvider = locationCriteriaProvider;
  }

  @Override
  public AndroidLocationService get() {
    return newInstance(locationManagerProvider.get(), locationProvider.get(), locationCriteriaProvider.get());
  }

  public static AndroidLocationService_Factory create(
      Provider<LocationManager> locationManagerProvider, Provider<String> locationProvider,
      Provider<Criteria> locationCriteriaProvider) {
    return new AndroidLocationService_Factory(locationManagerProvider, locationProvider, locationCriteriaProvider);
  }

  public static AndroidLocationService newInstance(LocationManager locationManager,
      String locationProvider, Criteria locationCriteria) {
    return new AndroidLocationService(locationManager, locationProvider, locationCriteria);
  }
}
