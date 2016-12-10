SUMMARY = "hard Disk Idle Spin-Down Utility"
LICENSE = "GPL"

LIC_FILES_CHKSUM = "file://README;md5=3a63ac53d9a7fd4666f0248b19693215"

inherit gitpkgv

PKGV = "1.0+git${GITPKGV}"
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"
PR = "r0"

SRC_URI = "git://github.com/Dima73/hd-idle.git"

S = "${WORKDIR}/git"

do_compile() {
	oe_runmake
}

do_install() {
	install -d ${D}${bindir}
	install unjffs2 ${D}${bindir}/
}
