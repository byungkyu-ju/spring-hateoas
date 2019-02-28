/*
 * Copyright 2018-2019 the original author or authors.
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
package org.springframework.hateoas.mediatype.uber;

import lombok.AccessLevel;
import lombok.Value;
import lombok.experimental.Wither;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@literal UBER+JSON} representation of an error.
 *
 * @author Greg Turnquist
 * @since 1.0
 */
@Value
@Wither(AccessLevel.PACKAGE)
class UberError {

	private List<UberData> data;

	@JsonCreator
	UberError(@JsonProperty("data") List<UberData> data) {
		this.data = data;
	}

	UberError() {
		this(null);
	}
}