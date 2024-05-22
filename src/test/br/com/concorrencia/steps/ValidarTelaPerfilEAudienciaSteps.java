package br.com.concorrencia.steps;

import br.com.concorrencia.runner.RunCucumberTest;
import constants.EstudoCppConstants;
import constants.PerfilEAudienciaConstants;
import io.cucumber.java.pt.E;
import org.openqa.selenium.By;

public class ValidarTelaPerfilEAudienciaSteps extends RunCucumberTest {

    @E("a tela {} deve conter os filtros especificados")
    public void filtros_telas_de_relatorios(String menu){
        if (menu.equals("perfil e audiencia")){
            String[] xpaths = {
                    PerfilEAudienciaConstants.MONTHFILTERFIELD_XPATH,
                    PerfilEAudienciaConstants.YEARFILTERFIELD_XPATH,
                    PerfilEAudienciaConstants.PRACAFILTERFIELD_XPATH
            };
            for (String xpath : xpaths) {
                driver.findElement(By.xpath(xpath)).isDisplayed();
            }
        } else if (menu.equals("estudo cpp")) {
            String[] xpaths = {
                    PerfilEAudienciaConstants.MONTHFILTERFIELD_XPATH,
                    PerfilEAudienciaConstants.YEARFILTERFIELD_XPATH,
                    PerfilEAudienciaConstants.PRACAFILTERFIELD_XPATH
            };
            for (String xpath : xpaths) {
                driver.findElement(By.xpath(xpath)).isDisplayed();
            }
        }
    }

    @E("a tela {} deve conter os botoes de acão especificados")
    public void botoes_de_acao_de_relatorios(String menu){
        if (menu.equals("perfil e audiencia")){
            String[] xpaths = {
                    PerfilEAudienciaConstants.SEARCHREPORTPERFILAUDIENCIABTN_XPATH,
                    PerfilEAudienciaConstants.CLEARFILTERREPORTPERFILAUDIENCIABTN_XPATH
            };
            for (String xpath : xpaths) {
                driver.findElement(By.xpath(xpath)).isDisplayed();
            }
        } else if (menu.equals("estudo cpp")) {
            String[] xpaths = {
                    EstudoCppConstants.SEARCHREPORTESTUDOCPPBTN_XPATH,
                    EstudoCppConstants.CLEARFILTERREPORTESTUDOCPPBTN_XPATH
            };
            for (String xpath : xpaths) {
                driver.findElement(By.xpath(xpath)).isDisplayed();
            }
        }
    }

}
