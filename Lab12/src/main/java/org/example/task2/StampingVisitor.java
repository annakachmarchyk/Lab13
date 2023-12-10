package org.example.task2;

import java.util.Map;

public interface StampingVisitor {
    Map<String, Object> onGroupStart(Group<?> group, Map<String, String> headers);
    void onGroupEnd(Group<?> group, Map<String, String> headers);
    Map<String, Object> onSignature(Signature<?> signature, Map<String, String> headers);
}
