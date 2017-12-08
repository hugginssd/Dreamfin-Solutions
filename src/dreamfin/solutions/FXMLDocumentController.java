/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamfin.solutions;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {

    //FileMenuItems
    @FXML
    private MenuItem logoutMenuItem;

    @FXML
    private MenuItem close;

    //ClientMenuItems
    @FXML
    private Menu clientsMenu;
    @FXML
    private MenuItem transferClientMenuItem;

    @FXML
    private MenuItem clientsMenuItem;

    @FXML
    private MenuItem registerClientMenuItem;

    //GroupsMenu
    @FXML
    private Menu groupsMenu;

    @FXML
    private MenuItem groupPostingMenuItem;

    @FXML
    private MenuItem groupsMenuItem;

    @FXML
    private MenuItem createGroupsMenuItem;

    @FXML
    private MenuItem centersMenuItem;

    @FXML
    private MenuItem transferGroupsMenuItem;

    //ProductsMenu
    @FXML
    private Menu productsMenu;

    @FXML
    private MenuItem fundsTransferMenuItem;

    @FXML
    private MenuItem standingInstructionMenuItem;

    @FXML
    private MenuItem savingsMenuItem;

    @FXML
    private MenuItem loansMenuItem;

    //ReportsMenu
    @FXML
    private Menu reportsMenu;

    @FXML
    private MenuItem clientsReportsMenuItem;

    @FXML
    private MenuItem groupReportsMenuItem;

    @FXML
    private MenuItem savingsReportsMenuItem;

    @FXML
    private MenuItem loanReportsMenuItem;

    @FXML
    private MenuItem organizationReportsMenuItem;

    @FXML
    private MenuItem financialReportsMenuItem;

    @FXML
    private MenuItem reportsSchedulerMenuItem;

    @FXML
    private MenuItem dataExportMenuItem;

    //AccountingMenu
    @FXML
    private Menu accountingMenu;

    @FXML
    private MenuItem tellerManagementMenuItem;

    @FXML
    private MenuItem registrationMenuItem;

    @FXML
    private MenuItem closePeriodsMenuItem;

    @FXML
    private MenuItem journalsMenuItem;

    @FXML
    private MenuItem chartOfAccountsMenuItem;

    @FXML
    private MenuItem periodAccrualMenuItem;

    @FXML
    private MenuItem accountingExportMenuItem;

    //ConfigurationsMenu
    @FXML
    private Menu configurationMenu;

    @FXML
    private MenuItem accessManagementMenuItem;

    @FXML
    private MenuItem productsMenuItem;

    @FXML
    private MenuItem branchesMenuItem;

    @FXML
    private MenuItem advancedMenuItem;

    @FXML
    private MenuItem mmtServicesMenuItem;

    @FXML
    private MenuItem smsModuleMenuItem;

    @FXML
    private MenuItem auditMenuItem;

    @FXML
    private MenuItem emailModuleMenuItem;

    @FXML
    private MenuItem customizationMenuItem;

    //TasksMenu@@
    @FXML
    private Menu tasksMenu;
    @FXML
    private MenuItem pendingApprovalMenuItem;

    @FXML
    private MenuItem myActionsMenuItem;

    //HelpMenu
    @FXML
    private Menu helpMenuItem;

    @FXML
    private MenuItem aboutUsMenuItem;

    @FXML
    private MenuItem contactUsMenuItem;

    @FXML
    private MenuItem licenseMenuItem;

    @FXML
    private MenuItem faqMenuItem;

    @FXML
    Stage stage;

    @FXML
    private LineChart<String, Number> lineChartOLB;

    @FXML
    private ObservableList<?> lineChartOLBList;

    @FXML
    private ScatterChart<?, ?> sc;

    @FXML
    private StackedAreaChart<Number, Number> scatterAreaChartDisbursedLoans;

    @FXML
    private StackedBarChart<?, ?> stackedBarChartPAR;

    @FXML
    private ScatterChart<String, Double> scatterOutstandingLoans;

    @FXML
    private AreaChart<Number, Number> areaChartRegisteredClients;

    Functions functions = new Functions();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        final Image newClient = new Image(getClass().getResourceAsStream("/resources/icons/eye1.png"));
        final Button btnNewClient = new Button("New Client", new ImageView(newClient));

        final Image newApplication = new Image(getClass().getResourceAsStream("/resources/icons/eye1.png"));
        final Button btnNewLoanApplication = new Button("New Application", new ImageView(newApplication));

        final Image enterRepayment = new Image(getClass().getResourceAsStream("/resources/icons/eye1.png"));
        final Button btnEnterRepayment = new Button("Enter Repayment", new ImageView(enterRepayment));

        Image transferClient = new Image(getClass().getResourceAsStream("/resources/icons/transfer_clients.png"));
        ImageView transferClientView = new ImageView(transferClient);
        transferClientView.setFitHeight(20);
        transferClientView.setFitWidth(20);
        transferClientMenuItem.setGraphic(transferClientView);

        Image clients = new Image(getClass().getResourceAsStream("/resources/icons/clients.png"));
        ImageView clientsView = new ImageView(clients);
        clientsView.setFitHeight(20);
        clientsView.setFitWidth(20);
        clientsMenuItem.setGraphic(clientsView);

        Image registerClient = new Image(getClass().getResourceAsStream("/resources/icons/register_clients.png"));
        ImageView registerClientView = new ImageView(registerClient);
        registerClientView.setFitHeight(20);
        registerClientView.setFitWidth(20);
        registerClientMenuItem.setGraphic(registerClientView);

        Image groupPosting = new Image(getClass().getResourceAsStream("/resources/icons/group_posting.png"));
        ImageView groupPostingView = new ImageView(groupPosting);
        groupPostingView.setFitHeight(20);
        groupPostingView.setFitWidth(20);
        groupPostingMenuItem.setGraphic(groupPostingView);

        Image groupsImage = new Image(getClass().getResourceAsStream("/resources/icons/add_user_group.png"));
        ImageView groupsView = new ImageView(groupsImage);
        groupsView.setFitHeight(20);
        groupsView.setFitWidth(20);
        groupsMenuItem.setGraphic(groupsView);

        Image createGroupsImage = new Image(getClass().getResourceAsStream("/resources/icons/create_groups.png"));
        ImageView createGroupsView = new ImageView(createGroupsImage);
        createGroupsView.setFitHeight(20);
        createGroupsView.setFitWidth(20);
        createGroupsMenuItem.setGraphic(createGroupsView);

        Image centersImage = new Image(getClass().getResourceAsStream("/resources/icons/create_center.png"));
        ImageView centersView = new ImageView(centersImage);
        centersView.setFitHeight(20);
        centersView.setFitWidth(20);
        centersMenuItem.setGraphic(centersView);

        Image transferGroupsImage = new Image(getClass().getResourceAsStream("/resources/icons/transfer_groups.png"));
        ImageView transferGroupsView = new ImageView(transferGroupsImage);
        transferGroupsView.setFitHeight(20);
        transferGroupsView.setFitWidth(20);
        transferGroupsMenuItem.setGraphic(transferGroupsView);

        Image fundsTransferImage = new Image(getClass().getResourceAsStream("/resources/icons/funds_transfer.png"));
        ImageView fundsTransferView = new ImageView(fundsTransferImage);
        fundsTransferView.setFitHeight(20);
        fundsTransferView.setFitWidth(20);
        fundsTransferMenuItem.setGraphic(fundsTransferView);

        Image standingInstructionImage = new Image(getClass().getResourceAsStream("/resources/icons/instructions.png"));
        ImageView standingInstructionView = new ImageView(standingInstructionImage);
        standingInstructionView.setFitHeight(20);
        standingInstructionView.setFitWidth(20);
        standingInstructionMenuItem.setGraphic(standingInstructionView);

        Image savingsImage = new Image(getClass().getResourceAsStream("/resources/icons/savings.png"));
        ImageView savingsView = new ImageView(savingsImage);
        savingsView.setFitHeight(20);
        savingsView.setFitWidth(20);
        savingsMenuItem.setGraphic(savingsView);

        Image loansImage = new Image(getClass().getResourceAsStream("/resources/icons/loans.png"));
        ImageView loansView = new ImageView(loansImage);
        loansView.setFitHeight(20);
        loansView.setFitWidth(20);
        loansMenuItem.setGraphic(loansView);

        Image clientsReportsImage = new Image(getClass().getResourceAsStream("/resources/icons/client_report.png"));
        ImageView clientsReportsView = new ImageView(clientsReportsImage);
        clientsReportsView.setFitHeight(20);
        clientsReportsView.setFitWidth(20);
        clientsReportsMenuItem.setGraphic(clientsReportsView);

        Image groupReportsImage = new Image(getClass().getResourceAsStream("/resources/icons/group_reports.png"));
        ImageView groupReportsView = new ImageView(groupReportsImage);
        groupReportsView.setFitHeight(20);
        groupReportsView.setFitWidth(20);
        groupReportsMenuItem.setGraphic(groupReportsView);

        Image savingsReportsImage = new Image(getClass().getResourceAsStream("/resources/icons/savings_reports.png"));
        ImageView savingsReportsView = new ImageView(savingsReportsImage);
        savingsReportsView.setFitHeight(20);
        savingsReportsView.setFitWidth(20);
        savingsReportsMenuItem.setGraphic(savingsReportsView);

        Image loansReportsImage = new Image(getClass().getResourceAsStream("/resources/icons/loans.png"));
        ImageView loansReportsView = new ImageView(loansReportsImage);
        loansReportsView.setFitHeight(20);
        loansReportsView.setFitWidth(20);
        loanReportsMenuItem.setGraphic(loansReportsView);

        Image organizationReportsImage = new Image(getClass().getResourceAsStream("/resources/icons/organisations.png"));
        ImageView organizationReportsView = new ImageView(organizationReportsImage);
        organizationReportsView.setFitHeight(20);
        organizationReportsView.setFitWidth(20);
        organizationReportsMenuItem.setGraphic(organizationReportsView);

        Image financialReportsImage = new Image(getClass().getResourceAsStream("/resources/icons/financial_report.png"));
        ImageView financialReportsView = new ImageView(financialReportsImage);
        financialReportsView.setFitHeight(20);
        financialReportsView.setFitWidth(20);
        financialReportsMenuItem.setGraphic(financialReportsView);

        Image reportsSchedulerImage = new Image(getClass().getResourceAsStream("/resources/icons/report_scheduler.png"));
        ImageView reportsSchedulerView = new ImageView(reportsSchedulerImage);
        reportsSchedulerView.setFitHeight(20);
        reportsSchedulerView.setFitWidth(20);
        reportsSchedulerMenuItem.setGraphic(financialReportsView);

        Image dataExportImage = new Image(getClass().getResourceAsStream("/resources/icons/data_export.png"));
        ImageView dataExportView = new ImageView(dataExportImage);
        dataExportView.setFitHeight(20);
        dataExportView.setFitWidth(20);
        dataExportMenuItem.setGraphic(dataExportView);//report_scheduler

        Image tellerManagementImage = new Image(getClass().getResourceAsStream("/resources/icons/teller_management.png"));
        ImageView tellerManagementView = new ImageView(tellerManagementImage);
        tellerManagementView.setFitHeight(20);
        tellerManagementView.setFitWidth(20);
        tellerManagementMenuItem.setGraphic(tellerManagementView);//teller_management

        Image registrationImage = new Image(getClass().getResourceAsStream("/resources/icons/registration.png"));
        ImageView registrationView = new ImageView(registrationImage);
        registrationView.setFitHeight(20);
        registrationView.setFitWidth(20);
        registrationMenuItem.setGraphic(registrationView);

        Image closePeriodsImage = new Image(getClass().getResourceAsStream("/resources/icons/closed_periods.png"));
        ImageView closePeriodsView = new ImageView(closePeriodsImage);
        closePeriodsView.setFitHeight(20);
        closePeriodsView.setFitWidth(20);
        closePeriodsMenuItem.setGraphic(registrationView);

        Image journalsImage = new Image(getClass().getResourceAsStream("/resources/icons/journals.png"));
        ImageView journalsView = new ImageView(journalsImage);
        journalsView.setFitHeight(20);
        journalsView.setFitWidth(20);
        journalsMenuItem.setGraphic(journalsView);

        Image chartOfAccountsImage = new Image(getClass().getResourceAsStream("/resources/icons/chart_of_accounts.png"));
        ImageView chartOfAccountsView = new ImageView(chartOfAccountsImage);
        chartOfAccountsView.setFitHeight(20);
        chartOfAccountsView.setFitWidth(20);
        chartOfAccountsMenuItem.setGraphic(chartOfAccountsView);

        Image periodAccrualImage = new Image(getClass().getResourceAsStream("/resources/icons/accrual_account.png"));
        ImageView periodAccrualView = new ImageView(periodAccrualImage);
        periodAccrualView.setFitHeight(20);
        periodAccrualView.setFitWidth(20);
        periodAccrualMenuItem.setGraphic(periodAccrualView);

        Image accountingExportImage = new Image(getClass().getResourceAsStream("/resources/icons/accounting_export.png"));
        ImageView accountingExportView = new ImageView(accountingExportImage);
        accountingExportView.setFitHeight(20);
        accountingExportView.setFitWidth(20);
        accountingExportMenuItem.setGraphic(accountingExportView);

        Image accessManagementImage = new Image(getClass().getResourceAsStream("/resources/icons/access_management.png"));
        ImageView accessManagementView = new ImageView(accessManagementImage);
        accessManagementView.setFitHeight(20);
        accessManagementView.setFitWidth(20);
        accessManagementMenuItem.setGraphic(accessManagementView);
//
//        // lineChartOLBChart Outstanding Loan Balance
//        XYChart.Series series = new XYChart.Series<>();
//        XYChart.Series series1 = new XYChart.Series<>();
//        XYChart.Series series2 = new XYChart.Series<>();
//        XYChart.Series series3 = new XYChart.Series<>();
//
//        series.getData().addAll(
//                new XYChart.Data<>("Jan", 12),
//                new XYChart.Data<>("Feb", 56),
//                new XYChart.Data<>("Mar", 6),
//                new XYChart.Data<>("Apr", 7),
//                new XYChart.Data<>("May", 15),
//                new XYChart.Data<>("Jun", 37),
//                new XYChart.Data<>("Jul", 25),
//                new XYChart.Data<>("Aug", 75),
//                new XYChart.Data<>("Sep", 37),
//                new XYChart.Data<>("Oct", 13),
//                new XYChart.Data<>("Nov", 42),
//                new XYChart.Data<>("Dec", 69));
//
//        series1.getData().addAll(
//                new XYChart.Data<>("Jan", 05),
//                new XYChart.Data<>("Feb", 25),
//                new XYChart.Data<>("Mar", 16),
//                new XYChart.Data<>("Apr", 75),
//                new XYChart.Data<>("May", 35),
//                new XYChart.Data<>("Jun", 30),
//                new XYChart.Data<>("Jul", 52),
//                new XYChart.Data<>("Aug", 50),
//                new XYChart.Data<>("Sep", 18),
//                new XYChart.Data<>("Oct", 6),
//                new XYChart.Data<>("Nov", 21),
//                new XYChart.Data<>("Dec", 32));
//        series.setName("2016");
//        series1.setName("2017");
//        // lineChartOLB.getData().addAll(series, series1);
//
//        //scatterChartClientNumbers   Client Numbers 
//        final NumberAxis xAxis = new NumberAxis(0, 10, 1);
//        final NumberAxis yAxis = new NumberAxis(-100, 500, 100);
//        sc = new ScatterChart<>(xAxis, yAxis);
//        xAxis.setLabel("Age (years)");
//        yAxis.setLabel("Returns to date");
//        sc.setTitle("Investment Overview");
//
//        XYChart.Series seriesScatterChart = new XYChart.Series();
//        seriesScatterChart.setName("Equities");
//        seriesScatterChart.getData().add(new XYChart.Data(4.2, 193.2));
//        seriesScatterChart.getData().add(new XYChart.Data(2.8, 33.6));
//        seriesScatterChart.getData().add(new XYChart.Data(6.2, 24.8));
//        seriesScatterChart.getData().add(new XYChart.Data(1, 14));
//        seriesScatterChart.getData().add(new XYChart.Data(1.2, 26.4));
//        seriesScatterChart.getData().add(new XYChart.Data(4.4, 114.4));
//        seriesScatterChart.getData().add(new XYChart.Data(8.5, 323));
//        seriesScatterChart.getData().add(new XYChart.Data(6.9, 289.8));
//        seriesScatterChart.getData().add(new XYChart.Data(9.9, 287.1));
//        seriesScatterChart.getData().add(new XYChart.Data(0.9, -9));
//        seriesScatterChart.getData().add(new XYChart.Data(3.2, 150.8));
//        seriesScatterChart.getData().add(new XYChart.Data(4.8, 20.8));
//        seriesScatterChart.getData().add(new XYChart.Data(7.3, -42.3));
//        seriesScatterChart.getData().add(new XYChart.Data(1.8, 81.4));
//        seriesScatterChart.getData().add(new XYChart.Data(7.3, 110.3));
//        seriesScatterChart.getData().add(new XYChart.Data(2.7, 41.2));
//
//        XYChart.Series series1ScatterChart = new XYChart.Series();
//        series1ScatterChart.setName("Mutual funds");
//        series1ScatterChart.getData().add(new XYChart.Data(5.2, 229.2));
//        series1ScatterChart.getData().add(new XYChart.Data(2.4, 37.6));
//        series1ScatterChart.getData().add(new XYChart.Data(3.2, 49.8));
//        series1ScatterChart.getData().add(new XYChart.Data(1.8, 134));
//        series1ScatterChart.getData().add(new XYChart.Data(3.2, 236.2));
//        series1ScatterChart.getData().add(new XYChart.Data(7.4, 114.1));
//        series1ScatterChart.getData().add(new XYChart.Data(3.5, 323));
//        series1ScatterChart.getData().add(new XYChart.Data(9.3, 29.9));
//        series1ScatterChart.getData().add(new XYChart.Data(8.1, 287.4));
//
//        sc.getData().addAll(seriesScatterChart, series1ScatterChart);
//
//        //Stacked Area Chart Disbursed loans
//        final NumberAxis xAxisArea = new NumberAxis(1, 31, 1);
//        final NumberAxis yAxisArea = new NumberAxis();
//        scatterAreaChartDisbursedLoans = new StackedAreaChart<>(xAxisArea, yAxisArea);
//
//        XYChart.Series<Number, Number> seriesApril
//                = new XYChart.Series<>();
//        seriesApril.setName("April");
//        seriesApril.getData().add(new XYChart.Data(1, 4));
//        seriesApril.getData().add(new XYChart.Data(3, 10));
//        seriesApril.getData().add(new XYChart.Data(6, 15));
//        seriesApril.getData().add(new XYChart.Data(9, 8));
//        seriesApril.getData().add(new XYChart.Data(12, 5));
//        seriesApril.getData().add(new XYChart.Data(15, 18));
//        seriesApril.getData().add(new XYChart.Data(18, 15));
//        seriesApril.getData().add(new XYChart.Data(21, 13));
//        seriesApril.getData().add(new XYChart.Data(24, 19));
//        seriesApril.getData().add(new XYChart.Data(27, 21));
//        seriesApril.getData().add(new XYChart.Data(30, 21));
//        XYChart.Series<Number, Number> seriesMay
//                = new XYChart.Series<>();
//        seriesMay.setName("May");
//        seriesMay.getData().add(new XYChart.Data(1, 20));
//        seriesMay.getData().add(new XYChart.Data(3, 15));
//        seriesMay.getData().add(new XYChart.Data(6, 13));
//        seriesMay.getData().add(new XYChart.Data(9, 12));
//        seriesMay.getData().add(new XYChart.Data(12, 14));
//        seriesMay.getData().add(new XYChart.Data(15, 18));
//        seriesMay.getData().add(new XYChart.Data(18, 25));
//        seriesMay.getData().add(new XYChart.Data(21, 25));
//        seriesMay.getData().add(new XYChart.Data(24, 23));
//        seriesMay.getData().add(new XYChart.Data(27, 26));
//        seriesMay.getData().add(new XYChart.Data(31, 26));
//
//        scatterAreaChartDisbursedLoans.getData().addAll(seriesApril, seriesMay);
//
//        //Portifolio at risk StackedBarChart
//        XYChart.Series seriessbE = new XYChart.Series();
//        XYChart.Series seriessbE1 = new XYChart.Series();
//        XYChart.Series seriessbE2 = new XYChart.Series();
//        XYChart.Series seriessbE3 = new XYChart.Series();
//
//        seriessbE.getData().addAll(
//                new XYChart.Data("Jan", 2),
//                new XYChart.Data("Feb", 4),
//                new XYChart.Data("Mar", 6),
//                new XYChart.Data("Apr", 3),
//                new XYChart.Data("May", 10),
//                new XYChart.Data("Jun", 4),
//                new XYChart.Data("Jul", 15),
//                new XYChart.Data("Aug", 17),
//                new XYChart.Data("Sep", 19),
//                new XYChart.Data("Oct", 15),
//                new XYChart.Data("Nov", 22),
//                new XYChart.Data("Dec", 25)
//        );
//
//        seriessbE1.getData().addAll(
//                new XYChart.Data("Jan", 0),
//                new XYChart.Data("Feb", 40),
//                new XYChart.Data("Mar", 16),
//                new XYChart.Data("Apr", 31),
//                new XYChart.Data("May", 11),
//                new XYChart.Data("Jun", 14),
//                new XYChart.Data("Jul", 50),
//                new XYChart.Data("Aug", 17),
//                new XYChart.Data("Sep", 29),
//                new XYChart.Data("Oct", 45),
//                new XYChart.Data("Nov", 23),
//                new XYChart.Data("Dec", 35)
//        );
//
//        seriessbE2.getData().addAll(
//                new XYChart.Data("Jan", 2),
//                new XYChart.Data("Feb", 14),
//                new XYChart.Data("Mar", 26),
//                new XYChart.Data("Apr", 13),
//                new XYChart.Data("May", 21),
//                new XYChart.Data("Jun", 24),
//                new XYChart.Data("Jul", 50),
//                new XYChart.Data("Aug", 27),
//                new XYChart.Data("Sep", 29),
//                new XYChart.Data("Oct", 40),
//                new XYChart.Data("Nov", 23),
//                new XYChart.Data("Dec", 30)
//        );
//        seriessbE3.getData().addAll(
//                new XYChart.Data("Jan", 2),
//                new XYChart.Data("Feb", 20),
//                new XYChart.Data("Mar", 36),
//                new XYChart.Data("Apr", 11),
//                new XYChart.Data("May", 19),
//                new XYChart.Data("Jun", 12),
//                new XYChart.Data("Jul", 35),
//                new XYChart.Data("Aug", 27),
//                new XYChart.Data("Sep", 19),
//                new XYChart.Data("Oct", 25),
//                new XYChart.Data("Nov", 13),
//                new XYChart.Data("Dec", 45)
//        );
//        seriessbE.setName("2013");
//        seriessbE1.setName("2014");
//        seriessbE2.setName("2015");
//        seriessbE3.setName("2016");
//        stackedBarChartPAR.getData().addAll(seriessbE, seriessbE1, seriessbE2, seriessbE3);
//
//        //Outstanding Loans ScatterChart 
//        scatterOutstandingLoans.setData(getDummyChartData());
//        //Registered Clients AreaChart
//
//        XYChart.Series serie1 = new XYChart.Series();
//        series1.setName("March");
//        series1.getData().add(new XYChart.Data(0, -2));
//        series1.getData().add(new XYChart.Data(3, -4));
//        series1.getData().add(new XYChart.Data(6, 0));
//        series1.getData().add(new XYChart.Data(9, 5));
//
//        XYChart.Series serie2 = new XYChart.Series();
//        series2.setName("April");
//        series2.getData().add(new XYChart.Data(0, 4));
//        series2.getData().add(new XYChart.Data(3, 10));
//        series2.getData().add(new XYChart.Data(6, 15));
//        series2.getData().add(new XYChart.Data(9, 8));
//
//        XYChart.Series serie3 = new XYChart.Series();
//        series3.setName("May");
//        series3.getData().add(new XYChart.Data(0, 20));
//        series3.getData().add(new XYChart.Data(3, 15));
//        series3.getData().add(new XYChart.Data(6, 13));
//        series3.getData().add(new XYChart.Data(9, 12));
//        areaChartRegisteredClients.getData().addAll(serie1, serie2, serie3);

    }

    public ObservableList<XYChart.Series<String, Double>>
            getDummyChartData() {
        ObservableList<XYChart.Series<String, Double>> data
                = FXCollections.observableArrayList();
        Series<String, Double> as = new Series<>();
        Series<String, Double> bs = new Series<>();
        Series<String, Double> cs = new Series<>();
        Series<String, Double> ds = new Series<>();
        Series<String, Double> es = new Series<>();
        Series<String, Double> fs = new Series<>();
        as.setName("A-Series");
        bs.setName("B-Series");
        cs.setName("C-Series");
        ds.setName("D-Series");
        es.setName("E-Series");
        fs.setName("F-Series");

        Random r = new Random();

        for (int i = 1900; i < 2017; i += 10) {

            as.getData().add(new XYChart.Data<>(Integer.toString(i), r.nextDouble()));
            bs.getData().add(new XYChart.Data<>(Integer.toString(i), r.nextDouble()));
            cs.getData().add(new XYChart.Data<>(Integer.toString(i), r.nextDouble()));
            ds.getData().add(new XYChart.Data<>(Integer.toString(i), r.nextDouble()));
            es.getData().add(new XYChart.Data<>(Integer.toString(i), r.nextDouble()));
            fs.getData().add(new XYChart.Data<>(Integer.toString(i), r.nextDouble()));
        }
        data.addAll(as, bs, cs, ds, es, fs);

        //   scatterOutstandingLoans.setData(data);
        return data;
    }

    @FXML
    public void closeDreamfin() {
        System.exit(0);
    }

    @FXML
    public void logoutDreamfin(Event event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root, 300, 250);
        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("SIGN IN");
        stage.show();
    }

    @FXML
    public void loadClients() throws IOException {

        AnchorPane root = FXMLLoader.load(getClass().getResource("/dreamfin/solutions/module/clients/clients.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage();
        stage.setHeight(700);
        stage.setWidth(1250);
        stage.centerOnScreen();
        stage.setTitle("Clients");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setIconified(false);
        stage.show();
    }

    @FXML
    public void addGroups() throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/dreamfin/solutions/module/groups/groups.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage();
        stage.setScene(scene);
        //stage.setHeight(742);
        // stage.setWidth(1250);
        stage.setResizable(false);
        stage.setTitle("Groups");
        stage.centerOnScreen();
        stage.sizeToScene();
        stage.setIconified(false);
        stage.show();
    }

    @FXML
    public void addProducts() throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/dreamfin/solutions/module/products/products.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage();
        stage.setScene(scene);
        stage.sizeToScene();
        stage.setTitle("Products");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();

    }

    @FXML
    public void clientReports() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/dreamfin/solutions/module/reports/clientReports.fxml"));
        Scene scene = new Scene(pane);
        //scene.getStylesheets().add("");
        stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        //stage.sizeToScene();
        stage.setHeight(550);
        stage.setWidth(1075);
        stage.setResizable(false);
        stage.showAndWait();

    }

    @FXML
    public void groupReports() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/dreamfin/solutions/module/reports/groupReports.fxml"));
        Scene scene = new Scene(pane);
        stage = new Stage();
        stage.setScene(scene);
        stage.sizeToScene();
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.showAndWait();

    }

    @FXML
    public void contactUs() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/dreamfin/solutions/module/help/contactUs.fxml"));
        Scene scene = new Scene(pane);
        stage = new Stage();
        stage.setScene(scene);
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.showAndWait();

    }

    @FXML
    public void graphs() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/dreamfin/solutions/module/graphs/graphs.fxml"));
        Scene scene = new Scene(pane);
        stage = new Stage();
        stage.sizeToScene();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.showAndWait();

    }
}
