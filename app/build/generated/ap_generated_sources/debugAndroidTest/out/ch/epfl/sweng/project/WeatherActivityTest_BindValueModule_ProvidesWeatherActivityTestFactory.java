package ch.epfl.sweng.project;

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
public final class WeatherActivityTest_BindValueModule_ProvidesWeatherActivityTestFactory implements Factory<WeatherActivityTest> {
  private final Provider<Context> contextProvider;

  public WeatherActivityTest_BindValueModule_ProvidesWeatherActivityTestFactory(
      Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public WeatherActivityTest get() {
    return providesWeatherActivityTest(contextProvider.get());
  }

  public static WeatherActivityTest_BindValueModule_ProvidesWeatherActivityTestFactory create(
      Provider<Context> contextProvider) {
    return new WeatherActivityTest_BindValueModule_ProvidesWeatherActivityTestFactory(contextProvider);
  }

  public static WeatherActivityTest providesWeatherActivityTest(Context context) {
    return Preconditions.checkNotNull(WeatherActivityTest_BindValueModule.providesWeatherActivityTest(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
