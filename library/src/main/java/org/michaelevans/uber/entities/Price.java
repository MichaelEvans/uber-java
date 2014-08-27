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


package org.michaelevans.uber.entities;

public class Price {
    private String product_id;
    private String currency_code;
    private String display_name;
    private String estimate;
    private int low_estimate;
    private int high_estimate;
    private float surge_multiplier;

    public String getProductId() {
        return product_id;
    }

    public String getCurrencyCode() {
        return currency_code;
    }

    public String getDisplayName() {
        return display_name;
    }

    public String getEstimate() {
        return estimate;
    }

    public int getLowEstimate() {
        return low_estimate;
    }

    public int getHighEstimate() {
        return high_estimate;
    }

    public float getSurgeMultiplier() {
        return surge_multiplier;
    }
}
