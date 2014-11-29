/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loanbrokerclient;

/**
 *
 * @author Kaboka
 */
public class LoanBrokerClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoanBrokerWS_Service service = new LoanBrokerWS_Service();
        LoanRequest request = new LoanRequest();
        request.loanAmount = 100.0;
        request.ssn = "2409892203";
        request.loanDuration = 360;
/*        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                request.ssn = 1;
                LoanResponse response = service.getLoanBrokerWSPort().getLoanRequest(request);
        
                System.out.println("BankName: " + response.bankName);
                System.out.println("interrestRate: " + response.interrestRate);
                System.out.println("SNN: " + response.ssn);
            }
        });*/
        
/*        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                LoanResponse response = service.getLoanBrokerWSPort().getLoanRequest(request);
        
                System.out.println("BankName: " + response.bankName);
                System.out.println("interrestRate: " + response.interrestRate);
                System.out.println("SNN: " + response.ssn);
            }
        });
        t2.start();*/
 
                LoanResponse response = service.getLoanBrokerWSPort().getLoanRequest(request);
        
                System.out.println("BankName: " + response.bankName);
                System.out.println("interrestRate: " + response.interrestRate);
                System.out.println("SNN: " + response.ssn);
    }
}
