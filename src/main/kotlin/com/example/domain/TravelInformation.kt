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
        var id: String,

        /**
         * 景點名稱
         */
        @Column(name = "name_")
        var name: String,

        /**
         *
         */
        @Column(name = "zone_", length = 4000)
        var zone: String,

        /**
         * 景點簡述
         */
        @Column(name = "toldescribe_", length = 4000)
        var toldescribe: String,

        /**
         * 景點描述
         */
        @Column(name = "description_", length = 4000)
        var description: String,

        /**
         * 景點電話
         */
        @Column(name = "tel_")
        var tel: String,

        /**
         * 景點地址
         */
        @Column(name = "add_", length = 1000)
        var add: String,

        @Column(name = "zipcode_")
        var zipcode: String,

        @Column(name = "travelling_info_", length = 4000)
        var travellinginfo: String,

        @Column(name = "open_time_", length = 4000)
        var opentime: String,

        @Column(name = "picture1_", length = 4000)
        var picture1: String,

        @Column(name = "pic_describe1_", length = 4000)
        var picdescribe1: String,

        @Column(name = "picture2_", length = 4000)
        var picture2: String,

        @Column(name = "pic_describe2_", length = 4000)
        var picdescribe2: String,

        @Column(name = "picture3_", length = 4000)
        var picture3: String,

        @Column(name = "pic_describe3_", length = 4000)
        var picdescribe3: String,

        @Column(name = "map_", length = 4000)
        var map: String,

        @Column(name = "gov_")
        var gov: String,

        @Column(name = "px_")
        var px: Double,

        @Column(name = "py_")
        var py: Double,

        @Column(name = "org_class_", length = 4000)
        var orgclass: String,

        @Column(name = "class1_", length = 4000)
        var class1: String,

        @Column(name = "class2_", length = 4000)
        var class2: String,

        @Column(name = "class3_", length = 4000)
        var class3: String,

        @Column(name = "level_", length = 4000)
        var level: String,

        @Column(name = "website_", length = 4000)
        var website: String,

        @Column(name = "parking_info_", length = 4000)
        var parkinginfo: String,

        @Column(name = "parking_info_px_")
        var parkinginfo_px: Double,

        @Column(name = "parking_info_py_")
        var parkinginfo_py: Double,

        @Column(name = "ticket_info_", length = 4000)
        var ticketinfo: String,

        @Column(name = "remarks_", length = 4000)
        var remarks: String,

        @Column(name = "keyword_", length = 4000)
        var keyword: String,

        @Column(name = "change_time_", length = 4000)
        var changetime: String
)