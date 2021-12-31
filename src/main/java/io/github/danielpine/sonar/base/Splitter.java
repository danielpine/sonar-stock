package io.github.danielpine.sonar.base;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Splitter {

    private String separator;
    private List<String> keys;


    public Splitter keys(List<String> keys) {
        this.keys = keys;
        return this;
    }


    public static Splitter on(final String separator) {
        Splitter splitter = new Splitter();
        splitter.separator = separator;
        return splitter;
    }

    public Map<String, String> splitToMap(final CharSequence sequence) {
        Stack<String> keyStack = new Stack<>();
        keyStack.addAll(keys);
        return com.google.common.base.Splitter
                .on(separator)
                .splitToStream(sequence)
                .collect(Collectors.toMap(e -> keyStack.pop(), Function.identity()));
    }

}
