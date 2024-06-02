package org.example.models.odds;

import java.util.ArrayList;

public class Root {
        public ArrayList<Market> markets;
        public int eventId;

        public Root() {
        }

        public Root(ArrayList<Market> markets, int eventId) {
                this.markets = markets;
                this.eventId = eventId;
        }

        public ArrayList<Market> getMarkets() {
                return markets;
        }

        public void setMarkets(ArrayList<Market> markets) {
                this.markets = markets;
        }

        public int getEventId() {
                return eventId;
        }

        public void setEventId(int eventId) {
                this.eventId = eventId;
        }

        @Override
        public String toString() {
                return "Root{" +
                        "markets=" + markets +
                        ", eventId=" + eventId +
                        '}';
        }
}
