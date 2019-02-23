package ucsdcse12pa7student;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Loader {
	public static String FILES_PATH = "./data";

	public static OrderedDefaultMap<Integer, OrderedDefaultMap<String, Integer>> generateDatabase(Path path)
			throws IOException {
		return null;
	}

	public static OrderedDefaultMap<String, Integer> rangeSearch(
			OrderedDefaultMap<Integer, OrderedDefaultMap<String, Integer>> db, String low, String high) {
		return null;
	}

	public static List<Entry<String, Integer>> topN(
			OrderedDefaultMap<Integer, OrderedDefaultMap<String, Integer>> db,
			String low, String high, int n) {
		return null;
	}

	public static void main(String[] args) throws IOException {
		Path path = FileSystems.getDefault().getPath(Loader.FILES_PATH);


	}
}
