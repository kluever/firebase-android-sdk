// Copyright 2022 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.firebase.firestore;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.Query.Direction;
import java.util.concurrent.Executor;

public class GroupByQuery {

  GroupByQuery() {}

  @NonNull
  public Query getQuery() {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public Task<GroupByQuerySnapshot> get() {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public Task<GroupByQuerySnapshot> get(@NonNull Source source) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public ListenerRegistration addSnapshotListener(
      @NonNull EventListener<GroupByQuerySnapshot> listener) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public ListenerRegistration addSnapshotListener(
      @NonNull Executor executor, @NonNull EventListener<GroupByQuerySnapshot> listener) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public ListenerRegistration addSnapshotListener(
      @NonNull Activity activity, @NonNull EventListener<GroupByQuerySnapshot> listener) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public ListenerRegistration addSnapshotListener(
      @NonNull MetadataChanges metadataChanges,
      @NonNull EventListener<GroupByQuerySnapshot> listener) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public ListenerRegistration addSnapshotListener(
      @NonNull Executor executor,
      @NonNull MetadataChanges metadataChanges,
      @NonNull EventListener<GroupByQuerySnapshot> listener) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public ListenerRegistration addSnapshotListener(
      @NonNull Activity activity,
      @NonNull MetadataChanges metadataChanges,
      @NonNull EventListener<GroupByQuerySnapshot> listener) {
    throw new RuntimeException("not implemented");
  }

  // Note: Specifying an empty list of aggregates, or not invoking this method at all, is equivalent
  // to an SQL "DISTINCT" operator.
  @NonNull
  public GroupByQuery aggregate(@NonNull AggregateField... fields) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery withLatencyCompensationMode(AggregateExecutionMode mode) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery groupLimit(long maxGroups) {
    throw new RuntimeException("not implemented");
  }

  // Question: Do we want to support group-by "limitToLast" queries? In the Query class this is
  // implemented entirely client side by issuing the requested query with inverted order-by. We
  // would need to verify at runtime that the underlying query has the correct order-by clause and
  // possibly invert first/last aggregations to maintain their expected semantics.
  @NonNull
  public GroupByQuery groupLimitToLast(long maxGroups) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery groupOffset(long groupOffset) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery startAtGroup(Object... fieldValues) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery startAtGroup(@NonNull GroupSnapshot snapshot) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery startAfterGroup(Object... fieldValues) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery startAfterGroup(@NonNull GroupSnapshot snapshot) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery endAtGroup(Object... fieldValues) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery endAtGroup(@NonNull GroupSnapshot snapshot) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery endBeforeGroup(Object... fieldValues) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery endBeforeGroup(@NonNull GroupSnapshot snapshot) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery orderByGroup(@NonNull String groupByField) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery orderByGroup(@NonNull FieldPath groupByField) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery orderByGroup(@NonNull AggregateField aggregateField) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery orderByGroup(@NonNull String groupByField, @NonNull Direction direction) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery orderByGroup(@NonNull FieldPath groupByField, @NonNull Direction direction) {
    throw new RuntimeException("not implemented");
  }

  @NonNull
  public GroupByQuery orderByGroup(
      @NonNull AggregateField aggregateField, @NonNull Direction direction) {
    throw new RuntimeException("not implemented");
  }

  @Override
  public int hashCode() {
    throw new RuntimeException("not implemented");
  }

  @Override
  public boolean equals(Object obj) {
    throw new RuntimeException("not implemented");
  }
}
