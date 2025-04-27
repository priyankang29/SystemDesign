package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }
    @Override
     public void notifySubscribers(){
        for (NotificationAlertObserver observer : observerList){
            observer.update();
        }
     }

     @Override
     public void setStockCount(int newStockAdded){
//         System.out.println("setStockCount called : " +newStockAdded);
        if(stockCount !=0){
            notifySubscribers();
        }
        stockCount+=newStockAdded;
     }

     @Override
     public int getStockCount(){
        return stockCount;
     }
}
