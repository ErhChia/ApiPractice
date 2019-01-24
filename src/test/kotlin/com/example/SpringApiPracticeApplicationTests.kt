package com.example

import org.apache.http.client.ClientProtocolException
import org.apache.http.conn.ssl.SSLConnectionSocketFactory
import org.apache.http.impl.client.HttpClients
import org.apache.http.ssl.SSLContexts
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus.OK
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate
import java.io.IOException
import java.security.cert.X509Certificate

@RunWith(SpringRunner::class)
@SpringBootTest
class SpringApiPracticeApplicationTests {

    @Test
    @Throws(ClientProtocolException::class, IOException::class)
    fun contextLoads() {

        val acceptingTrustStrategy = { _: Array<X509Certificate>, _: String -> true }
        val sslContext = SSLContexts.custom()
                .loadTrustMaterial(null, acceptingTrustStrategy).build()
        val csf = SSLConnectionSocketFactory(sslContext)

        val resourceUrl = "https://gis.taiwan.net.tw/XMLReleaseALL_public/scenic_spot_C_f.json"
        val httpClient = HttpClients.custom()
                .setSSLSocketFactory(csf).build()
        val requestFactory = HttpComponentsClientHttpRequestFactory()
        requestFactory.httpClient = httpClient

        val response = RestTemplate(requestFactory)
                .exchange(resourceUrl, HttpMethod.GET, null, String::class.java)

        assertThat(response.statusCode).isEqualTo(OK)

    }

}

