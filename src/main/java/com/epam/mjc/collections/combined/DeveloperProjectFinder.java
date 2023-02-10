package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects,
                                             String developer) {
        return projects.keySet().stream()
                .filter(e -> projects.get(e).contains(developer))
                .sorted((o1, o2) -> {
                    if (o1.length() == o2.length()) {
                        return o2.compareTo(o1);
                    }
                    return o2.length() - o1.length();
                })
                .collect(Collectors.toList());
    }
}
