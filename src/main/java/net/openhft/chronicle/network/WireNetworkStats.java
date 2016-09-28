/*
 * Copyright 2016 higherfrequencytrading.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package net.openhft.chronicle.network;

import net.openhft.chronicle.wire.AbstractMarshallable;

import java.util.UUID;

public class WireNetworkStats extends AbstractMarshallable implements NetworkStats {
    private long writeBps, readBps, socketPollCountPerSecond;
    private long timestamp;
    private long localIdentifier;
    private long remoteIdentifier;
    private int port;
    private UUID clientId;
    private String hostName;
    private String userId;
    private boolean isConnected;

    public WireNetworkStats(int localIdentifier) {
        this.localIdentifier = localIdentifier;
    }

    @Override
    public WireNetworkStats hostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    @Override
    public String userId() {
        return userId;
    }

    @Override
    public WireNetworkStats userId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public long writeBps() {
        return writeBps;
    }

    @Override
    public WireNetworkStats writeBps(long writeBps) {
        this.writeBps = writeBps;
        return this;
    }

    @Override
    public long readBps() {
        return readBps;
    }

    @Override
    public WireNetworkStats readBps(long readBps) {
        this.readBps = readBps;
        return this;
    }

    @Override
    public long socketPollCountPerSecond() {
        return socketPollCountPerSecond;
    }

    @Override
    public WireNetworkStats socketPollCountPerSecond(long socketPollCountPerSecond) {
        this.socketPollCountPerSecond = socketPollCountPerSecond;
        return this;
    }

    @Override
    public long timestamp() {
        return timestamp;
    }

    @Override
    public WireNetworkStats timestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public void host(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public void port(int port) {
        this.port = port;
    }

    @Override
    public long localIdentifier() {
        return localIdentifier;
    }

    @Override
    public WireNetworkStats localIdentifier(long localIdentifer) {
        this.localIdentifier = localIdentifer;
        return this;
    }

    @Override
    public long remoteIdentifier() {
        return remoteIdentifier;
    }

    @Override
    public WireNetworkStats remoteIdentifier(long remoteIdentifier) {
        this.remoteIdentifier = remoteIdentifier;
        return this;
    }

    @Override
    public void clientId(UUID clientId) {
        this.clientId = clientId;
    }

    @Override
    public UUID clientId() {
        return clientId;
    }

    @Override
    public String hostName() {
        return hostName;
    }

    @Override
    public int port() {
        return port;
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public void isConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }
}