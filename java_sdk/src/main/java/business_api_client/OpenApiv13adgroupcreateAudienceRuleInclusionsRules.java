/*
 * Copyright 2023 TikTok Pte. Ltd.
 *
 * This source code is licensed under the MIT license found in
 * the LICENSE file in the root directory of this source tree.
 */

package business_api_client;

import java.util.Objects;
import java.util.Arrays;
import business_api_client.OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources;
import business_api_client.OpenApiv13adgroupcreateAudienceRuleExclusionsFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OpenApiv13adgroupcreateAudienceRuleInclusionsRules
 */

@javax.annotation.Generated(value = "com.tiktok.codegen.JavatiktokcodegenGenerator", date = "2023-06-28T14:49:22.099759+05:30[Asia/Kolkata]")
public class OpenApiv13adgroupcreateAudienceRuleInclusionsRules {
  @JsonProperty("event_sources")
  private List<OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources> eventSources = null;

  @JsonProperty("filter")
  private OpenApiv13adgroupcreateAudienceRuleExclusionsFilter filter = null;

  @JsonProperty("retention")
  private String retention = null;

  public OpenApiv13adgroupcreateAudienceRuleInclusionsRules eventSources(List<OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources> eventSources) {
    this.eventSources = eventSources;
    return this;
  }

  public OpenApiv13adgroupcreateAudienceRuleInclusionsRules addEventSourcesItem(OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources eventSourcesItem) {
    if (this.eventSources == null) {
      this.eventSources = new ArrayList<OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources>();
    }
    this.eventSources.add(eventSourcesItem);
    return this;
  }

   /**
   * Get eventSources
   * @return eventSources
  **/
  @Schema(description = "")
  public List<OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources> getEventSources() {
    return eventSources;
  }

  public void setEventSources(List<OpenApiv13adgroupcreateAudienceRuleExclusionsEventSources> eventSources) {
    this.eventSources = eventSources;
  }

  public OpenApiv13adgroupcreateAudienceRuleInclusionsRules filter(OpenApiv13adgroupcreateAudienceRuleExclusionsFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public OpenApiv13adgroupcreateAudienceRuleExclusionsFilter getFilter() {
    return filter;
  }

  public void setFilter(OpenApiv13adgroupcreateAudienceRuleExclusionsFilter filter) {
    this.filter = filter;
  }

  public OpenApiv13adgroupcreateAudienceRuleInclusionsRules retention(String retention) {
    this.retention = retention;
    return this;
  }

   /**
   * Get retention
   * @return retention
  **/
  @Schema(description = "")
  public String getRetention() {
    return retention;
  }

  public void setRetention(String retention) {
    this.retention = retention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiv13adgroupcreateAudienceRuleInclusionsRules openApiv13adgroupcreateAudienceRuleInclusionsRules = (OpenApiv13adgroupcreateAudienceRuleInclusionsRules) o;
    return Objects.equals(this.eventSources, openApiv13adgroupcreateAudienceRuleInclusionsRules.eventSources) &&
        Objects.equals(this.filter, openApiv13adgroupcreateAudienceRuleInclusionsRules.filter) &&
        Objects.equals(this.retention, openApiv13adgroupcreateAudienceRuleInclusionsRules.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSources, filter, retention);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiv13adgroupcreateAudienceRuleInclusionsRules {\n");
    
    sb.append("    eventSources: ").append(toIndentedString(eventSources)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
