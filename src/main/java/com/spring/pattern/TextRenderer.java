package com.spring.pattern;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
public class TextRenderer {
    private final DefaultFontStyleRenderer defaultFontStyleRenderer;
    private final DefaultColorRenderer defaultColorRenderer;
    private final DefaultFontWeightRenderer defaultFontWeightRenderer;

    public void render(String text) {
        String renderedText = applyRendering(text, defaultFontStyleRenderer, defaultColorRenderer, defaultFontWeightRenderer);
        log.info("rendering {}", renderedText);
    }

    private String applyRendering(String text, Renderer... renderers) {
        for (Renderer renderer : renderers)
            text = renderer.render(text);

        return text;
    }
}
