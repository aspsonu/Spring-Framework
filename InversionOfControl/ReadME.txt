Inversion of control :

Spring creates a bean for every class mentioned in the config file and stores them in the IOC container
Here, beans acts as objects and IOC container reads the config file

To use a particular class object we can just use getBean() method

Ex: getBean("a"); -> here a is bean which refers the object of the class a

There are 2 types of IOC Container

1. BeanFactory
2. ApplicationContext -> Advanced

The above two are interface's

As interface needs to be implemented and hence therefore
The implementation class for ApplicationContext is ClassPathXmlApplicationContext which is a class