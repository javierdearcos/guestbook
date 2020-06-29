package com.liferay.guestbook.client.serdes.v1_0;

import com.liferay.guestbook.client.dto.v1_0.Guest;
import com.liferay.guestbook.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author John Doe
 * @generated
 */
@Generated("")
public class GuestSerDes {

	public static Guest toDTO(String json) {
		GuestJSONParser guestJSONParser = new GuestJSONParser();

		return guestJSONParser.parseToDTO(json);
	}

	public static Guest[] toDTOs(String json) {
		GuestJSONParser guestJSONParser = new GuestJSONParser();

		return guestJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Guest guest) {
		if (guest == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (guest.getGuestId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"guestId\": ");

			sb.append(guest.getGuestId());
		}

		if (guest.getName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"name\": ");

			sb.append("\"");

			sb.append(_escape(guest.getName()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		GuestJSONParser guestJSONParser = new GuestJSONParser();

		return guestJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Guest guest) {
		if (guest == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (guest.getGuestId() == null) {
			map.put("guestId", null);
		}
		else {
			map.put("guestId", String.valueOf(guest.getGuestId()));
		}

		if (guest.getName() == null) {
			map.put("name", null);
		}
		else {
			map.put("name", String.valueOf(guest.getName()));
		}

		return map;
	}

	public static class GuestJSONParser extends BaseJSONParser<Guest> {

		@Override
		protected Guest createDTO() {
			return new Guest();
		}

		@Override
		protected Guest[] createDTOArray(int size) {
			return new Guest[size];
		}

		@Override
		protected void setField(
			Guest guest, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "guestId")) {
				if (jsonParserFieldValue != null) {
					guest.setGuestId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					guest.setName((String)jsonParserFieldValue);
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\":");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(",");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}