import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static final String REMOTE_SERVICE_URI = "https://cat-fact.herokuapp.com/facts";
	public static final ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) throws IOException {
		HttpGet request = new HttpGet(REMOTE_SERVICE_URI);
		request.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());

		// отправка запроса
		CloseableHttpResponse response = CloseableHttpClient.httpClient.execute(request);

		// вывод полученных заголовков
		Arrays.stream(response.getAllHeaders()).forEach(System.out::println);

		List<FilesAboutCats> filesAboutCatsList = mapper.readValue(response.getEntity().getContent(), new TypeReference<List<FilesAboutCats>>() {});
		filesAboutCatsList.stream()
						.filter(value -> value.get_id().contains("58e00a090aac31001185ed16"))
						.forEach(System.out::println);
	}

}
