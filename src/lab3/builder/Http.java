package lab3.builder;

import java.util.HashMap;
import java.util.Map;


public class Http {

  private final String url;
  private final String method;
  private final Map<String, String> headers;
  private final String token;

  public Http(Builder builder){
    this.token = builder.token;
    this.url = builder.url;
    this.method = builder.method;
    this.headers = Map.copyOf(builder.headers);

  }

  public String getMethod() {
    return method;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public String getToken() {
    return token;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public String toString() {
    return "Http{" +
           "url='" + url + '\'' +
           ", method='" + method + '\'' +
           ", headers=" + headers +
           ", token='" + token + '\'' +
           '}';
  }

  public static final class Builder{
    private String url;
    private String method = "GET";
    private Map<String, String> headers = new HashMap<>();
    private String token;

    public Builder url(String url){
      this.url = url;
      return this;
    }

    public Builder method(String method){
      this.method = method;
      return this;
    }

    public Builder token(String token){
      this.token = token;
      return this;
    }

    public Builder header(String key, String value){
      this.headers.put(key, value);
      return this;
    }

    public Http build(){
      if(this.url == null || this.url.isBlank())
        throw new IllegalStateException("url обязательно должен быть указан!");
      return new Http(this);
    }
  }








}
