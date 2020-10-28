package dagger.hilt.android.internal.testing;

import ch.epfl.sweng.project.WeatherActivityTest;
import ch.epfl.sweng.project.WeatherActivityTest_ComponentDataHolder;
import java.lang.Class;
import java.lang.Override;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class TestComponentDataSupplierImpl extends TestComponentDataSupplier {
  private final Map<Class<?>, TestComponentData> testComponentDataMap = new HashMap<>(1);

  TestComponentDataSupplierImpl() {
    testComponentDataMap.put(WeatherActivityTest.class, WeatherActivityTest_ComponentDataHolder.get());
  }

  @Override
  protected Map<Class<?>, TestComponentData> get() {
    return testComponentDataMap;
  }
}
