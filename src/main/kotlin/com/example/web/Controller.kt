package com.example.web

import com.example.service.Impl.TravelInformationServiceImpl
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 *
 * @author Jack Lin
 */
@Controller
@RequestMapping("/main")
class Controller(val travelInformationService: TravelInformationServiceImpl) {

    @GetMapping(value = ["index", ""])
    fun index(model: Model): String {
        model.addAttribute("name", "Jack")
        return "hello.html"
    }

    @GetMapping(value = ["test"])
    fun hello(model: Model): String {

        model.addAttribute("name", "Jack")
        return "hello"
    }

    @GetMapping(value = ["fetch-data"])
    fun fetchData(): String {
        return "fetch-data"
    }

    @ResponseBody
    @GetMapping(value = ["get-data"])
    fun getData(): HttpStatus {

        val jsonObject = travelInformationService.getData()
        return if (jsonObject.length() == 0) {
            System.err.println("json object is null")
            HttpStatus.BAD_REQUEST
        } else {
            System.err.println(jsonObject)
            travelInformationService.output(jsonObject)
            travelInformationService.setData(jsonObject)
            HttpStatus.OK
        }
    }

    @GetMapping(value = ["re-direct"])
    fun redirect(model: Model): String {
        model.addAttribute("name", "Jack")
        return "redirect"
    }
}