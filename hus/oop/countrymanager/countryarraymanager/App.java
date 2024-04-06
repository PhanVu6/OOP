package hus.oop.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        testOriginalData();
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();
        testSortIncreasingByArea();
        testSortDecreasingByArea();
        testSortIncreasingByGdp();
        testSortDecreasingByGdp();
        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterNorthAmericaCountry();
        testFilterOceaniaCountry();
        testFilterSouthAmericaCountry();
        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();
        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();

        System.out.println();
        System.out.println("Data have been read is: ");
        System.out.println(countryManager);

    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }
                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);

                // Tạo đối tượng Country phù hợp với lục địa
                Country country = null;
                switch (continent) {
                    case "Asia":
                        country = new AsiaCountry(code, name, population, area, gdp);
                        break;
                    case "Europe":
                        country = new EuropeCountry(code, name, population, area, gdp);
                        break;
                    case "Africa":
                        country = new AfricaCountry(code, name, population, area, gdp);
                        break;
                    case "NorthAmerica":
                        country = new NorthAmericaCountry(code, name, population, area, gdp);
                        break;
                    case "Oceania":
                        country = new OceaniaCountry(code, name, population, area, gdp);
                        break;
                    default:
                        country = new SouthAmericaCountry(code, name, population, area, gdp);
                        break;
                }

                countryManager.append(country);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "D:\\ClassLearnKHTN\\Ky2nam4\\OOP\\hus\\oop\\countrymanager\\data\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testFilterAfricaCountry() {
        Country[] africaCountries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(africaCountries);
        System.out.println("Filter Africa Country:\n" + codesString);
    }

    public static void testFilterAsiaCountry() {
        Country[] asiaCountries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(asiaCountries);
        System.out.println("Filter Asia Country:\n" + codesString);
    }

    public static void testFilterEuropeCountry() {
        Country[] europeCountries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(europeCountries);
        System.out.println("Filter Europe Country:\n" + codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] northAmericaCountries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(northAmericaCountries);
        System.out.println("Filter NorthAmerica Country:\n" + codesString);
    }

    public static void testFilterOceaniaCountry() {
        Country[] oceaniaCountries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(oceaniaCountries);
        System.out.println("Filter Oceania Country:\n" + codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] southAmericaCountries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(southAmericaCountries);
        System.out.println("Filter SouthAmerica Country:\n" + codesString);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] mostPopulousCountries = countryManager.filterMostPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(mostPopulousCountries);
        System.out.println("Filter Most Populous Countries:\n" + codesString);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] leastPopulousCountries = countryManager.filterLeastPopulousCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(leastPopulousCountries);
        System.out.println("Filter Least Populous Countries:\n" + codesString);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] largestAreaCountries = countryManager.filterLargestAreaCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(largestAreaCountries);
        System.out.println("Filter Largest Area Countries:\n" + codesString);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] smallestAreaCountries = countryManager.filterSmallestAreaCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(smallestAreaCountries);
        System.out.println("Filter Smallest Area Countries:\n" + codesString);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] highestGdpCountries = countryManager.filterHighestGdpCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(highestGdpCountries);
        System.out.println("Filter Highest GDP Countries:\n" + codesString);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] lowestGdpCountries = countryManager.filterLowestGdpCountries(5);
        String codesString = CountryArrayManager.codeOfCountriesToString(lowestGdpCountries);
        System.out.println("Filter Lowest GDP Countries:\n" + codesString);
    }
}
