object CaesarCipher {
  def Encryption(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      }
    }
  }

  def Decryption(text: String, shift: Int): String = {
    Encryption(text, 26 - shift) 
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello"
    val shiftValue = 3

    val encryptedText = Encryption(plaintext, shiftValue)
    val decryptedText = Decryption(encryptedText, shiftValue)

    println(s"Plaintext: $plaintext")
    println(s"Encrypted: $encryptedText")
    println(s"Decrypted: $decryptedText")
  }
}
