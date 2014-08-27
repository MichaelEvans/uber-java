/*
 * Copyright 2014 Michael Evans <michaelcevans10@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.michaelevans.uber;

import junit.framework.TestCase;

import org.michaelevans.uber.services.UberService;

import java.util.Arrays;
import java.util.List;

import retrofit.RestAdapter;

public class BaseTest extends TestCase {
    private String[] PRODUCT_TYPES = {"uberX", "uberXL", "UberBLACK", "UberSUV", "uberTAXI"};

    private Uber uber = new Uber();

    private String API_KEY = "";

    @Override
    public void setUp() throws Exception {
        if(API_KEY.isEmpty()){
            throw new RuntimeException("You need to fill out your API key in BaseTest.java");
        }
        uber.setApiKey(API_KEY);
    }

    protected Uber getUber(){
        return uber;
    }

    protected List<String> getProductTypes(){
        return Arrays.asList(PRODUCT_TYPES);
    }
}