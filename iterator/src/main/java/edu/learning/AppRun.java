package edu.learning;

import edu.learning.iterator.Channel;
import edu.learning.iterator.ChannelCollection;
import edu.learning.iterator.ChannelTypeEnum;
import edu.learning.iterator.IChannelCollection;
import edu.learning.iterator.IChannelIterator;

public class AppRun {

    public static void main(String[] args) {
        IChannelCollection channels = populateChannels();
        IChannelIterator baseIterator = channels.getIterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        // Channel Type Iterator
        IChannelIterator englishIterator = channels.getIterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
    }

    private static IChannelCollection populateChannels() {
        IChannelCollection channels = new ChannelCollection();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }
}
