package org.example.task2;

import java.util.HashMap;
import java.util.Map;

public class InGroupVisitor implements StampingVisitor {
    private boolean inGroup;

    public InGroupVisitor() {
        this.inGroup = false;
    }

    @Override
    public Map<String, Object> onGroupStart(Group<?> group, Map<String, String> headers) {
        this.inGroup = true;
        Map<String, Object> result = new HashMap<>();
        result.put("in_group", this.inGroup);
        result.put("stamped_headers", new String[]{"in_group"});
        return result;
    }

    @Override
    public void onGroupEnd(Group<?> group, Map<String, String> headers) {
        this.inGroup = false;
    }

    @Override
    public Map<String, Object> onSignature(Signature<?> signature, Map<String, String> headers) {
        System.out.println("Signature in group: " + signature.getId());
        Map<String, Object> result = new HashMap<>();
        result.put("in_group", this.inGroup);
        result.put("stamped_headers", new String[]{"in_group"});
        return result;
    }
}
