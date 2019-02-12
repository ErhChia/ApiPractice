package com.example.util

import com.fasterxml.jackson.dataformat.csv.CsvMapper
import java.io.IOException
import java.io.InputStream

/**
 *
 * @author Jack Lin
 */
class CsvUtils {
    companion object {
        @Throws(IOException::class)
        fun <T> read(clazz: Class<T>, stream: InputStream): List<T> {
            val mapper = CsvMapper()
            val schema = mapper.schemaFor(clazz).withHeader().withColumnReordering(true)
            val reader = mapper.readerFor(clazz).with(schema)
            return reader.readValues<T>(stream).readAll()
        }
    }
}