import com.yuchang.HelloService;
import com.yuchang.config.RpcServiceConfig;
import com.yuchang.remoting.transport.socket.SocketRpcServer;
import com.yuchang.serviceimpl.HelloServiceImpl1;

/**
 * @author yuchang
 */
public class SocketServerMain {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl1();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        rpcServiceConfig.setService(helloService);
        socketRpcServer.registerService(rpcServiceConfig);
        socketRpcServer.start();
    }
}
