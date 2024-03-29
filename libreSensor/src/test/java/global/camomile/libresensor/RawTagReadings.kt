package global.camomile.libresensor

import java.util.Base64

class RawTagReadings {
    companion object {
        val DorianScholz = byteArrayOf(
            0x63.toByte(),
            0x3b.toByte(),
            0x20.toByte(),
            0x12.toByte(),
            0x03.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0x57.toByte(),
            0x00.toByte(),
            0x07.toByte(),
            0x06.toByte(),
            0xd6.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x50.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xd6.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x20.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xe4.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x18.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xe3.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x2c.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xea.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x34.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xea.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x40.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xf8.toByte(),
            0x06.toByte(),
            0x88.toByte(),
            0x2e.toByte(),
            0x1a.toByte(),
            0x82.toByte(),
            0x0d.toByte(),
            0x07.toByte(),
            0xc8.toByte(),
            0xdc.toByte(),
            0x59.toByte(),
            0x80.toByte(),
            0x0c.toByte(),
            0x07.toByte(),
            0xc8.toByte(),
            0x30.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0x07.toByte(),
            0x07.toByte(),
            0xc8.toByte(),
            0x58.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0x06.toByte(),
            0x07.toByte(),
            0xc8.toByte(),
            0x50.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0x01.toByte(),
            0x07.toByte(),
            0xc8.toByte(),
            0x5c.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xec.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x68.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xde.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x74.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xd6.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x7c.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xd3.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x48.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0x62.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0xb4.toByte(),
            0x59.toByte(),
            0x80.toByte(),
            0x73.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0x78.toByte(),
            0x59.toByte(),
            0x80.toByte(),
            0xdb.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0x1c.toByte(),
            0x59.toByte(),
            0x80.toByte(),
            0x36.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x68.toByte(),
            0x59.toByte(),
            0x80.toByte(),
            0xb9.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0x98.toByte(),
            0x59.toByte(),
            0x80.toByte(),
            0x07.toByte(),
            0x07.toByte(),
            0xc8.toByte(),
            0x58.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0x28.toByte(),
            0x06.toByte(),
            0xc8.toByte(),
            0xa8.toByte(),
            0x5b.toByte(),
            0x80.toByte(),
            0xe8.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0xb0.toByte(),
            0x9b.toByte(),
            0x80.toByte(),
            0x78.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0x90.toByte(),
            0x5b.toByte(),
            0x80.toByte(),
            0xd4.toByte(),
            0x04.toByte(),
            0xc8.toByte(),
            0xe4.toByte(),
            0x9b.toByte(),
            0x80.toByte(),
            0xb8.toByte(),
            0x04.toByte(),
            0xc8.toByte(),
            0x30.toByte(),
            0x9c.toByte(),
            0x80.toByte(),
            0xed.toByte(),
            0x04.toByte(),
            0xc8.toByte(),
            0xd4.toByte(),
            0x5b.toByte(),
            0x80.toByte(),
            0x2d.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0xb8.toByte(),
            0x5b.toByte(),
            0x80.toByte(),
            0x76.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0x38.toByte(),
            0x9c.toByte(),
            0x80.toByte(),
            0x1e.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0x50.toByte(),
            0xa0.toByte(),
            0x80.toByte(),
            0xa7.toByte(),
            0x04.toByte(),
            0xc8.toByte(),
            0xa4.toByte(),
            0x60.toByte(),
            0x80.toByte(),
            0xbd.toByte(),
            0x04.toByte(),
            0xc8.toByte(),
            0xe0.toByte(),
            0x5b.toByte(),
            0x80.toByte(),
            0x96.toByte(),
            0x04.toByte(),
            0xc8.toByte(),
            0xf0.toByte(),
            0x9c.toByte(),
            0x80.toByte(),
            0x4f.toByte(),
            0x04.toByte(),
            0xc8.toByte(),
            0xcc.toByte(),
            0x9e.toByte(),
            0x80.toByte(),
            0xfe.toByte(),
            0x03.toByte(),
            0xc8.toByte(),
            0xd4.toByte(),
            0x5c.toByte(),
            0x80.toByte(),
            0xc5.toByte(),
            0x03.toByte(),
            0xc8.toByte(),
            0x78.toByte(),
            0x9c.toByte(),
            0x80.toByte(),
            0xae.toByte(),
            0x03.toByte(),
            0xc8.toByte(),
            0x2c.toByte(),
            0x9c.toByte(),
            0x80.toByte(),
            0xb4.toByte(),
            0x03.toByte(),
            0xc8.toByte(),
            0x08.toByte(),
            0x5b.toByte(),
            0x80.toByte(),
            0xc6.toByte(),
            0x03.toByte(),
            0xc8.toByte(),
            0x44.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0xfc.toByte(),
            0x03.toByte(),
            0xc8.toByte(),
            0x80.toByte(),
            0x9b.toByte(),
            0x80.toByte(),
            0x66.toByte(),
            0x04.toByte(),
            0xc8.toByte(),
            0xec.toByte(),
            0x9a.toByte(),
            0x80.toByte(),
            0xcb.toByte(),
            0x04.toByte(),
            0xc8.toByte(),
            0x9c.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0x0c.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0x4c.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0x1b.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0x7c.toByte(),
            0x9a.toByte(),
            0x80.toByte(),
            0x33.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0x64.toByte(),
            0x9a.toByte(),
            0x80.toByte(),
            0x25.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0x74.toByte(),
            0x5a.toByte(),
            0x80.toByte(),
            0x41.toByte(),
            0x05.toByte(),
            0xc8.toByte(),
            0xac.toByte(),
            0x59.toByte(),
            0x80.toByte(),
            0x28.toByte(),
            0x40.toByte(),
            0x00.toByte(),
            0x00.toByte(),
            0xe8.toByte(),
            0x50.toByte(),
            0x00.toByte(),
            0x01.toByte(),
            0x3b.toByte(),
            0x05.toByte(),
            0x15.toByte(),
            0x51.toByte(),
            0x14.toByte(),
            0x07.toByte(),
            0x96.toByte(),
            0x80.toByte(),
            0x5a.toByte(),
            0x00.toByte(),
            0xed.toByte(),
            0xa6.toByte(),
            0x06.toByte(),
            0x3c.toByte(),
            0x1a.toByte(),
            0xc8.toByte(),
            0x04.toByte(),
            0x04.toByte(),
            0x7a.toByte(),
            0x6e.toByte(),
            0x9e.toByte(),
            0x42.toByte(),
            0x21.toByte(),
            0x83.toByte(),
            0xf2.toByte(),
            0x90.toByte(),
            0x07.toByte(),
            0x00.toByte(),
            0x06.toByte(),
            0x08.toByte(),
            0x02.toByte(),
            0x24.toByte(),
            0x0c.toByte(),
            0x43.toByte(),
            0x17.toByte(),
            0x3c.toByte()
        )
        val CloudReading1 = decode64("zKlYFgMAAAAAAAAAAAAAAAAAAAAAAAAAPlMIF1QDyLCcgEsDyHxcgD4DyHCcgEMDyGCcgEgDyExcgEMDyCycgEUDyCycgE8DyDycgFgDyHhcgE8DyGCcgEkDyEhcgE0DyEScgEgDyEycgEoDyEicgFADyHycgEwDyJCcgNwFyGxcgHUFyBBcgAoFyGRbgJQEyOhcgGQEyFxdgGQEyFRdgGsEyEhdgHoEyHxdgK4EyLBdgIYEyMxdgGoEyISdgJMGyNCcgL8HyMhbgKsHyNCegAYHyGSegMgFyPSegGEEyOCegFUDyHiegOwCyNhcgNcDyPycgOYDyMCdgGsDyASdgFQDyHhcgIAFyDhagIYFyPxbgMEFyPAZgM8FyDBZgAUGyLxYgCUGyAhbgCYGyLBbgCYGyPRagDQGyIBagMlGAABnzAAICgkGURQHloBaAO2mAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
        val CloudReading2 = decode64("Os8QFgMAAAAAAAAAAAAAAAAAAAAAAAAAnn4DHFQDyGBaAFYDyHRaAE8DyAhbAEgDyDxaAE4DyCRaAFADyDBaAFIDyExaAFUDyFhaAFkDyDRaAFoDyEBaAF0DyEhaAFsDyHhaAFoDyGRaAF8DyFxaAFwDyGwagFcDyGhaAMAEyASYAOsEyKxZAAAFyCBbAAsFyARbADgFyGgbgGQFyJRbALIFyDAcgBYGyGhaAGUGyEhbAMsGyBBaAMQGyIRYADoHyPBaABYHyCxbAEQHyABcAAwHyABcAFMGyAhcALcGyDxcAAYIyOxbAK4IyAgcgIwIyLwbgFgIyMxbAKwHyEQcgIkFyMgcgIAEyMRbAIoEyFhbACkEyPhbAFIDyBxbAEgDyDxaAOUEyLhYAO4EyAyYAOkEyDiYAGQEyChYALQfAACjJwAIywj3UBQHloBaAO2mAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
        val CloudReading3 = decode64("ZcXwFAMAAAAAAAAAAAAAAAAAAAAAAAAAD9QKElYDyLBaAFQDyLhaAGEDyJxaAHMDyGRaAIoDyDCaAKoDyESaANIDyFhaAPsDyDSaACIEyPSZADsEyAyaAJkDyHhaAIYDyEyaAHEDyIxaAGUDyKSaAFkDyGBaAFYDyKRaAAoDyHxaAG8DyBiaAGAEyPSZABsFyPBZAIAFyEhaAE4FyOBaAPUEyPQbgHUEyBxdABQEyAxdALEDyDgegFYDyGQegBsDyORbAPkCyIxaADoEyEhaAC4EyCSaAGoEyNiZAF0EyLyZAGgDyKSaABQDyGBcAE8DyJxbAM0DyOBaALYDyHhaAMIDyPRbAIQDyCybAE0DyBCbAG4EyLCZAOYDyKiZAEAEyCiaAGgFyBBaAAwFyCiaAIUEyKyZADYDyAyaALszAADpaQAIUwiRURQHloBaAO2mAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")

        private fun decode64(base64String: String) : ByteArray {
            val decoder = Base64.getDecoder()
            return decoder.decode(base64String)
        }
    }
}