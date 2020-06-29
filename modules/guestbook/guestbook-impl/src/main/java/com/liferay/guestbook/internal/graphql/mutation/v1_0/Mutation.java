package com.liferay.guestbook.internal.graphql.mutation.v1_0;

import com.liferay.guestbook.dto.v1_0.Guest;
import com.liferay.guestbook.resource.v1_0.GuestResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author John Doe
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setGuestResourceComponentServiceObjects(
		ComponentServiceObjects<GuestResource>
			guestResourceComponentServiceObjects) {

		_guestResourceComponentServiceObjects =
			guestResourceComponentServiceObjects;
	}

	@GraphQLField(description = "Adds a new guest")
	public Guest createGuest(@GraphQLName("guest") Guest guest)
		throws Exception {

		return _applyComponentServiceObjects(
			_guestResourceComponentServiceObjects,
			this::_populateResourceContext,
			guestResource -> guestResource.postGuest(guest));
	}

	@GraphQLField
	public Response createGuestBatch(
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_guestResourceComponentServiceObjects,
			this::_populateResourceContext,
			guestResource -> guestResource.postGuestBatch(callbackURL, object));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(GuestResource guestResource)
		throws Exception {

		guestResource.setContextAcceptLanguage(_acceptLanguage);
		guestResource.setContextCompany(_company);
		guestResource.setContextHttpServletRequest(_httpServletRequest);
		guestResource.setContextHttpServletResponse(_httpServletResponse);
		guestResource.setContextUriInfo(_uriInfo);
		guestResource.setContextUser(_user);
	}

	private static ComponentServiceObjects<GuestResource>
		_guestResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private com.liferay.portal.kernel.model.User _user;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private UriInfo _uriInfo;

}