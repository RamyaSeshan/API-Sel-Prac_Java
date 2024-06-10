package mocking;

import org.testng.annotations.Test;

import com.github.tomakehurst.wiremock.client.WireMock;

public class CreateStub {

	@Test
	public void create() {
		
	WireMock.stubFor(WireMock.post("/api/now/table/incident") // need not give URI as its from local host
			.willReturn(WireMock.aResponse()
			.withStatus(201)
			.withBody("{\r\n"
					+ "    \"short Description\":\"created with Mock\",\r\n"
					+ "    \"sys_id\" :\"RASDE132434\"\r\n"
					+ "}")
										
					
					)
			);
		
	}
}
