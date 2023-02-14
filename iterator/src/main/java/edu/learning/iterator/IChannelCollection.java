package edu.learning.iterator;

public interface IChannelCollection {
    
    public void addChannel(Channel c);
    
    public void removeChannel(Channel c);
    
    public IChannelIterator getIterator(ChannelTypeEnum type);
    
}
