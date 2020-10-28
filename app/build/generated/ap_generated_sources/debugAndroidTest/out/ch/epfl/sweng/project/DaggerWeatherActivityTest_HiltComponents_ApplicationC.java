package ch.epfl.sweng.project;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import ch.epfl.sweng.project.geocoding.GeocodingService;
import ch.epfl.sweng.project.location.LocationService;
import ch.epfl.sweng.project.weather.WeatherService;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.Preconditions;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerWeatherActivityTest_HiltComponents_ApplicationC extends WeatherActivityTest_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private DaggerWeatherActivityTest_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private WeatherActivityTest getWeatherActivityTest() {
    return WeatherActivityTest_BindValueModule_ProvidesWeatherActivityTestFactory.providesWeatherActivityTest(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));}

  private LocationService getLocationService() {
    return WeatherActivityTest_BindValueModule_ProvidesLocationServiceFactory.providesLocationService(getWeatherActivityTest());}

  private WeatherService getWeatherService() {
    return WeatherActivityTest_BindValueModule_ProvidesWeatherServiceFactory.providesWeatherService(getWeatherActivityTest());}

  private GeocodingService getGeocodingService() {
    return WeatherActivityTest_BindValueModule_ProvidesGeocodingServiceFactory.providesGeocodingService(getWeatherActivityTest());}

  @Override
  public void injectSwengApplication(SwengApplication arg0) {
  }

  @Override
  public void injectTest(WeatherActivityTest weatherActivityTest) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();}

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();}

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder weatherActivityTest_BindValueModule(
        WeatherActivityTest_BindValueModule weatherActivityTest_BindValueModule) {
      Preconditions.checkNotNull(weatherActivityTest_BindValueModule);
      return this;
    }

    public WeatherActivityTest_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerWeatherActivityTest_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements WeatherActivityTest_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public WeatherActivityTest_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends WeatherActivityTest_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();}

    private final class ActivityCBuilder implements WeatherActivityTest_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public WeatherActivityTest_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends WeatherActivityTest_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      @Override
      public void injectWeatherActivity(WeatherActivity arg0) {
        injectWeatherActivity2(arg0);}

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return ImmutableSet.<ViewModelProvider.Factory>of();}

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();}

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();}

      @CanIgnoreReturnValue
      private WeatherActivity injectWeatherActivity2(WeatherActivity instance) {
        WeatherActivity_MembersInjector.injectMLocationService(instance, DaggerWeatherActivityTest_HiltComponents_ApplicationC.this.getLocationService());
        WeatherActivity_MembersInjector.injectMWeatherService(instance, DaggerWeatherActivityTest_HiltComponents_ApplicationC.this.getWeatherService());
        WeatherActivity_MembersInjector.injectMGeocodingService(instance, DaggerWeatherActivityTest_HiltComponents_ApplicationC.this.getGeocodingService());
        return instance;
      }

      private final class FragmentCBuilder implements WeatherActivityTest_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public WeatherActivityTest_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends WeatherActivityTest_HiltComponents.FragmentC {
        private FragmentCImpl(Fragment fragment) {

        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return ImmutableSet.<ViewModelProvider.Factory>of();}

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();}

        private final class ViewWithFragmentCBuilder implements WeatherActivityTest_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public WeatherActivityTest_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends WeatherActivityTest_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements WeatherActivityTest_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public WeatherActivityTest_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends WeatherActivityTest_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }
  }

  private final class ServiceCBuilder implements WeatherActivityTest_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public WeatherActivityTest_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends WeatherActivityTest_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
