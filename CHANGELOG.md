# Changelog

## 2.0.3
* #6: Use the configured `unopkg` when multiple ones are in PATH
* #7: Deployment now without user confirmation

## 2.0.2
* Fix for Windows zip packaging problem (related to #5)
* Fix a problem with lock files not being cleaned

## 2.0 (released as 2.0.1)

* Support for LibreOffice 5.0 added. Older releases are no longer supported.
* Support for Eclipse Mars (4.5) added.
* Deployment: Install extensions without asking when in debug mode or using a separate user profile
* Runtime configuration now reads package contents from plugin.properties instead of having an own tab for this
* Renamed the extension and internal paths (OpenOffice -> LibreOffice)
* Hosting now by [The Document Foundation](http://www.documentfoundation.org/)
* Java 7 is the new baseline for the code (instead of Java 5)
* Various internal cleanups
* Fix #5: Invalid oxt files created on Windows

## Older versions

No changelog is available for older versions. You can [browse the commits](https://github.com/LibreOffice/loeclipse/commits/master) instead.