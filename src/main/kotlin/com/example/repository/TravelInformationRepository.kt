package com.example.repository

import com.example.domain.TravelInformation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *
 * @author Jack Lin
 */
@Repository
interface TravelInformationRepository : JpaRepository<TravelInformation, String> {
}