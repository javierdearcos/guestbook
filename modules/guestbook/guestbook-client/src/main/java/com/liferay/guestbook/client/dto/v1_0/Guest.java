package com.liferay.guestbook.client.dto.v1_0;

import com.liferay.guestbook.client.function.UnsafeSupplier;
import com.liferay.guestbook.client.serdes.v1_0.GuestSerDes;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author John Doe
 * @generated
 */
@Generated("")
public class Guest implements Cloneable {

	public static Guest toDTO(String json) {
		return GuestSerDes.toDTO(json);
	}

	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	public void setGuestId(
		UnsafeSupplier<Long, Exception> guestIdUnsafeSupplier) {

		try {
			guestId = guestIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long guestId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName(UnsafeSupplier<String, Exception> nameUnsafeSupplier) {
		try {
			name = nameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String name;

	@Override
	public Guest clone() throws CloneNotSupportedException {
		return (Guest)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Guest)) {
			return false;
		}

		Guest guest = (Guest)object;

		return Objects.equals(toString(), guest.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return GuestSerDes.toJSON(this);
	}

}