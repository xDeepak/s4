/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.s4.ft;

/**
 * 
 * <p>
 * This class defines a checkpointing event (either a request for checkpoint or for recovery).
 * </p>
 * <p>
 * Checkpointing events are queued in the PE event queue and processed according the the PE processor scheduler (FIFO).
 * </p>
 */
public abstract class CheckpointingEvent {

    private SafeKeeperId safeKeeperId;

    /**
     * This is a requirement of the serialization framework
     */
    public CheckpointingEvent() {
    }

    /**
     * Constructor identifying the PE subject to checkpointing or recovery
     * @param safeKeeperId safeKeeperId
     */
    public CheckpointingEvent(SafeKeeperId safeKeeperId) {
        this.safeKeeperId = safeKeeperId;
    }

    public SafeKeeperId getSafeKeeperId() {
        return safeKeeperId;
    }

    public void setSafeKeeperId(SafeKeeperId id) {
        this.safeKeeperId = id;
    }

}
