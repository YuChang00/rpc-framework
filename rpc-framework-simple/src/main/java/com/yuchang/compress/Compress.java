package com.yuchang.compress;

import com.yuchang.extension.SPI;

/**
 * @author yuchang
 */

@SPI
public interface Compress {

    byte[] compress(byte[] bytes);


    byte[] decompress(byte[] bytes);
}
