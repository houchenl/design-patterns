package com.yulin.pattern.command.recorder;

public class PlayCommand implements Command {

    private Recorder recorder;

    public PlayCommand(Recorder recorder) {
        this.recorder = recorder;
    }

    @Override
    public void execute() {
        this.recorder.play();
    }

}
