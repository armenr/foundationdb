/*
 * CloneableException.java
 *
 * This source file is part of the FoundationDB open source project
 *
 * Copyright 2013-2018 Apple Inc. and the FoundationDB project authors
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

package com.apple.cie.foundationdb.async;

/**
 * An {@link Exception} that can be duplicated with a new backtrace.
 */
public interface CloneableException {
	/**
	 * Create and return a new {@code Exception} that has a backtrace including the
	 *  calling line of code.
	 *
	 * @return a newly created {@code Exception}.
	 */
	public Exception retargetClone();
}