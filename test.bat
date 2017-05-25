@echo off

bitsadmin.exe /transfer "JobName" https://raw.githubusercontent.com/mosaadm/Android-Automated-Testing/master/cv_7.zip  C:\Users\Administrator\Desktop\test.zip

powershell.exe -nologo -noprofile -command "& { Add-Type -A 'System.IO.Compression.FileSystem'; [IO.Compression.ZipFile]::ExtractToDirectory('C:\Users\Administrator\Desktop\test.zip', 'C:\Users\Administrator\Desktop\'); }"

