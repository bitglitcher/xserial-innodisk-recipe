SRC             ?= $(shell pwd)
CFILES          := xr17v35x.c 
obj-m 			+= xserial.o
TARGET          := xserial.ko
xrpci-objs 		:= xserial.o

USE_PORT_NUM	:= 4

xserial-y := $(CFILES:.c=.o)
ccflags-y       := -D_USE_PORT_NUM=$(USE_PORT_NUM)

.PHONY: modules modules_install modules_clean

all: modules

install: modules_install

clean:
	rm -f *.o *~ core .depend .*.cmd *.ko *.mod.c
	rm -f Module.markers Module.symvers modules.order
	rm -rf .tmp_versions Modules.symvers

modules:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules
modules_install: modules
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules_install
modules_clean:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) clean
