package com.joyfulshark.clipleap.process;

import com.joyfulshark.clipleap.common.Video;

public interface FillScoresIfc {

    void fillScores(Video video);

    void calcFrameScore(Video video, int i);

}
