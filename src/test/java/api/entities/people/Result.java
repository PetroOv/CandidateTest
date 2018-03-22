
package api.entities.people;

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
        "name",
        "height",
        "mass",
        "hair_color",
        "skin_color",
        "eye_color",
        "birth_year",
        "gender",
        "homeworld",
        "films",
        "species",
        "vehicles",
        "starships",
        "created",
        "edited",
        "url"
})
public class Result {

    @JsonProperty("name")
    private String name;
    @JsonProperty("height")
    private String height;
    @JsonProperty("mass")
    private String mass;
    @JsonProperty("hair_color")
    private String hairColor;
    @JsonProperty("skin_color")
    private String skinColor;
    @JsonProperty("eye_color")
    private String eyeColor;
    @JsonProperty("birth_year")
    private String birthYear;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("homeworld")
    private String homeworld;
    @JsonProperty("films")
    private List<String> films = new ArrayList<String>();
    @JsonProperty("species")
    private List<String> species = new ArrayList<String>();
    @JsonProperty("vehicles")
    private List<String> vehicles = new ArrayList<String>();
    @JsonProperty("starships")
    private List<String> starships = new ArrayList<String>();
    @JsonProperty("created")
    private String created;
    @JsonProperty("edited")
    private String edited;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Result() {
    }


    public Result(String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender, String homeworld, List<String> films, List<String> species, List<String> vehicles, List<String> starships, String created, String edited, String url) {
        super();
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
        this.gender = gender;
        this.homeworld = homeworld;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Result withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    public Result withHeight(String height) {
        this.height = height;
        return this;
    }

    @JsonProperty("mass")
    public String getMass() {
        return mass;
    }

    @JsonProperty("mass")
    public void setMass(String mass) {
        this.mass = mass;
    }

    public Result withMass(String mass) {
        this.mass = mass;
        return this;
    }

    @JsonProperty("hair_color")
    public String getHairColor() {
        return hairColor;
    }

    @JsonProperty("hair_color")
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public Result withHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    @JsonProperty("skin_color")
    public String getSkinColor() {
        return skinColor;
    }

    @JsonProperty("skin_color")
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public Result withSkinColor(String skinColor) {
        this.skinColor = skinColor;
        return this;
    }

    @JsonProperty("eye_color")
    public String getEyeColor() {
        return eyeColor;
    }

    @JsonProperty("eye_color")
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Result withEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    @JsonProperty("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public Result withBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Result withGender(String gender) {
        this.gender = gender;
        return this;
    }

    @JsonProperty("homeworld")
    public String getHomeworld() {
        return homeworld;
    }

    @JsonProperty("homeworld")
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public Result withHomeworld(String homeworld) {
        this.homeworld = homeworld;
        return this;
    }

    @JsonProperty("films")
    public List<String> getFilms() {
        return films;
    }

    @JsonProperty("films")
    public void setFilms(List<String> films) {
        this.films = films;
    }

    public Result withFilms(List<String> films) {
        this.films = films;
        return this;
    }

    @JsonProperty("species")
    public List<String> getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public Result withSpecies(List<String> species) {
        this.species = species;
        return this;
    }

    @JsonProperty("vehicles")
    public List<String> getVehicles() {
        return vehicles;
    }

    @JsonProperty("vehicles")
    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public Result withVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    @JsonProperty("starships")
    public List<String> getStarships() {
        return starships;
    }

    @JsonProperty("starships")
    public void setStarships(List<String> starships) {
        this.starships = starships;
    }

    public Result withStarships(List<String> starships) {
        this.starships = starships;
        return this;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    public Result withCreated(String created) {
        this.created = created;
        return this;
    }

    @JsonProperty("edited")
    public String getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(String edited) {
        this.edited = edited;
    }

    public Result withEdited(String edited) {
        this.edited = edited;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Result withUrl(String url) {
        this.url = url;
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

    public Result withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("height", height).append("mass", mass).append("hairColor", hairColor).append("skinColor", skinColor).append("eyeColor", eyeColor).append("birthYear", birthYear).append("gender", gender).append("homeworld", homeworld).append("films", films).append("species", species).append("vehicles", vehicles).append("starships", starships).append("created", created).append("edited", edited).append("url", url).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(edited).append(starships).append(birthYear).append(species).append(films).append(hairColor).append(skinColor).append(url).append(mass).append(height).append(created).append(eyeColor).append(additionalProperties).append(name).append(homeworld).append(gender).append(vehicles).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return new EqualsBuilder().append(edited, rhs.edited).append(starships, rhs.starships).append(birthYear, rhs.birthYear).append(species, rhs.species).append(films, rhs.films).append(hairColor, rhs.hairColor).append(skinColor, rhs.skinColor).append(url, rhs.url).append(mass, rhs.mass).append(height, rhs.height).append(created, rhs.created).append(eyeColor, rhs.eyeColor).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(homeworld, rhs.homeworld).append(gender, rhs.gender).append(vehicles, rhs.vehicles).isEquals();
    }

}