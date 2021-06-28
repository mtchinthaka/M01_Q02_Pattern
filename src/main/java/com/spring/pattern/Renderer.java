package com.spring.pattern;

import lombok.NonNull;

public interface Renderer {

    public String render(@NonNull String text);
}
