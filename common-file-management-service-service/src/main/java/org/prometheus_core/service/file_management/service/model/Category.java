
package org.prometheus_core.service.file_management.service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Category {

    
    private String name;
    
    private Integer id;
    

    public Category () {
    }

    
    
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Category Category = (org.prometheus_core.service.file_management.service.model.Category) o;

        return Objects.equals(name, Category.name) &&
        
        Objects.equals(id, Category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,  id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Category {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
