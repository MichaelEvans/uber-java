package org.michaelevans.uber;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

import org.michaelevans.uber.services.UberService;

import retrofit.RestAdapter;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testName() throws Exception {
        UberService uber = new Uber().setApiKey(getContext().getString(R.string.api_key)).getRestAdapter().create(UberService.class);
    }
}