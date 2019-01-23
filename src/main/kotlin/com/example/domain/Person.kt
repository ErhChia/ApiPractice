package com.example.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 *
 * @author Jack Lin
 */

@Entity
@Table(name = "person")
data class Person(

        @Id
        @Column(name = "id_")
        var id: Int,

        @Column(name = "name_")
        var name: String
)