package com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

@RunWith(SpringRunner::class)
@SpringBootTest
class SpringApiPracticeApplicationTests {

    @Test
    fun contextLoads() {
        val resourceUrl = "http://gis.taiwan.net.tw/XMLReleaseALL_public/scenic_spot_C_f.json"
        val obj = URL(resourceUrl)

        with(obj.openConnection() as HttpURLConnection) {
            requestMethod = "GET"
            println("\n sending 'GET' request to URL : $resourceUrl")
            println("Response Code : $responseCode")

            BufferedReader(InputStreamReader(inputStream)).use {
                val response = StringBuffer()

                var inputLine = it.readLine()
                while (inputLine != null) {
                    response.append(inputLine)
                    inputLine = it.readLine()
                }
                println(response.toString())
            }
        }

    }

}

