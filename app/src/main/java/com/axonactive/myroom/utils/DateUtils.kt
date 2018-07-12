package com.axonactive.myroom.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Phuong Nguyen on 5/21/2018.
 */
object DateUtils {
    @JvmStatic
    fun toSimpleDateString(date : Date?) : String {
        val format = SimpleDateFormat("dd/MM/yyyy")
        return format.format(date)
    }

    @JvmStatic
    fun toSimpleDate(dateStr : String?) : Date? {
        if (dateStr != null) {
            try {
                val format = SimpleDateFormat("dd/MM/yyyy")
                return format.parse(dateStr)
            }
            catch (e : Exception) {
                e.printStackTrace()
            }
        }
        return null
    }
}