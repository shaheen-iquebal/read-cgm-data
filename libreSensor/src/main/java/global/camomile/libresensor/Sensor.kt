package global.camomile.libresensor

import java.util.concurrent.TimeUnit

data class Sensor (val serialNumber: String, val startDate: Long, val ageInMinutes: Int) {
    val timeLeft: Long =
        (startDate + TimeUnit.MINUTES.toMillis(maxSensorAgeInMinutes - ageInMinutes))
            .coerceAtLeast(0)
    val readyInMinutes : Int = (sensorInitializationInMinutes - ageInMinutes)
            .coerceAtLeast(0)

    constructor(rawTagData: RawTag) : this(
        RawTag.toHexString(rawTagData.sensorSerial),
        rawTagData.tagDate - rawTagData.tagDate % TimeUnit.MINUTES.toMillis(1)
                - TimeUnit.MINUTES.toMillis(rawTagData.sensorAgeInMinutes.toLong()),
        rawTagData.sensorAgeInMinutes
    )

    fun timeLeft(atTime: Long): Long {
        return (startDate + TimeUnit.MINUTES.toMillis(maxSensorAgeInMinutes) - atTime)
            .coerceAtLeast(0)
    }

    companion object {
        // data generated by the sensor in the first 60 minutes is not correct
        const val sensorInitializationInMinutes = 60
        // data generated by the sensor after 14 days also has faults
        const val maxSensorAgeInMinutes : Long = 20160 // 14 * 24 * 60
    }
}