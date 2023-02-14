package edu.learning.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollection implements IChannelCollection{

    List<Channel> channelsList;
    
    public ChannelCollection(){
        channelsList = new ArrayList();
    }
    
    @Override
    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public IChannelIterator getIterator(ChannelTypeEnum type) {
        return new ChannelIterator(type, this.channelsList);
    }
    
}
