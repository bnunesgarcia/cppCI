package br.com.concorrencia.support;

import br.com.concorrencia.runner.RunCucumberTest;
import java.util.ArrayList;
import java.util.List;

public class Utils extends RunCucumberTest {

    public static final String[] XPATH_SELECTORS_USER_COLUMNS = {
            "/html/body/app-root/app-topbar/div/app-user/div/table/thead/tr/th[1]",
            "/html/body/app-root/app-topbar/div/app-user/div/table/thead/tr/th[2]",
            "/html/body/app-root/app-topbar/div/app-user/div/table/thead/tr/th[3]",
            "/html/body/app-root/app-topbar/div/app-user/div/table/thead/tr/th[4]",
            "/html/body/app-root/app-topbar/div/app-user/div/table/thead/tr/th[5]",
            "/html/body/app-root/app-topbar/div/app-user/div/table/thead/tr/th[6]"
    };

    public static final String[] XPATH_SELECTORS_PROFILEACCESS_COLUMNS = {
            "/html/body/app-root/app-topbar/div/app-access-profile/div/table/thead/tr/th[1]",
            "/html/body/app-root/app-topbar/div/app-access-profile/div/table/thead/tr/th[2]",
            "/html/body/app-root/app-topbar/div/app-access-profile/div/table/thead/tr/th[3]",
    };

    public static final String[] XPATH_SELECTORS_USERPERMISSIONS = {
            "/html/body/app-root/app-topbar/div/app-edit-access-profile/div/mat-card/mat-card-content/div[1]/div[1]/mat-list/div[1]",
            "/html/body/app-root/app-topbar/div/app-edit-access-profile/div/mat-card/mat-card-content/div[1]/div[1]/mat-list/div[2]",
            "/html/body/app-root/app-topbar/div/app-edit-access-profile/div/mat-card/mat-card-content/div[1]/div[1]/mat-list/div[3]",
            "/html/body/app-root/app-topbar/div/app-edit-access-profile/div/mat-card/mat-card-content/div[1]/div[1]/mat-list/div[4]",
            "/html/body/app-root/app-topbar/div/app-edit-access-profile/div/mat-card/mat-card-content/div[1]/div[1]/mat-list/div[5]"
    };



    public static List<Expected> expectedColumnUserTable(){
        List<Expected> colunasTabelaUsuario = new ArrayList<>();
        colunasTabelaUsuario.add(new Expected(XPATH_SELECTORS_USER_COLUMNS[0], "Nome"));
        colunasTabelaUsuario.add(new Expected(XPATH_SELECTORS_USER_COLUMNS[1], "E-mail"));
        colunasTabelaUsuario.add(new Expected(XPATH_SELECTORS_USER_COLUMNS[2], "Login"));
        colunasTabelaUsuario.add(new Expected(XPATH_SELECTORS_USER_COLUMNS[3], "Perfil de Acesso"));
        colunasTabelaUsuario.add(new Expected(XPATH_SELECTORS_USER_COLUMNS[4], "Conta Ativa"));
        colunasTabelaUsuario.add(new Expected(XPATH_SELECTORS_USER_COLUMNS[5], "Ações"));

        return colunasTabelaUsuario;
    }

    public static List<Expected> expectedColumnAccessProfileTable(){
        List<Expected> colunasTabelaPerfilDeAcesso = new ArrayList<>();
        colunasTabelaPerfilDeAcesso.add(new Expected(XPATH_SELECTORS_PROFILEACCESS_COLUMNS[0], "Título"));
        colunasTabelaPerfilDeAcesso.add(new Expected(XPATH_SELECTORS_PROFILEACCESS_COLUMNS[1], "Descrição"));
        colunasTabelaPerfilDeAcesso.add(new Expected(XPATH_SELECTORS_PROFILEACCESS_COLUMNS[2], "Ações"));

        return colunasTabelaPerfilDeAcesso;
    }

    public static List<Expected> expectedUserPermissions(){
        List<Expected> permissionsUserList = new ArrayList<>();
        permissionsUserList.add(new Expected(XPATH_SELECTORS_USERPERMISSIONS[0], "Leitura completa"));
        permissionsUserList.add(new Expected(XPATH_SELECTORS_USERPERMISSIONS[1], "Criar ou editar todas as funcionalidades"));
        permissionsUserList.add(new Expected(XPATH_SELECTORS_USERPERMISSIONS[2], "Leitura das funções administrativas"));
        permissionsUserList.add(new Expected(XPATH_SELECTORS_USERPERMISSIONS[3], "Permite criar ou editar dados administrativos"));
        permissionsUserList.add(new Expected(XPATH_SELECTORS_USERPERMISSIONS[4], "Permite a visualização de todos os relatórios"));

        return permissionsUserList;
    }

}



