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
@Table(name = "travel_information")
data class TravelInformation(

        /**
         *  景點序號
         */
        @Id
        @Column(name = "id_")
        val Id: String,

        /**
         * 景點名稱
         */
        @Column(name = "name_")
        val Name: String,

        /**
         *
         */
        @Column(name = "zone_")
        val Zone: String,

        /**
         * 景點簡述
         */
        @Column(name = "toldescribe_")
        val Toldescribe: String,

        /**
         * 景點描述
         */
        @Column(name = "description_")
        val Description: String,

        /**
         * 景點電話
         */
        @Column(name = "tel_")
        val Tel: String,

        /**
         * 景點地址
         */
        @Column(name = "add_")
        val Add: String,

        @Column(name = "zipcode_")
        val Zipcode: String,

        @Column(name = "travelling_info_")
        val Travellinginfo: String,

        @Column(name = "open_time_")
        val Opentime: String,

        @Column(name = "picture1_")
        val Picture1: String,

        @Column(name = "pic_describe1_")
        val Picdescribe1: String,

        @Column(name = "picture2_")
        val Picture2: String,

        @Column(name = "pic_describe2_")
        val Picdescribe2: String,

        @Column(name = "picture3_")
        val Picture3: String,

        @Column(name = "pic_describe3_")
        val Picdescribe3: String,

        @Column(name = "map_")
        val Map: String,

        @Column(name = "gov_")
        val Gov: String,

        @Column(name = "px_")
        val Px: Double,

        @Column(name = "py_")
        val Py: Double,

        @Column(name = "org_class_")
        val Orgclass: String,

        @Column(name = "class1_")
        val Class1: String,

        @Column(name = "class2_")
        val Class2: String,

        @Column(name = "class3_")
        val Class3: String,

        @Column(name = "level_")
        val Level: String,

        @Column(name = "website_")
        val Website: String,

        @Column(name = "parking_info_")
        val Parkinginfo: String,

        @Column(name = "parking_info_px_")
        val Parkinginfo_Px: Double,

        @Column(name = "parking_info_py_")
        val Parkinginfo_Py: Double,

        @Column(name = "ticket_info_")
        val Ticketinfo: String,

        @Column(name = "remarks_")
        val Remarks: String,

        @Column(name = "keyword_")
        val Keyword: String,

        @Column(name = "change_time_")
        val Changetime: String
)