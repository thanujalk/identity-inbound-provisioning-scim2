package org.wso2.carbon.identity.inbound.provisioning.scim2.provider.mappers;

import org.osgi.service.component.annotations.Component;
import org.wso2.charon.core.v2.exceptions.ConflictException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Exception mapper for Conflict Exception.
 */
@Component(
        name = "org.wso2.carbon.identity.inbound.provisioning.scim2.common.mappers.ConflictMapper;",
        service = ExceptionMapper.class,
        immediate = true
)

public class ConflictMapper implements ExceptionMapper<ConflictException> {

    @Override
    public Response toResponse(ConflictException e) {
        return Response.status(e.getStatus()).
                entity(e.getDetail()).
                type("text/plain").
                build();
    }
}
