all: hd-idle

OBJECTS = hd-idle.o

hd-idle: $(OBJECTS)
	$(CXX) $(OBJECTS) -o hd-idle

#hd-idle.o: hd-idle.c

clean:
	rm -f *.o hd-idle


