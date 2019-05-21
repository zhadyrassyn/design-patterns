package observer.own;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        System.out.println(show());
    }

    @Override
    public String show() {
        return "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity";
    }
}
