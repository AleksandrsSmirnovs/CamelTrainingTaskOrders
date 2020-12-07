package task.training.cameltraining.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.OneToMany;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Component
@CsvRecord(separator = ",", generateHeaderColumns = true)
public class Region {

    private String name;

    @OneToMany
    private List<Country> countryList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(name, region.name) &&
                Objects.equals(countryList, region.countryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countryList);
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", countryList=" + countryList +
                '}';
    }
}
