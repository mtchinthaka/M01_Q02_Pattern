package com.spring.pattern;

public class DefaultColorRenderer implements Renderer {
    public String render(String text) {
        return new StringBuilder(text).append("Color Rendering...").toString();
    }
}
