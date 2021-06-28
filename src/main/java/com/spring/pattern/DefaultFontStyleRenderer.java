package com.spring.pattern;

public class DefaultFontStyleRenderer implements Renderer{

    public String render(String text) {
        return new StringBuilder(text).append("Font Style Rendering...").toString();
    }
}
