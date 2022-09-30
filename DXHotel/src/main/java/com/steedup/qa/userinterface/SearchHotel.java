package com.steedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchHotel {
  public static final Target LOCATION1 = Target
           .the("Into location")
           .locatedBy("(//div[@class='dx-field-item-content dx-field-item-content-location-bottom'])[2]");


    public static final Target LOS_HANALULU = Target
            .the("Select los angeles")
            .locatedBy("//div[@class='dx-scrollview-content']//div[.='{0}']");

    public static final Target CALENDAR2 = Target
            .the("Select calendar")
            .located(By.xpath("(//input[@class='dx-texteditor-input'])[3]"));


    public static final Target CALENDAR = Target
            .the("Select calendar")
            .located(By.xpath("(//input[@class='dx-texteditor-input'])[2]"));

  public static final Target ROOMSCLICK = Target
          .the("Select rooms")
          .locatedBy("(//input[@class='dx-texteditor-input'])[4]");

  public static final Target ROOM = Target
          .the("Select rooms number")
          .locatedBy("(//div[@class='dx-item-content dx-list-item-content'])[11]");

  public static final Target CLICADULTS = Target
          .the("Select number adults")
          .locatedBy("(//input[@class='dx-texteditor-input'])[5]");

  public static final Target ADULTS = Target
          .the("Select number adults")
          .locatedBy("(//div[@class='dx-item-content dx-list-item-content'])[15]");


 public static final Target CLICCHILD = Target
          .the("Select number children")
          .locatedBy("(//input[@class='dx-texteditor-input'])[6]");

  public static final Target CHILDREN = Target
          .the("Select number children")
          .locatedBy("(//div[@class='dx-item-content dx-list-item-content'])[19]");


  public static final Target BUTTON_SEARCH = Target
          .the("Click boton search")
          .locatedBy("/html/body/div[1]/div/div/div[2]/div[1]/div/div[1]/div[1]/div/div[1]/div[3]/div/div");

//QUESTIONS
    public static final Target TITULO_BUSQUEDA_CORRECTA = Target
            .the("Muestra el titulo de la ciudad buscada")
            .locatedBy("(//*[@class='city'])[2]");

    public static final Target TITULO_BUSQUEDA_NEYYORK = Target
            .the("Muestra el titulo de la ciudad buscada")
            .locatedBy("(//*[@class='city'])[1]");

    public static final Target GET_PRICE_HOTEL1 = Target
            .the("Obtener precio del primer hotel")
            .locatedBy("(//*[@class='rate-number'])[1]");

    public static final Target GET_PRICE_HOTEL2 = Target
            .the("Obtener precio del segundo hotel")
            .locatedBy("(//*[@class='rate-number'])[2]");

  public static final Target GET_PRICE_HOTEL3 = Target
          .the("Obtener precio del tercer hotel")
          .locatedBy("(//*[@class='rate-number'])[3]");

    public static final Target CLICK_BUTTON = Target
            .the("Seleccionar hotel")
            .located(By.xpath("(//*[contains(@aria-label,'Book it')])[1]"));

    public static final Target CLICK_BUTTON2 = Target
            .the("Seleccionar hotel")
            .located(By.xpath("(//*[contains(@aria-label,'Book it')])[2]"));


  public static final Target CLICK_BUTTON3 = Target
          .the("Seleccionar hotel")
          .located(By.xpath("(//*[contains(@aria-label,'Book it')])[3]"));

    public static final Target GET_PRICE_TOTAL = Target
            .the("Obtener precio total")
            .locatedBy("(//h4[@class='total-price'])[1]");


}

