
package com.example.imageclassification.customview;


import com.example.imageclassification.tflite.Classifier;

import java.util.List;

public interface ResultsView {
  public void setResults(final List<Classifier.Recognition> results);
}
