package com.example.springcloudawsgh101;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class ValidationFailureAnalyzer extends AbstractFailureAnalyzer<FooException> {
    @Override protected FailureAnalysis analyze(Throwable rootFailure, FooException cause) {
        return new FailureAnalysis(
                "Oooops something went wrong",
                "action", cause);
    }
}
