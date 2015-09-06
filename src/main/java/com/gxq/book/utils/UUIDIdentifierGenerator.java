package com.gxq.book.utils;

import java.util.UUID;

public final class UUIDIdentifierGenerator {


	public static String generate() {
		return UUID.randomUUID().toString() ;
	}

}
