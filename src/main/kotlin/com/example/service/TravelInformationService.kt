package com.example.service

import com.example.domain.TravelInformation
import org.json.JSONObject

/**
 *
 * @author Jack Lin
 */
interface TravelInformationService {

    fun setData(jsonObject: JSONObject)
    fun getData(): JSONObject
    fun save(data: TravelInformation)
    fun output(jsonObject: JSONObject)
    fun saveFromCsv(data: List<TravelInformation>)
}