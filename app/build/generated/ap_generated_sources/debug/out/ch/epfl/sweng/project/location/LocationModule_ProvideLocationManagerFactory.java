package ch.epfl.sweng.project.location;

import android.content.Context;
import android.location.LocationManager;
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
public final class LocationModule_ProvideLocationManagerFactory implements Factory<LocationManager> {
  private final Provider<Context> contextProvider;

  public LocationModule_ProvideLocationManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public LocationManager get() {
    return provideLocationManager(contextProvider.get());
  }

  public static LocationModule_ProvideLocationManagerFactory create(
      Provider<Context> contextProvider) {
    return new LocationModule_ProvideLocationManagerFactory(contextProvider);
  }

  public static LocationManager provideLocationManager(Context context) {
    return Preconditions.checkNotNull(LocationModule.provideLocationManager(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
