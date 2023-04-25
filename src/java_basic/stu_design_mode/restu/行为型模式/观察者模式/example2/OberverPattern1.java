package java_basic.stu_design_mode.restu.行为型模式.观察者模式.example2;

import java.util.ArrayList;
import java.util.List;

public class OberverPattern1 {
    public static void main(String[] args) {
        //被观察者 天气数据
        WeatherData weatherData = new WeatherData();
        // 当前天气
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // 未来天气
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // 发布消息
        List<Float> forecastTemperatures = new ArrayList<Float>();
        forecastTemperatures.add(22f);
        forecastTemperatures.add(-1f);
        forecastTemperatures.add(9f);
        forecastTemperatures.add(23f);
        forecastTemperatures.add(27f);
        forecastTemperatures.add(30f);
        forecastTemperatures.add(10f);
        weatherData.setMeasurements(22f, 0.8f, 1.2f, forecastTemperatures);

    }
}
