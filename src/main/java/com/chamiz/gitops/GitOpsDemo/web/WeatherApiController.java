package com.chamiz.gitops.GitOpsDemo.web;

import com.chamiz.gitops.GitOpsDemo.ows.Weather;
import com.chamiz.gitops.GitOpsDemo.ows.WeatherForecast;
import com.chamiz.gitops.GitOpsDemo.ows.WeatherService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherApiController {

	private final WeatherService weatherService;

	public WeatherApiController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	@RequestMapping("/now/{country}/{city}")
	public Weather getWeather(@PathVariable String country,
							  @PathVariable String city) {
		return this.weatherService.getWeather(country, city);
	}

	@RequestMapping("/weekly/{country}/{city}")
	public WeatherForecast getWeatherForecast(@PathVariable String country,
											  @PathVariable String city) {
		return this.weatherService.getWeatherForecast(country, city);
	}

}
