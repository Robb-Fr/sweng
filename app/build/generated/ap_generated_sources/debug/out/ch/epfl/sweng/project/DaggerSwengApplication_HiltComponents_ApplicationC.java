package ch.epfl.sweng.project;

import android.app.Activity;
import android.app.Service;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.LocationManager;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import ch.epfl.sweng.project.geocoding.AndroidGeocodingService;
import ch.epfl.sweng.project.geocoding.AndroidGeocodingService_Factory;
import ch.epfl.sweng.project.geocoding.GeocodingModule_ProvideGeocoderFactory;
import ch.epfl.sweng.project.location.AndroidLocationService;
import ch.epfl.sweng.project.location.AndroidLocationService_Factory;
import ch.epfl.sweng.project.location.LocationModule;
import ch.epfl.sweng.project.location.LocationModule_ProvideCriteriaFactory;
import ch.epfl.sweng.project.location.LocationModule_ProvideLocationManagerFactory;
import ch.epfl.sweng.project.weather.OpenWeatherMapWeatherService;
import ch.epfl.sweng.project.weather.OpenWeatherMapWeatherService_Factory;
import ch.epfl.sweng.project.weather.WeatherModule_ProvideApiKeyFactory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
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
public final class DaggerSwengApplication_HiltComponents_ApplicationC extends SwengApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object locationManager = new MemoizedSentinel();

  private volatile Object criteria = new MemoizedSentinel();

  private volatile Object androidLocationService = new MemoizedSentinel();

  private volatile Object openWeatherMapWeatherService = new MemoizedSentinel();

  private volatile Object androidGeocodingService = new MemoizedSentinel();

  private DaggerSwengApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private LocationManager getLocationManager() {
    Object local = locationManager;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = locationManager;
        if (local instanceof MemoizedSentinel) {
          local = LocationModule_ProvideLocationManagerFactory.provideLocationManager(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          locationManager = DoubleCheck.reentrantCheck(locationManager, local);
        }
      }
    }
    return (LocationManager) local;
  }

  private Criteria getCriteria() {
    Object local = criteria;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = criteria;
        if (local instanceof MemoizedSentinel) {
          local = LocationModule_ProvideCriteriaFactory.provideCriteria();
          criteria = DoubleCheck.reentrantCheck(criteria, local);
        }
      }
    }
    return (Criteria) local;
  }

  private String getLocationProviderString() {
    return LocationModule.provideLocationProvider(getLocationManager(), getCriteria());}

  private AndroidLocationService getAndroidLocationService() {
    Object local = androidLocationService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = androidLocationService;
        if (local instanceof MemoizedSentinel) {
          local = AndroidLocationService_Factory.newInstance(getLocationManager(), getLocationProviderString(), getCriteria());
          androidLocationService = DoubleCheck.reentrantCheck(androidLocationService, local);
        }
      }
    }
    return (AndroidLocationService) local;
  }

  private String getApiKeyString() {
    return WeatherModule_ProvideApiKeyFactory.provideApiKey(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));}

  private OpenWeatherMapWeatherService getOpenWeatherMapWeatherService() {
    Object local = openWeatherMapWeatherService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = openWeatherMapWeatherService;
        if (local instanceof MemoizedSentinel) {
          local = OpenWeatherMapWeatherService_Factory.newInstance(getApiKeyString());
          openWeatherMapWeatherService = DoubleCheck.reentrantCheck(openWeatherMapWeatherService, local);
        }
      }
    }
    return (OpenWeatherMapWeatherService) local;
  }

  private Geocoder getGeocoder() {
    return GeocodingModule_ProvideGeocoderFactory.provideGeocoder(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));}

  private AndroidGeocodingService getAndroidGeocodingService() {
    Object local = androidGeocodingService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = androidGeocodingService;
        if (local instanceof MemoizedSentinel) {
          local = AndroidGeocodingService_Factory.newInstance(getGeocoder());
          androidGeocodingService = DoubleCheck.reentrantCheck(androidGeocodingService, local);
        }
      }
    }
    return (AndroidGeocodingService) local;
  }

  @Override
  public void injectSwengApplication(SwengApplication swengApplication) {
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

    public SwengApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerSwengApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements SwengApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public SwengApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends SwengApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();}

    private final class ActivityCBuilder implements SwengApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public SwengApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends SwengApplication_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      @Override
      public void injectWeatherActivity(WeatherActivity weatherActivity) {
        injectWeatherActivity2(weatherActivity);}

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>emptySet();}

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();}

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();}

      private WeatherActivity injectWeatherActivity2(WeatherActivity instance) {
        WeatherActivity_MembersInjector.injectMLocationService(instance, DaggerSwengApplication_HiltComponents_ApplicationC.this.getAndroidLocationService());
        WeatherActivity_MembersInjector.injectMWeatherService(instance, DaggerSwengApplication_HiltComponents_ApplicationC.this.getOpenWeatherMapWeatherService());
        WeatherActivity_MembersInjector.injectMGeocodingService(instance, DaggerSwengApplication_HiltComponents_ApplicationC.this.getAndroidGeocodingService());
        return instance;
      }

      private final class FragmentCBuilder implements SwengApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public SwengApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends SwengApplication_HiltComponents.FragmentC {
        private FragmentCImpl(Fragment fragment) {

        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>emptySet();}

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();}

        private final class ViewWithFragmentCBuilder implements SwengApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public SwengApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends SwengApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements SwengApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public SwengApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends SwengApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }
    }
  }

  private final class ServiceCBuilder implements SwengApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public SwengApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends SwengApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
