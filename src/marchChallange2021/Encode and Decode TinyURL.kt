package marchChallange2021

class Codec() {
    // Encodes a URL to a shortened URL.
    val map = hashMapOf<String,String>()
    fun encode(longUrl: String): String {
       val byte = longUrl.toByteArray()
        var encodedKey = ""
        byte.forEach {
            encodedKey+=String.format("%02X", it)
        }
        map[encodedKey] = longUrl
        return "http://tinyurl.com/$encodedKey"
    }

    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String? {
       shortUrl.substringAfter("http://tinyurl.com/")
        return map[ shortUrl.substringAfter("http://tinyurl.com/")]

    }
}