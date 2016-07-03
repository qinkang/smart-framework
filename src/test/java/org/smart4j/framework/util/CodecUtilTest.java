package org.smart4j.framework.util;

import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

/**
 * Created by qinkang on 16/7/3.
 */
public class CodecUtilTest {
    @Test
    public void testEncodeURL() {
        String out = CodecUtil.encodeURL("http://www.google.com");
        System.out.println(out);
        org.junit.Assert.assertNotNull(out);
    }

    @Test
    public void testDecodeURL() {
        String out = CodecUtil.encodeURL("http://www.google.com");
        System.out.println(out);

        String decodeURL = CodecUtil.decodeURL(out);
        System.out.println(decodeURL);
        org.junit.Assert.assertNotNull(decodeURL);
    }

    @Test
    public void testMD5() {
        String str = "hello world";
        String out = CodecUtil.md5(str);
        System.out.println(out);
        org.junit.Assert.assertNotNull(out);
    }


}
