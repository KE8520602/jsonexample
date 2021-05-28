import java.net.URL
import com.github.kittinunf.fuel.*




fun main(){
    //URL("https://httpsbin.org/get")
    //val data =Fuel.get("https://httpsbin.org/json").responseObject()
    val data="https://httpsbin.org/json".httpGet().responseString()
     println(data)


}