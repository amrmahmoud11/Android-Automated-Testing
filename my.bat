bitsadmin.exe /transfer "JobName" https://raw.githubusercontent.com/mosaadm/Android-Automated-Testing/master/mutetab-0.0.2-fx.xpi  C:\Users\Administrator\Desktop\mutetab-0.0.2-fx.xpi
cd "C:\Program Files (x86)\Mozilla Firefox\"
firefox.exe -ProfileManager -install-global-extension "C:\Users\Administrator\Desktop\mutetab-0.0.2-fx.xpi"
