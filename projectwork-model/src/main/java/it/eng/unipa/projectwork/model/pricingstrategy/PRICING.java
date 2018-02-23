package it.eng.unipa.projectwork.model.pricingstrategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import it.eng.unipa.projectwork.model.Bid;

public enum PRICING {
	UPWARDS{
		@Override
		public boolean canAdd(Bid b, Bid newBid) {
			return newBid.getPrice().compareTo(b.getPrice())>0;
		}
		
		@Override
		public Bid currentBid(List<Bid> bids) {
			if(bids!=null && bids.size()>0)
				return bids.stream().max((a,b)->{return a.getPrice().compareTo(b.getPrice());}).get();
			else
				return null;
	
		}
		
	},DOWNWARDS{
		@Override
		public boolean canAdd(Bid b, Bid newBid) {
			return newBid.getPrice().compareTo(b.getPrice())>0;
		}
		
		@Override
		public Bid currentBid(List<Bid> bids) {
			if(bids!=null && bids.size()>0)
				return bids.stream().min((a,b)->{return a.getPrice().compareTo(b.getPrice());}).get();
			else
				return null;
		}
	};
	
	public abstract boolean canAdd(Bid b,Bid newBid);
	
	public abstract Bid currentBid(List<Bid> bid);
	
	public boolean canAdd(List<Bid> bids, Bid newBid) {
		for(Bid  bid: bids){
			if(!canAdd(bid, newBid)){
				return false;
			}
		}
		return true;
	}

}
