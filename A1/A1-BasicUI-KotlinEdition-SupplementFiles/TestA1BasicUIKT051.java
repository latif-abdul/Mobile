package org.aplas.basicapp;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest=Config.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestA1BasicUIKT051 extends ViewTestKT {
    private MainActivity activity;
    ResourceTest rsc;

    @Before
    public void initTest() {
        activity = Robolectric.buildActivity(MainActivity.class).create().get();
        rsc = new ResourceTest(activity.getResources());
    }

    @Test
    public void check_01_StringArray_Resources() {
        String[] expected = "°C,°F,K".split("\\,");
        rsc.testStringArrayResource("tempList",expected);
    }
}
