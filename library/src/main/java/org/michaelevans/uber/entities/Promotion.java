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

public class Promotion {
    private String display_text;
    private String localized_value;
    private String type;

    public String getDisplayText() {
        return display_text;
    }

    public String getLocalizedValue() {
        return localized_value;
    }

    public String getType() {
        return type;
    }
}
