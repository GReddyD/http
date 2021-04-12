import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class FilesAboutCats {
	//	_id - уникальный идентификатор записи
	//	text - сообщение
	//	type - тип
	//	user - описание пользователя
	//	upvotes - голоса
	//	userUpvotes - пользователей проголосовало

	JsonNode status;
	private final String type;
	private final boolean deleted;
	private final String _id;
	private final String user;
	private final String text;
	private final int __v;
	private final String source;
	private final String updatedAt;
	private final String createdAt;
	private final boolean used;
	//private final int upvotes;
	//private final int userUpvotes;


	public FilesAboutCats(
					@JsonProperty("status") JsonNode status,
					@JsonProperty("type") String type,
					@JsonProperty("deleted") boolean deleted,
					@JsonProperty("_id") String _id,
					@JsonProperty("user") String user,
					@JsonProperty("text") String text,
					@JsonProperty("__v") int __v,
					@JsonProperty("source") String source,
					@JsonProperty("updatedAt") String updatedAt,
					@JsonProperty("createdAt") String createdAt,
					@JsonProperty("used") boolean used
					//@JsonProperty("upvotes") int upvotes,
					//@JsonProperty("userUpvotes") int userUpvotes
	){
		this.status = status;
		this.type = type;
		this.deleted = deleted;
		this._id = _id;
		this.user = user;
		this.text = text;
		this.__v = __v;
		this.source = source;
		this.updatedAt = updatedAt;
		this.createdAt = createdAt;
		this.used = used;
		//this.upvotes = upvotes;
		//this.userUpvotes = userUpvotes;
	}

	public JsonNode getStatus() {
		return status;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public int get__v() {
		return __v;
	}

	public String getSource() {
		return source;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public boolean isUsed() {
		return used;
	}

	public void setStatus(JsonNode status) {
		this.status = status;
	}

	public String get_id() {
		return _id;
	}

	public String getText() {
		return text;
	}

	public String getType() {
		return type;
	}

	public String getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "FilesAboutCats{" +
						"status=" + status +
						", type='" + type + '\'' +
						", deleted=" + deleted +
						", _id='" + _id + '\'' +
						", user='" + user + '\'' +
						", text='" + text + '\'' +
						", __v=" + __v +
						", source='" + source + '\'' +
						", updatedAt='" + updatedAt + '\'' +
						", createdAt='" + createdAt + '\'' +
						", used=" + used +
						'}';
	}
}
