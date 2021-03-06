package com.easy.cloud.core.jdbc.test.config;

import com.easy.cloud.core.jdbc.audit.config.EcAuditConfig;
import com.easy.cloud.core.jdbc.audit.constant.EcAuditConstant.EcActionType;
import com.easy.cloud.core.jdbc.audit.constant.EcAuditConstant.EcType;
import com.easy.cloud.core.jdbc.audit.pojo.dto.EcAuditConfigDTO;
import com.easy.cloud.core.jdbc.audit.procced.impl.EcDefaultAuditProcced;
import org.springframework.stereotype.Component;

@Component
public class EcUserConfig extends EcAuditConfig{
	static {
		put(new EcAuditConfigDTO("save", EcActionType.SAVE, EcType.SAVE, EcDefaultAuditProcced.class));
		put(new EcAuditConfigDTO("saveBatch", EcActionType.SAVE_BATCH, EcType.SAVE, EcDefaultAuditProcced.class));
		
		put(new EcAuditConfigDTO("update", EcActionType.UPDATE, EcType.UPDATE, EcDefaultAuditProcced.class));
		put(new EcAuditConfigDTO("updateBatch", EcActionType.UPDATE_BATCH, EcType.UPDATE, EcDefaultAuditProcced.class));
	}
}
