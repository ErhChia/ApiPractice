package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringApiPracticeApplication

//TODO:啟動後自動介接資料進h2，省去輸出csv
fun main(args: Array<String>) {
    runApplication<SpringApiPracticeApplication>(*args)
}

