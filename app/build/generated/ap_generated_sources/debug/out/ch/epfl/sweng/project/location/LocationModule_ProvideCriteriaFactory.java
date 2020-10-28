package ch.epfl.sweng.project.location;

import android.location.Criteria;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocationModule_ProvideCriteriaFactory implements Factory<Criteria> {
  @Override
  public Criteria get() {
    return provideCriteria();
  }

  public static LocationModule_ProvideCriteriaFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Criteria provideCriteria() {
    return Preconditions.checkNotNull(LocationModule.provideCriteria(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final LocationModule_ProvideCriteriaFactory INSTANCE = new LocationModule_ProvideCriteriaFactory();
  }
}
