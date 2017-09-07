package org.schabi.newpipe.playlist.events;

public enum PlayQueueEvent {
    INIT,

    // sent when the user is seamlessly transitioned by exoplayer to the next stream
    NEXT,

    // sent when the user transitions to an unbuffered period
    SELECT,

    // sent when more streams are added to the play queue
    APPEND,

    // sent when a pending stream is removed from the play queue
    REMOVE,

    // sent when two streams swap place in the play queue
    MOVE
}

