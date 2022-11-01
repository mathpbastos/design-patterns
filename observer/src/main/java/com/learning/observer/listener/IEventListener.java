package com.learning.observer.listener;

import java.io.File;

public interface IEventListener {
    void update(String operation, File file);
}
