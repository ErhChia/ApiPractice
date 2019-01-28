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
        @Column(name = "zone_")
        var zone: String,

        /**
         * 景點簡述
         */
        @Column(name = "toldescribe_")
        var toldescribe: String,

        /**
         * 景點描述
         */
        @Column(name = "description_")
        var description: String,

        /**
         * 景點電話
         */
        @Column(name = "tel_")
        var tel: String,

        /**
         * 景點地址
         */
        @Column(name = "add_")
        var add: String,

        @Column(name = "zipcode_")
        var zipcode: String,

        @Column(name = "travelling_info_")
        var travellingInfo: String,

        @Column(name = "open_time_")
        var openTime: String,

        @Column(name = "picture1_")
        var picture1: String,

        @Column(name = "pic_describe1_")
        var picDescribe1: String,

        @Column(name = "picture2_")
        var picture2: String,

        @Column(name = "pic_describe2_")
        var picDescribe2: String,

        @Column(name = "picture3_")
        var picture3: String,

        @Column(name = "pic_describe3_")
        var picDescribe3: String,

        @Column(name = "map_")
        var map: String,

        @Column(name = "gov_")
        var gov: String,

        @Column(name = "px_")
        var px: Double,

        @Column(name = "py_")
        var py: Double,

        @Column(name = "org_class_")
        var orgClass: String,

        @Column(name = "class1_")
        var class1: String,

        @Column(name = "class2_")
        var class2: String,

        @Column(name = "class3_")
        var class3: String,

        @Column(name = "level_")
        var level: String,

        @Column(name = "website_")
        var website: String,

        @Column(name = "parking_info_")
        var parkingInfo: String,

        @Column(name = "parking_info_px_")
        var parkingInfoPx: Double,

        @Column(name = "parking_info_py_")
        var parkingInfoPy: Double,

        @Column(name = "ticket_info_")
        var ticketInfo: String,

        @Column(name = "remarks_")
        var remarks: String,

        @Column(name = "keyword_")
        var keyword: String,

        @Column(name = "change_time_")
        var changeTime: String
)