/*
 * Copyright 2016 by floragunn UG (haftungsbeschränkt) - All rights reserved
 * 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed here is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * This software is free of charge for non-commercial and academic use. 
 * For commercial use in a production environment you have to obtain a license 
 * from https://floragunn.com
 * 
 */

package com.floragunn.searchguard.auditlog.impl;

import java.io.IOException;

import org.elasticsearch.common.settings.Settings;

public class MyOwnAuditLog extends AbstractAuditLog {
   
	public MyOwnAuditLog(Settings settings) {
        super(settings, null, null);
    }

    @Override
	public void close() throws IOException {
		
	}

	@Override
	protected void save(AuditMessage msg) {
	}

}
