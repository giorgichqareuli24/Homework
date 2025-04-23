public class WeatherForecast {
    private String cityName;
    private double windSpeed;
    private int rainProbability;
    private boolean willRain;
    private boolean cloudy;
    private boolean sunny;

    public WeatherForecast(String cityName, double windSpeed, int rainProbability, boolean willRain, boolean cloudy, boolean sunny) {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.rainProbability = rainProbability;
        this.willRain = willRain;
        this.cloudy = cloudy;
        this.sunny = sunny;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getRainProbability() {
        return rainProbability;
    }

    public void setRainProbability(int rainProbability) {
        this.rainProbability = rainProbability;
    }

    public boolean isWillRain() {
        return willRain;
    }

    public void setWillRain(boolean willRain) {
        this.willRain = willRain;
    }

    public boolean isCloudy() {
        return cloudy;
    }

    public void setCloudy(boolean cloudy) {
        this.cloudy = cloudy;
    }

    public boolean isSunny() {
        return sunny;
    }

    public void setSunny(boolean sunny) {
        this.sunny = sunny;
    }

    public void printForecast() {
        System.out.println("ამინდის პროგნოზი ქალაქში: " + cityName);
        System.out.println("ქარის სიჩქარე: " + windSpeed + " კმ/სთ");
        System.out.println("წვიმის ალბათობა: " + rainProbability + "%");
        System.out.println("წვიმა: " + (willRain ? "კი" : "არა"));
        System.out.println("მოღრუბლული: " + (cloudy ? "კი" : "არა"));
        System.out.println("მზიანი: " + (sunny ? "კი" : "არა"));
    }

    public boolean recommendForWalk() {
        if (willRain || windSpeed > 20 || rainProbability > 50) {
            return false;
        }
        return sunny || !cloudy;
    }

}
