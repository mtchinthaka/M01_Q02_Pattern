package com.spring.pattern;

public class DefaultFontWeightRenderer implements Renderer {
    public String render(String text) {
        return new StringBuilder(text).append("Font Weight Rendering...").toString();
    }
}
