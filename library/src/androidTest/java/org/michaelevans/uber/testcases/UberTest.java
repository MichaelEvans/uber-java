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

package org.michaelevans.uber.testcases;

import org.michaelevans.uber.BaseTest;
import org.michaelevans.uber.entities.Price;
import org.michaelevans.uber.entities.Product;
import org.michaelevans.uber.entities.Time;
import org.michaelevans.uber.entities.UberPrices;
import org.michaelevans.uber.entities.UberProducts;
import org.michaelevans.uber.entities.UberTimes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UberTest extends BaseTest {


    public void testProductTypesInDC() throws Exception {
        UberProducts uberProducts = getUber().uberService().getProducts(38.8951, -77.0367);
        assertNotNull("Result was null.", uberProducts);
        assertEquals(5, uberProducts.getProducts().size());

        List<String> productTypes = new ArrayList<String>();
        for(Product product : uberProducts.getProducts()){
            productTypes.add(product.getDisplayName());
        }

        assertEquals(true, productTypes.containsAll(getProductTypes()));
    }

    public void testPricingEstimate() throws Exception {
        UberPrices uberPrices = getUber().uberService().getPricingEstimate(38.8951, -77.0367, 38.9311, -77.0497);
        assertNotNull("Result was null.", uberPrices);
        assertEquals(5, uberPrices.getPrices().size());

        for(Price price : uberPrices.getPrices()){
            assertNotNull(price.getEstimate());
        }
    }

    public void testTimeEstimate() throws Exception {
        UberTimes uberTimes = getUber().uberService().getTimeEstimate(38.8951, -77.0367, null, null);

        assertNotNull("Result was null.", uberTimes);
        assertEquals(5, uberTimes.getTimes().size());

        for(Time time : uberTimes.getTimes()){
            assertTrue(time.getEstimate() > 0);
        }

    }
}
