package io.aeron.cluster;

/**
 * State in leader transfer.
 */
public enum LeaderTransferState {
    INIT,
    WAITING_NOTIFY,
    NOTIFIED,
    TRANSFER_TIMEOUT
}
