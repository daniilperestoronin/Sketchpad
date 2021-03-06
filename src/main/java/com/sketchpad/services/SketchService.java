package com.sketchpad.services;

import com.sketchpad.domain.Sketch;

import java.util.Collection;

/**
 * @author Perestoronin Daniil
 */
public interface SketchService {
    Collection<Sketch> getAllSketches();
    Sketch getSketchById(Long id);
    Sketch createSketch(Sketch sketch);
    void updateSketch(Sketch sketch);
    void deleteSketch(Long id);
}
