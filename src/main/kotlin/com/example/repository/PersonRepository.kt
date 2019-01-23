package com.example.repository

import com.example.domain.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *
 * @author Jack Lin
 */
@Repository
interface PersonRepository : JpaRepository<Person, Int> {
}