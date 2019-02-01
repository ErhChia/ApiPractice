package com.example.web

import com.example.service.Impl.TravelInformationServiceImpl
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
@ResponseBody
@RequestMapping("/main")
class Controller(val travelInformationService: TravelInformationServiceImpl) {

    @GetMapping(value = ["index", ""])
    fun index(): String {
        return "hello.html"
    }

    @GetMapping("test")
    fun test(model: Model): String {

        val jsonObject = travelInformationService.getData()
//        System.err.println(jsonObject)
        if (jsonObject.length() != 0)
            travelInformationService.output(jsonObject)
//            System.err.println("json object is null")
//        travelInformationService.setData(jsonObject)


        model.addAttribute("name", "Jack")
        return "test"
    }
}