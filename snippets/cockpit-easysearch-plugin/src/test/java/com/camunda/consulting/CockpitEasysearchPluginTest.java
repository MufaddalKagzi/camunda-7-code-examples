package com.camunda.consulting;

import org.camunda.bpm.cockpit.Cockpit;
import org.camunda.bpm.cockpit.plugin.spi.CockpitPlugin;
import org.camunda.bpm.cockpit.plugin.test.AbstractCockpitPluginTest;
import org.junit.Assert;
import org.junit.Test;

public class CockpitEasysearchPluginTest extends AbstractCockpitPluginTest {
  @Test
  public void testPluginDiscovery() {
    CockpitPlugin samplePlugin = Cockpit.getRuntimeDelegate().getAppPluginRegistry()
        .getPlugin("cockpit-easysearch-plugin");

    Assert.assertNotNull(samplePlugin);
  }
}
