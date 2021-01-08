/*-
 * #%L
 * Commons Backend - Business Implementations
 * %%
 * Copyright (C) 2020 Flowing Code
 * %%
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
 * #L%
 */
package com.appjars.saturn.service;

import java.io.Serializable;

/**
 * A special kind of service that allows entities creation
 * 
 * @author mlopez
 * @author jgodoy
 *
 * @param <T> The type of the entity
 * @param <K> The type of the entity identifier
 */
public interface CreationServiceMixin<T extends Serializable, K extends Serializable>
	extends ConversionCreationServiceMixin<T, T, K>, BusinessConversionSupport.Identity<T> {

}
