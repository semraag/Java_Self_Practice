package day14_practice_tasks.device;

public interface AppleApps extends Downloadable{
    String APP_STORE_NAME  = "Apple Store";
    String OS = "IOS";
    @Override
    void downloadApp();
}
