package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearch_Steps {
    @Given("I am on Ebay search page")
    public void i_am_on_ebay_search_page() {
        System.out.println("I am on Ebay search");
    }

    @When("I click Ebay Logo")
    public void i_click_ebay_logo() {
        System.out.println("I click Ebay Logo");
    }

    @Then("I am navigated to Ebay Home page")
    public void i_am_navigated_to_ebay_home_page() {
        System.out.println("I am navigated to Ebay Home page");
    }

    @Given("I am on Ebay Advanced Search Page")
    public void i_am_on_ebay_advanced_search_page() {
        System.out.println("I am on Ebay Advanced Search Page");
    }

    @When("I advanced search an item {string}")
    public void i_advanced_search_an_item(String string) {
        System.out.println(string);
    }

    @Then("I am navigated to Product Page")
    public void i_am_navigated_to_product_page() {
        System.out.println("I am navigated to Product Page");
    }
    //Note:
    //for strings to pass them as parameters we need to use quotes
    //for number we dont need we can simply write 10 etc

    @When("I advanced search an item")
    public void i_advanced_search_an_item(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
//this for passing mutilple parameters and that para,eter belomgs to when step only
    //here keywrd,exclude ,min and max are columns
    //and rest are rows
    //this is data table for a particular step
}
