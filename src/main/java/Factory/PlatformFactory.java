package Factory;

public class PlatformFactory {
 public static Platform getPlatform(String platform) {
     if(platform.equals("Android")) {
         return new Android();
     }else{
         return new Ios();
     }
 }
}
