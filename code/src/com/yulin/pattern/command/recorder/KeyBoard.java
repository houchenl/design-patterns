package com.yulin.pattern.command.recorder;

// 录单机键盘，充当命令请求者角色
public class KeyBoard {

    private PlayCommand playCommand;
    private RewindCommand rewindCommand;
    private StopCommand stopCommand;

    public void setPlayCommand(PlayCommand playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(RewindCommand rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(StopCommand stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play() {
        if (this.playCommand != null) {
            this.playCommand.execute();
        }
    }

    public void rewind() {
        if (this.rewindCommand != null) {
            this.rewindCommand.execute();
        }
    }

    public void stop() {
        if (this.stopCommand != null) {
            this.stopCommand.execute();
        }
    }

}
