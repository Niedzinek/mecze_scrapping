package org.example.models.odds;

import org.example.models.odds.Choice;

import java.util.ArrayList;

public class Market {
        public int sourceId;
        public int structureType;
        public int marketId;
        public String marketName;
        public boolean isLive;
        public int fid;
        public boolean suspended;
        public int id;
        public ArrayList<Choice> choices;
        public String choiceGroup;

        public Market() {
        }

        public Market(int sourceId, int structureType, int marketId, String marketName, boolean isLive, int fid, boolean suspended, int id, ArrayList<Choice> choices, String choiceGroup) {
                this.sourceId = sourceId;
                this.structureType = structureType;
                this.marketId = marketId;
                this.marketName = marketName;
                this.isLive = isLive;
                this.fid = fid;
                this.suspended = suspended;
                this.id = id;
                this.choices = choices;
                this.choiceGroup = choiceGroup;
        }

        public int getSourceId() {
                return sourceId;
        }

        public void setSourceId(int sourceId) {
                this.sourceId = sourceId;
        }

        public int getStructureType() {
                return structureType;
        }

        public void setStructureType(int structureType) {
                this.structureType = structureType;
        }

        public int getMarketId() {
                return marketId;
        }

        public void setMarketId(int marketId) {
                this.marketId = marketId;
        }

        public String getMarketName() {
                return marketName;
        }

        public void setMarketName(String marketName) {
                this.marketName = marketName;
        }

        public boolean isLive() {
                return isLive;
        }

        public void setLive(boolean live) {
                isLive = live;
        }

        public int getFid() {
                return fid;
        }

        public void setFid(int fid) {
                this.fid = fid;
        }

        public boolean isSuspended() {
                return suspended;
        }

        public void setSuspended(boolean suspended) {
                this.suspended = suspended;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public ArrayList<Choice> getChoices() {
                return choices;
        }

        public void setChoices(ArrayList<Choice> choices) {
                this.choices = choices;
        }

        public String getChoiceGroup() {
                return choiceGroup;
        }

        public void setChoiceGroup(String choiceGroup) {
                this.choiceGroup = choiceGroup;
        }

        @Override
        public String toString() {
                return "Market{" +
                        "sourceId=" + sourceId +
                        ", structureType=" + structureType +
                        ", marketId=" + marketId +
                        ", marketName='" + marketName + '\'' +
                        ", isLive=" + isLive +
                        ", fid=" + fid +
                        ", suspended=" + suspended +
                        ", id=" + id +
                        ", choices=" + choices +
                        ", choiceGroup='" + choiceGroup + '\'' +
                        '}';
        }
}
