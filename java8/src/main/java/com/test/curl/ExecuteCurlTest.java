package com.test.curl;

import java.io.*;
import java.util.Arrays;

public class ExecuteCurlTest {

    public static void main(String arg[]) throws IOException {

        ProcessBuilder pb = new ProcessBuilder(
                "curl",
                "-s",
                " http://172.16.32.217:9999/mule/applications");

        pb.directory(new File("/c/tmp/output"));
        pb.redirectErrorStream(true);
        Process p = pb.start();
        InputStream is = p.getInputStream();

        FileOutputStream outputStream = new FileOutputStream("/c/tmp/output/out.json");

        BufferedInputStream bis = new BufferedInputStream(is);
        byte[] bytes = new byte[100];
        int numberByteReaded;
        while ((numberByteReaded = bis.read(bytes, 0, 100)) != -1) {

            outputStream.write(bytes, 0, numberByteReaded);
            Arrays.fill(bytes, (byte) 0);

        }
        outputStream.flush();
        outputStream.close();

    }
}
