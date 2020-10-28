package ch.epfl.sweng.project;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;
import javax.annotation.Generated;

@OriginatingElement(
    topLevelClass = SwengApplication.class
)
@GeneratedEntryPoint
@InstallIn(ApplicationComponent.class)
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.InjectorEntryPointGenerator")
public interface SwengApplication_GeneratedInjector {
  void injectSwengApplication(SwengApplication swengApplication);
}
