package HttpServerNetty;


import io.netty.handler.codec.http.HttpRequest;

@Mapped(uri = "/h1")
public class UriHandler1 extends UriHandlerBased {

    @Override
    public void process(HttpRequest request, StringBuilder buff) {
        buff.append("HELLO HANDLER1!");
    }
}
