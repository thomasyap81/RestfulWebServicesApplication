package com.thomas.rest.webservices.restwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filtering") // field1, field3
	public MappingJacksonValue filtering() {
		SomeBean someBean = new SomeBean("value1", "value2", "value3");

		return getFilteredMapping(someBean, "field1", "field3");
	}

	@GetMapping("/filtering-list") // field2,field3
	public MappingJacksonValue filteringList() {

		List<SomeBean> list = Arrays.asList(
				new SomeBean("value1", "value2", "value3"),
				new SomeBean("value4", "value5", "value6"));

		return getFilteredMapping(list, "field2", "field3");
	}

	public MappingJacksonValue getFilteredMapping(Object value, String... fields) {

		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(value);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(fields);
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		mappingJacksonValue.setFilters(filters);

		return mappingJacksonValue;

	}
}
