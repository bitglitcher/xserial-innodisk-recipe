SUMMARY = "Kernel module for the EMP2 Modules"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "file://xr17v35x.c \
           file://Makefile"

DEPENDS = "virtual/kernel"
inherit module

S = "${WORKDIR}"

RPROVIDES:${PN} = "kernel-module-xserial"
KERNEL_MODULE_AUTOLOAD += "kernel-module-xserial"