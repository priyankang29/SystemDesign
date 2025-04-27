package ObserverPattern.Observer;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;

public class main {
    public static void main(String[] args){
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("gadagi",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        System.out.println("Stock count is : " + iphoneStockObservable.getStockCount());

        iphoneStockObservable.setStockCount(10);
        System.out.println("Stock count is updated : " + iphoneStockObservable.getStockCount());

        iphoneStockObservable.setStockCount(100);
        System.out.println("Stock count is updated : " + iphoneStockObservable.getStockCount());

    }
}
