package com.yulin.pattern.command.recorder;

public class StopCommand implements Command {

    private Recorder recorder;

    public StopCommand(Recorder recorder) {
        this.recorder = recorder;
    }

    @Override
    public void execute() {
        this.recorder.stop();
    }

}
