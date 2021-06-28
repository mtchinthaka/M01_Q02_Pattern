package com.spring.pattern;

public class Runner {

    public static void main(String[] args) {
        TextRenderer textRenderer = new TextRenderer(
                new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new DefaultFontWeightRenderer()
        );
        textRenderer.render("Default Rendering...");

        TextRenderer redRenderer = new TextRenderer(
                new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new DefaultFontWeightRenderer()
        );
        redRenderer.render("Red Color Rendering...");

        TextRenderer boldRenderer = new TextRenderer(
                new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new DefaultFontWeightRenderer()
        );
        boldRenderer.render("Bold Rendering");

    }
}
