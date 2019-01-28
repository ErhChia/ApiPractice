package com.example.service

import com.example.domain.TravelInformation

/**
 *
 * @author Jack Lin
 */
interface TravelInformationService {

    fun setData()
    fun save(data: TravelInformation)
}