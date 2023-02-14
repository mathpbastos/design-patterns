package edu.learning.iterator;

import java.util.List;

public class ChannelIterator implements IChannelIterator{

    private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position;
    
    public ChannelIterator(ChannelTypeEnum type, List<Channel> channels){
        this.channels = channels;
        this.type = type;
    }

    @Override
    public boolean hasNext() {
        while(this.position < this.channels.size()){
            Channel c = this.channels.get(position);
            if(c.getTYPE().equals(this.type) || 
                    this.type.equals(ChannelTypeEnum.ALL)){
                return true;
            }
            else {
                this.position++;
            }
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel c = channels.get(position);
        position++;
        return c;
    }
    
    
}
