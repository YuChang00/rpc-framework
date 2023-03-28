import com.yuchang.HelloService;
import com.yuchang.annotation.RpcScan;
import com.yuchang.config.RpcServiceConfig;
import com.yuchang.remoting.transport.netty.server.NettyRpcServer;
import com.yuchang.serviceimpl.HelloServiceImpl2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Server: 通过@RpcService注释自动注册服务
 *
 * @author yuchang
 */
@RpcScan(basePackage = {"com.yuchang"})
public class NettyServerMain {
    public static void main(String[] args) {
        // Register service via annotation
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(NettyServerMain.class);
        NettyRpcServer nettyRpcServer = (NettyRpcServer) applicationContext.getBean("nettyRpcServer");
        // Register service manually
        HelloService helloService2 = new HelloServiceImpl2();
        RpcServiceConfig rpcServiceConfig = RpcServiceConfig.builder()
                .group("test2").version("version2").service(helloService2).build();
        nettyRpcServer.registerService(rpcServiceConfig);
        nettyRpcServer.start();
    }
}
