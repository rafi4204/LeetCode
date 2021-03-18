package marchChallange2021

class Codec() {
  // Encodes a URL to a shortened URL.
    val map = hashMapOf<String, String>()

    fun encode(longUrl: String): String {

        //first convert the longUrl to byteArray
        //then covert every byte of the byte array into hexadecimal and add it to encodedkey string
        //encoded key wii be used as key and value is longUrl
        //before returning the hexadecimal value add "http://tinyurl.com/"
        val byte = longUrl.toByteArray()
        var encodedKey = ""
        byte.forEach {
            encodedKey += String.format("%02X", it)
        }
        map[encodedKey] = longUrl
        return "http://tinyurl.com/$encodedKey"
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String? {

        //just return the value using key we have stored in encode method

        shortUrl.substringAfter("http://tinyurl.com/")
        return map[shortUrl.substringAfter("http://tinyurl.com/")]

    }
}