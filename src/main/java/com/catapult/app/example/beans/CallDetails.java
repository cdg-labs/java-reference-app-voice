package com.catapult.app.example.beans;

import com.catapult.app.example.adapters.CallbackAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CallDetails implements Serializable {

    private static final long serialVersionUID = -5147454881949650162L;

    private String callId;

    private List<CallbackAdapter> callbacks = new ArrayList<>();

    public CallDetails(String callId) {
        this.callId = callId;
    }

    public String getCallId() {
        return callId;
    }

    public List<CallbackAdapter> getCallbacks() {
        return callbacks;
    }

    public void addCallback(CallbackAdapter callback) {
        this.callbacks.add(callback);
    }

    public void setCallbacks(List<CallbackAdapter> callbacks) {
        this.callbacks = callbacks;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallDetails{");
        sb.append("callId='").append(callId).append('\'');
        sb.append(", callbacks=").append(callbacks);
        sb.append('}');
        return sb.toString();
    }
}
