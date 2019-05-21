package com.yulin.pattern.command.recorder;

public class RewindCommand implements Command {

    private Recorder recorder;

    public RewindCommand(Recorder recorder) {
        this.recorder = recorder;
    }

    @Override
    public void execute() {
        this.recorder.rewind();
    }

}
