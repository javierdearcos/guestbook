package com.liferay.guestbook.internal.graphql.servlet.v1_0;

import com.liferay.guestbook.internal.graphql.mutation.v1_0.Mutation;
import com.liferay.guestbook.internal.graphql.query.v1_0.Query;
import com.liferay.guestbook.resource.v1_0.GuestResource;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author John Doe
 * @generated
 */
@Component(immediate = true, service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setGuestResourceComponentServiceObjects(
			_guestResourceComponentServiceObjects);

		Query.setGuestResourceComponentServiceObjects(
			_guestResourceComponentServiceObjects);
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/guestbook-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<GuestResource>
		_guestResourceComponentServiceObjects;

}