package ch.epfl.sweng.project;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.internal.testing.TestInjector;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;
import javax.annotation.Generated;

@OriginatingElement(
    topLevelClass = WeatherActivityTest.class
)
@GeneratedEntryPoint
@InstallIn(ApplicationComponent.class)
@Generated("dagger.hilt.processor.internal.root.TestInjectorGenerator")
public interface WeatherActivityTest_GeneratedInjector extends TestInjector<WeatherActivityTest> {
  void injectTest(WeatherActivityTest weatherActivityTest);
}
