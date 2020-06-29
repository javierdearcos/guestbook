package com.liferay.guestbook.internal.graphql.query.v1_0;

import com.liferay.guestbook.dto.v1_0.Guest;
import com.liferay.guestbook.resource.v1_0.GuestResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author John Doe
 * @generated
 */
@Generated("")
public class Query {

	public static void setGuestResourceComponentServiceObjects(
		ComponentServiceObjects<GuestResource>
			guestResourceComponentServiceObjects) {

		_guestResourceComponentServiceObjects =
			guestResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {guests{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Retrieves the guests")
	public GuestPage guests() throws Exception {
		return _applyComponentServiceObjects(
			_guestResourceComponentServiceObjects,
			this::_populateResourceContext,
			guestResource -> new GuestPage(guestResource.getGuestsPage()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {guest(guestId: ___){guestId, name}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Retrieves the guest with given identifier")
	public Guest guest(@GraphQLName("guestId") String guestId)
		throws Exception {

		return _applyComponentServiceObjects(
			_guestResourceComponentServiceObjects,
			this::_populateResourceContext,
			guestResource -> guestResource.getGuest(guestId));
	}

	@GraphQLName("GuestPage")
	public class GuestPage {

		public GuestPage(Page guestPage) {
			actions = guestPage.getActions();
			items = guestPage.getItems();
			lastPage = guestPage.getLastPage();
			page = guestPage.getPage();
			pageSize = guestPage.getPageSize();
			totalCount = guestPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<Guest> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

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
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private com.liferay.portal.kernel.model.Company _company;
	private com.liferay.portal.kernel.model.User _user;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private UriInfo _uriInfo;

}