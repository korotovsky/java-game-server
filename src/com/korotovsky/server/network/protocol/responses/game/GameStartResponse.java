package com.korotovsky.server.network.protocol.responses.game;

import com.korotovsky.server.network.protocol.Response;

import java.io.BufferedWriter;

public class GameStartResponse extends Response {
    protected String type = "game";
    protected String status = "ok";
    protected String message = "start";

    public GameStartResponse(BufferedWriter writer) {
        super(writer);
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getStatus() {
        return status;
    }
}