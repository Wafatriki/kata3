package es.ulpgc.dis.model;

import java.util.List;


public interface Histogram {
	String title();

	List<String> labels();

	int valueOf(String label);
}
