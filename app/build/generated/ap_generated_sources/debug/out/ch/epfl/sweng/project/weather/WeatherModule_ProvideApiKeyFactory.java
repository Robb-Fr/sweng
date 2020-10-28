package ch.epfl.sweng.project.weather;

import android.content.Context;
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
public final class WeatherModule_ProvideApiKeyFactory implements Factory<String> {
  private final Provider<Context> contextProvider;

  public WeatherModule_ProvideApiKeyFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public String get() {
    return provideApiKey(contextProvider.get());
  }

  public static WeatherModule_ProvideApiKeyFactory create(Provider<Context> contextProvider) {
    return new WeatherModule_ProvideApiKeyFactory(contextProvider);
  }

  public static String provideApiKey(Context context) {
    return Preconditions.checkNotNull(WeatherModule.provideApiKey(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
