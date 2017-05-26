@echo off
bitsadmin.exe /transfer "JobName" https://raw.githubusercontent.com/mosaadm/Android-Automated-Testing/master/chrome_extension.zip  C:\Users\Administrator\Desktop\chrome_extension.zip
cd "C:\Users\Administrator\Desktop\"
powershell.exe -nologo -noprofile -command "& { Add-Type -A 'System.IO.Compression.FileSystem'; [IO.Compression.ZipFile]::ExtractToDirectory('chrome_extension.zip', 'chrome'); }"
cd "C:\Program Files\Google\Chrome\Application\"
cd "C:\Program Files (x86)\Google\Chrome\Application\"
chrome --load-extension=C:\Users\Administrator\Desktop\chrome\chrome_extension
 
