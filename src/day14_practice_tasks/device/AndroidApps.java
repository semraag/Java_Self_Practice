package day14_practice_tasks.device;

public interface AndroidApps extends Downloadable{
    String APP_STORE_NAME  = "Google Play";
    String OS = "Android";

    @Override
    void downloadApp();
}
