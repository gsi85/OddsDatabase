package oddsdatabase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OddsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String cardsInHand;
    private String status;
    private long winCount;
    private long splitCount;
    private long totalDealCount;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(final String cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public long getWinCount() {
        return winCount;
    }

    public void setWinCount(final long winCount) {
        this.winCount = winCount;
    }

    public long getSplitCount() {
        return splitCount;
    }

    public void setSplitCount(final long splitCount) {
        this.splitCount = splitCount;
    }

    public long getTotalDealCount() {
        return totalDealCount;
    }

    public void setTotalDealCount(final long totalDealCount) {
        this.totalDealCount = totalDealCount;
    }
}
