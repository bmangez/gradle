/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.language.objectivecpp;

import org.gradle.api.Incubating;
import org.gradle.language.DependentSourceSet;
import org.gradle.language.HeaderExportingSourceSet;
import org.gradle.language.base.LanguageSourceSet;

/**
 * A set of Objective-CPP source files.
 *
 * <p>An ObjectiveC source set contains a set of source files, together with an optional set of exported header files.</p>
 *
 * <pre autoTested="true">
 * apply plugin: "objective-cpp"
 *
 * sources {
 *     main {
 *         // Configure an existing ObjectiveCSourceSet
 *         objectiveCpp {
 *             source {
 *                 srcDirs "src/main/objectiveCpp", "src/shared/objectiveCpp"
 *                 include "**{@literal /}*.m"
 *             }
 *             exportedHeaders {
 *                 srcDirs "src/main/include"
 *             }
 *         }
 *     }
 * }
 * </pre>
 */
@Incubating
public interface ObjectiveCppSourceSet extends HeaderExportingSourceSet, LanguageSourceSet, DependentSourceSet {

}
