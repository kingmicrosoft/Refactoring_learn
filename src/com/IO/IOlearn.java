package com.IO;

import java.io.*;

/**
 * Created by wenchai on 2015/7/24.
 */
public class IOlearn {

    public static void main(String[] args) throws IOException {
        String file="c:/abc.txt";
        String chartset="UTF-8";

            FileOutputStream outputStream=new FileOutputStream(file);
            OutputStreamWriter writer=new OutputStreamWriter(outputStream,chartset);
            writer.write("我是hello world");
            FileInputStream in=new FileInputStream(file);
        //write partern 2
        FileWriter writer2=new FileWriter(file);
        writer2.write("我是hello world");

        //read the data
        InputStreamReader reader=new InputStreamReader(in,chartset);
        char [] buf=new char[64];
        StringBuffer buffer=new StringBuffer();

        int count=0;
        while((count=reader.read(buf))!=-1){
        buffer.append(buf);
        }

        //read partern 2

        FileReader reader2 = new FileReader(file);
    while (reader2.read(buf)>0){
        buffer.append(buf);
    }
        buffer.toString();
String s="hha";
        byte[] b=s.getBytes();



        in.close();
    reader.close();
        RandomAccessFile fwrite=new RandomAccessFile("myfile","rw");
        fwrite.seek(fwrite.length());
        fwrite.writeBytes("haha");
        fwrite.seek(10);
        byte[] buf1=new byte[10];
       fwrite.read(buf1);

    }


}
