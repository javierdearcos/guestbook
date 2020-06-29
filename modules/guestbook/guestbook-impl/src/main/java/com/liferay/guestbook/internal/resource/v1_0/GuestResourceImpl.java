package com.liferay.guestbook.internal.resource.v1_0;

import com.liferay.guestbook.resource.v1_0.GuestResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author John Doe
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/guest.properties",
	scope = ServiceScope.PROTOTYPE, service = GuestResource.class
)
public class GuestResourceImpl extends BaseGuestResourceImpl {
}