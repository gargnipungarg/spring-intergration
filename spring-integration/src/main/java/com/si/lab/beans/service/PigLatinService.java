package com.si.lab.beans.service;

import java.util.concurrent.Future;

public interface PigLatinService {
//	String translate(String english);			//  For synchronous gateway call
	Future<String> translate(String english); // For asynchronous gateway call
}
