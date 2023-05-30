package collection_practice.list_practice.practice03.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Biz {
	
	private String[] contents;
	
	public List<Book> convert(String[] contents) {
		return Arrays
				.stream(contents)
				.map(it -> Book.of(new StringTokenizer(it, "/")))
				.collect(Collectors.toList());	
	}
}
