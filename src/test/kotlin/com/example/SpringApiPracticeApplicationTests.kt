package com.example

import com.example.domain.TravelInformation
import org.apache.commons.io.FileUtils
import org.apache.http.client.ClientProtocolException
import org.apache.http.conn.ssl.SSLConnectionSocketFactory
import org.apache.http.impl.client.HttpClients
import org.apache.http.ssl.SSLContexts
import org.assertj.core.api.Assertions.assertThat
import org.json.CDL
import org.json.JSONException
import org.json.JSONObject
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus.OK
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate
import java.io.File
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

        val jsonObj = JSONObject(response.body).getJSONObject("XML_Head").getJSONObject("Infos")
        val jsonArray = jsonObj.getJSONArray("Info")
        lateinit var data: TravelInformation

//        for (index in 0 until jsonArray.length()) {
//            val obj = jsonArray.getJSONObject(index)

        try {
            if (!File("files/").exists())
                File("files/").mkdir()
            val file = File("files/test.csv")
            val string = CDL.toString(jsonArray)
            FileUtils.write(file, string, "UTF-8", false)
        } catch (e: JSONException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }

//            data.id = obj.getString("Id")
//            data.name = obj.getString("Name")
//            data.zone = obj.getString("Zone")
//            data.toldescribe = obj.getString("Toldescribe")
//            data.description = obj.getString("Description")
//            data.tel = obj.getString("Tel")
//            data.add = obj.getString("Add")
//            data.zipcode = obj.getString("Zipcode")
//            data.travellingInfo = obj.getString("Travellinginfo")
//            data.openTime = obj.getString("Opentime")
//            data.picture1 = obj.getString("Picture1")
//            data.picDescribe1 = obj.getString("Picdescribe1")
//            data.picture2 = obj.getString("Picture2")
//            data.picDescribe2 = obj.getString("Picdescribe2")
//            data.picture3 = obj.getString("Picture3")
//            data.picDescribe3 = obj.getString("Picdescribe3")
//            data.map = obj.getString("Map")
//            data.gov = obj.getString("Gov")
//            data.px = obj.getDouble("Px")
//            data.py = obj.getDouble("Py")
//            data.orgClass = obj.getString("Orgclass")
//            data.class1 = obj.getString("Class1")
//            data.class2 = obj.getString("Class2")
//            data.class3 = obj.getString("Class3")
//            data.level = obj.getString("Level")
//            data.website = obj.getString("Website")
//            data.parkingInfo = obj.getString("Parkinginfo")
//            data.parkingInfoPx = obj.getDouble("Parkinginfo_Px")
//            data.parkingInfoPy = obj.getDouble("Parkinginfo_Py")
//            data.ticketInfo = obj.getString("Ticketinfo")
//            data.remarks = obj.getString("Remarks")
//            data.keyword = obj.getString("Keyword")
//            data.changeTime = obj.getString("Changetime")
//        }


        print(response.statusCode)

    }

    @Test
    fun outputTest() {
        val file = File("test.csv")
        file.writeText("Column1,Column2,Column3\n")
        file.appendText("value1,value2,value3\n")
    }
}

