/**
 * Copyright (c) 2016, biezhi 王爵 (biezhi.me@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.blade.banner;

public final class BannerStarter {
	
	private static Banner BANNER = new BladeBanner();
	
	public static void printStart(){
		System.out.println(BANNER.startText());
	}
	
	public static void banner(Banner banner){
		BANNER = banner;
	}
	
	public static void banner(final String text){
		BANNER = new Banner() {
			@Override
			public String startText() {
				return text;
			}
		};
	}
}
