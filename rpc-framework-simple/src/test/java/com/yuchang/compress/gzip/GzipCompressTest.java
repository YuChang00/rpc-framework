package com.yuchang.compress.gzip;

import com.yuchang.compress.Compress;
import com.yuchang.remoting.dto.RpcRequest;
import com.yuchang.serialize.kyro.KryoSerializer;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GzipCompressTest {
    @Test
    void gzipCompressTest() {
        Compress gzipCompress = new GzipCompress();
        RpcRequest rpcRequest = RpcRequest.builder().methodName("hello")
                .parameters(new Object[]{"sayhelooloo", "sayhelooloosayhelooloo"})
                .interfaceName("github.javaguide.HelloService")
                .paramTypes(new Class<?>[]{String.class, String.class})
                .requestId(UUID.randomUUID().toString())
                .group("group1")
                .version("version1")
                .build();
        KryoSerializer kryoSerializer = new KryoSerializer();
        byte[] rpcRequestBytes = kryoSerializer.serialize(rpcRequest);
        byte[] compressRpcRequestBytes = gzipCompress.compress(rpcRequestBytes);
        byte[] decompressRpcRequestBytes = gzipCompress.decompress(compressRpcRequestBytes);
        assertEquals(rpcRequestBytes.length, decompressRpcRequestBytes.length);
    }


}