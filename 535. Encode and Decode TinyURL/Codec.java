// Runtime: 3 ms, faster than 79.10% of Java online submissions for Encode and Decode TinyURL.
// Memory Usage: 42.3 MB, less than 88.11% of Java online submissions for Encode and Decode TinyURL.

public class Codec {
    static final String URL_PREFIX = "https://tinyurlclone.com/";
    static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    static final int BASE = ALPHABET.length;
    
    Map<Integer, String> map = new HashMap<>();
    static int id = 1000;
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int tmpId = ++id;
        
        map.put(tmpId, longUrl);
        
        StringBuilder encodedUrl = new StringBuilder(URL_PREFIX);
        
        while (tmpId > 0) {
            encodedUrl.append(ALPHABET[tmpId % BASE]);
            tmpId /= BASE;
        }
        
        
        return encodedUrl.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        shortUrl = shortUrl.replace(URL_PREFIX, "");
        
        int tmpId = 0;
        for (int i = shortUrl.length() - 1; i >= 0; --i) {
            char ch = shortUrl.charAt(i);
            
            tmpId = (tmpId * BASE) + ch;
            if (ch >= 'a' && ch <= 'z') tmpId = (tmpId - 'a');
            if (ch >= 'A' && ch <= 'Z') tmpId = (tmpId - 'A') + 26;
            if (ch >= '0' && ch <= '9') tmpId = (tmpId - '0') + 52;
        }
        
        return map.get(tmpId);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
