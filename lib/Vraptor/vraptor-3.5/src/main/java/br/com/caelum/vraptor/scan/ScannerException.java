/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package br.com.caelum.vraptor.scan;

/**
 * Unchecked exception used in the scanner package
 *
 * @author Sérgio Lopes
 * @since 3.2
 */
public class ScannerException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ScannerException(String message) {
		super(message);
	}

	public ScannerException(String message, Throwable t) {
		super(message, t);
	}
}
