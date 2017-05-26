@echo off
bitsadmin.exe /transfer "JobName" https://raw.githubusercontent.com/mosaadm/Android-Automated-Testing/master/chrome_extension.zip  C:\Users\Administrator\Desktop\chrome_extension.zip
cd "C:\Users\Administrator\Desktop\"
powershell.exe -nologo -noprofile -command "& { Add-Type -A 'System.IO.Compression.FileSystem'; [IO.Compression.ZipFile]::ExtractToDirectory('chrome_extension.zip', 'chrome'); }"
IF EXIST "C:\Program Files\Google\Chrome\Application\" GOTO USE_N
:USE_N 
cd "C:\Program Files\Google\Chrome\Application\"
IF EXIST "C:\Program Files (x86)\Google\Chrome\Application\" GOTO USE_86
:USE_86
cd "C:\Program Files (x86)\Google\Chrome\Application\"
chrome --load-extension=C:\Users\Administrator\Desktop\chrome\chrome_extension
 
