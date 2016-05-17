package HttpClientDemo;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpPostImpl {
	
	public static void main(String args[]){
		//创建Http默认客户端
		HttpClient httpClient = new DefaultHttpClient();
		
		//创建post请求实例
		HttpPost httpPost =  new HttpPost("http://www.baidu.com");
		
		try{
			//客户端执行get请求 返回响应实体
			HttpResponse httpResponse = httpClient.execute(httpPost);
			
			//服务器响应状态行
			System.out.println("服务器响应状态行:"+httpResponse.getStatusLine());
			
			//响应头
			Header[] headers = httpResponse.getAllHeaders();
			for(Header h:headers){
				System.out.println("响应头:"+h.getName()+":"+h.getValue());
			}
			
			//获取响应消息实体
			HttpEntity httpEntity = httpResponse.getEntity();
			if(httpEntity != null){
				//响应实体内容
				System.out.println("响应实体内容："+EntityUtils.toString(httpEntity));
				System.out.println("响应实体内容长度："+httpEntity.getContentLength());
			}else{
				System.out.println("响应实体内容为空！");
			}
			
		}catch(Exception e){
			System.out.println("出错！详情为："+e);
		}finally{
			httpClient.getConnectionManager().shutdown();
		}
		
		
	}
}
