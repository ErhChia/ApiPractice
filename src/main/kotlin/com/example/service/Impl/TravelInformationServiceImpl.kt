package com.example.service.Impl

import com.example.domain.TravelInformation
import com.example.repository.TravelInformationRepository
import com.example.service.TravelInformationService
import org.apache.http.conn.ssl.SSLConnectionSocketFactory
import org.apache.http.impl.client.HttpClients
import org.apache.http.ssl.SSLContexts
import org.json.JSONObject
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.security.cert.X509Certificate
import javax.transaction.Transactional

/**
 *
 * @author Jack Lin
 */
@Service
@Transactional
class TravelInformationServiceImpl(val travelInformationRepository: TravelInformationRepository)
    : TravelInformationService {


    override fun save(data: TravelInformation) {
        travelInformationRepository.save(data)
    }

    override fun setData() {

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


        if (response.statusCode == HttpStatus.OK) {
            print(response.body?.substring(0..200))
            val jsonObj = JSONObject(response.body?.substring(1..response.body!!.lastIndex))
            val xmlHead = jsonObj.getJSONObject("XML_Head")
            val infos = xmlHead.getJSONObject("Infos")
            val jsonArray = infos.getJSONArray("Info")
            lateinit var data: TravelInformation

//            for (index in 0 until jsonArray.length()) {
            val obj = jsonArray.getJSONObject(0)

            data = TravelInformation(
                    obj.getString("Id"),
                    obj.getString("Name"),
                    obj.getString("Zone"),
                    obj.getString("Toldescribe"),
                    obj.getString("Description"),
                    obj.getString("Tel"),
                    obj.getString("Add"),
                    obj.getString("Zipcode"),
                    obj.getString("Travellinginfo"),
                    obj.getString("Opentime"),
                    obj.getString("Picture1"),
                    obj.getString("Picdescribe1"),
                    obj.getString("Picture2"),
                    obj.getString("Picdescribe2"),
                    obj.getString("Picture3"),
                    obj.getString("Picdescribe3"),
                    obj.getString("Map"),
                    obj.getString("Gov"),
                    obj.getDouble("Px"),
                    obj.getDouble("Py"),
                    obj.getString("Orgclass"),
                    obj.getString("Class1"),
                    obj.getString("Class2"),
                    obj.getString("Class3"),
                    obj.getString("Level"),
                    obj.getString("Website"),
                    obj.getString("Parkinginfo"),
                    obj.getDouble("Parkinginfo_Px"),
                    obj.getDouble("Parkinginfo_Py"),
                    obj.getString("Ticketinfo"),
                    obj.getString("Remarks"),
                    obj.getString("Keyword"),
                    obj.getString("Changetime")
            )

            save(data)
//            }
        }

    }
}