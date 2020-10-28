package ch.epfl.sweng.project.weather;

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
public final class OpenWeatherMapWeatherService_Factory implements Factory<OpenWeatherMapWeatherService> {
  private final Provider<String> apiKeyProvider;

  public OpenWeatherMapWeatherService_Factory(Provider<String> apiKeyProvider) {
    this.apiKeyProvider = apiKeyProvider;
  }

  @Override
  public OpenWeatherMapWeatherService get() {
    return newInstance(apiKeyProvider.get());
  }

  public static OpenWeatherMapWeatherService_Factory create(Provider<String> apiKeyProvider) {
    return new OpenWeatherMapWeatherService_Factory(apiKeyProvider);
  }

  public static OpenWeatherMapWeatherService newInstance(String apiKey) {
    return new OpenWeatherMapWeatherService(apiKey);
  }
}
