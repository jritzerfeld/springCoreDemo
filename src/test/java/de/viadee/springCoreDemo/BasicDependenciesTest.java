package de.viadee.springCoreDemo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(MyConfiguration.class)
public class BasicDependenciesTest { // NOPMD

    @Autowired
    private String hey;

    @Autowired
    private SampleController sampleController;

    @Test
    public void testAutowireString() {
        assertNotNull("The greeting string should be injected here.", hey);
    }

    @Test
    public void testAutowireController() {
        assertNotNull("The sample controller singleton should be injeceted here", sampleController);
    }

}
