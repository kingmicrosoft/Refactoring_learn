package com.IO;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by wenchai on 2015/7/24.
 */
public class RandomAccessFileDemo extends RandomAccessFile {
    public RandomAccessFileDemo(String name, String mode) throws FileNotFoundException {
        super(name, mode);
    }
}
