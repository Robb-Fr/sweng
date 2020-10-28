package ch.epfl.sweng.project.geocoding;

import android.content.Context;
import android.location.Geocoder;
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
public final class GeocodingModule_ProvideGeocoderFactory implements Factory<Geocoder> {
  private final Provider<Context> contextProvider;

  public GeocodingModule_ProvideGeocoderFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Geocoder get() {
    return provideGeocoder(contextProvider.get());
  }

  public static GeocodingModule_ProvideGeocoderFactory create(Provider<Context> contextProvider) {
    return new GeocodingModule_ProvideGeocoderFactory(contextProvider);
  }

  public static Geocoder provideGeocoder(Context context) {
    return Preconditions.checkNotNull(GeocodingModule.provideGeocoder(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
