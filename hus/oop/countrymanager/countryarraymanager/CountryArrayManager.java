package hus.oop.countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     * 
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[min_idx].getPopulation())
                    min_idx = j;
            }

            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     * 
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[min_idx].getPopulation())
                    min_idx = j;
            }

            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[i];
            newArray[i] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     * 
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     * 
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * 
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     * 
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        List<AfricaCountry> africaCountry = new ArrayList<>();
        for (Country country : newArray) {
            if (country instanceof AfricaCountry) {
                africaCountry.add((AfricaCountry) country);
            }
        }
        AfricaCountry[] result = new AfricaCountry[africaCountry.size()];
        return africaCountry.toArray(result);
    }

    public AsiaCountry[] filterAsiaCountry() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        List<AsiaCountry> asiaCountry = new ArrayList<>();
        for (Country country : newArray) {
            if (country instanceof AsiaCountry) {
                asiaCountry.add((AsiaCountry) country);
            }
        }
        AsiaCountry[] result = new AsiaCountry[asiaCountry.size()];
        return asiaCountry.toArray(result);

    }

    public EuropeCountry[] filterEuropeCountry() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        List<EuropeCountry> europeCountry = new ArrayList<>();
        for (Country country : newArray) {
            if (country instanceof EuropeCountry) {
                europeCountry.add((EuropeCountry) country);
            }
        }
        EuropeCountry[] result = new EuropeCountry[europeCountry.size()];
        return europeCountry.toArray(result);

    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        List<NorthAmericaCountry> northAmericaCountry = new ArrayList<>();
        for (Country country : newArray) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountry.add((NorthAmericaCountry) country);
            }
        }
        NorthAmericaCountry[] result = new NorthAmericaCountry[northAmericaCountry.size()];
        return northAmericaCountry.toArray(result);

    }

    public OceaniaCountry[] filterOceaniaCountry() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        List<OceaniaCountry> oceaniaCountry = new ArrayList<>();
        for (Country country : newArray) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountry.add((OceaniaCountry) country);
            }
        }
        OceaniaCountry[] result = new OceaniaCountry[oceaniaCountry.size()];
        return oceaniaCountry.toArray(result);

    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        List<SouthAmericaCountry> southAmericaCountry = new ArrayList<>();
        for (Country country : newArray) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountry.add((SouthAmericaCountry) country);
            }
        }
        SouthAmericaCountry[] result = new SouthAmericaCountry[southAmericaCountry.size()];
        return southAmericaCountry.toArray(result);

    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] newArray = sortByDecreasingPopulation();
        Country[] mostPopulationCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            mostPopulationCountries[i] = newArray[i];
        }
        return mostPopulationCountries;

    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] newArray = sortByIncreasingPopulation();
        Country[] leastPopulationCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            leastPopulationCountries[i] = newArray[i];
        }
        return leastPopulationCountries;

    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] newArray = sortByDecreasingArea();
        Country[] largestAreaCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            largestAreaCountries[i] = newArray[i];
        }
        return largestAreaCountries;

    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] newArray = sortByIncreasingArea();
        Country[] largestAreaCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            largestAreaCountries[i] = newArray[i];
        }
        return largestAreaCountries;

    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] newArray = sortByDecreasingGdp();
        Country[] highestGdpCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            highestGdpCountries[i] = newArray[i];
        }
        return highestGdpCountries;

    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] newArray = sortByIncreasingGdp();
        Country[] highestGdpCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            highestGdpCountries[i] = newArray[i];
        }
        return highestGdpCountries;

    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < length; i++) {
            if (countries[i] != null) {
                result.append(countries[i].getName())
                        .append(", Population: ")
                        .append(countries[i].getPopulation())
                        .append(", Area: ")
                        .append(countries[i].getArea())
                        .append(", GDP: ")
                        .append(countries[i].getGdp())
                        .append("\n");
            }
        }
        if (result.length() > 1) {
            result.deleteCharAt(result.length() - 1);
        }
        result.append("]");
        return result.toString();
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
