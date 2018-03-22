        package api.entities.planets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "count",
        "next",
        "previous",
        "results"
})
public class Planet {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("next")
    private String next;
    @JsonProperty("previous")
    private Object previous;
    @JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Planet() {
    }


    public Planet(Integer count, String next, Object previous, List<Result> results) {
        super();
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public Planet withCount(Integer count) {
        this.count = count;
        return this;
    }

    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    @JsonProperty("next")
    public void setNext(String next) {
        this.next = next;
    }

    public Planet withNext(String next) {
        this.next = next;
        return this;
    }

    @JsonProperty("previous")
    public Object getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public Planet withPrevious(Object previous) {
        this.previous = previous;
        return this;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Planet withResults(List<Result> results) {
        this.results = results;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Planet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).append("next", next).append("previous", previous).append("results", results).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(results).append(previous).append(count).append(additionalProperties).append(next).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Planet) == false) {
            return false;
        }
        Planet rhs = ((Planet) other);
        return new EqualsBuilder().append(results, rhs.results).append(previous, rhs.previous).append(count, rhs.count).append(additionalProperties, rhs.additionalProperties).append(next, rhs.next).isEquals();
    }

}