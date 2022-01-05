package io.github.danielpine.sonar.base;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

public class GzipUtils {

    public static String uncompressToString(byte[] bytes) {
        return uncompressToString(bytes, Charset.defaultCharset());
    }

    public static String uncompressToString(byte[] bytes, Charset charset) {
        return new String(uncompress(bytes), charset);
    }

    public static byte[] uncompress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             ByteArrayInputStream in = new ByteArrayInputStream(bytes);
             GZIPInputStream ungzip = new GZIPInputStream(in)) {
            byte[] buffer = new byte[256];
            int n;
            while ((n = ungzip.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
            return out.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("gzip uncompress failed", e);
        }
    }
}
