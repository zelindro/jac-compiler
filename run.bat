@echo off

python compiler.py %1 Test.j
IF %ERRORLEVEL% EQU 0 ( 
  goto jasmin
) ELSE ( 
  goto error
)

:jasmin
java -jar jasmin-2.4.jar Test.j
IF %ERRORLEVEL% EQU 0 ( 
  goto test
) ELSE ( 
  goto error
)

:test
java -cp . Test
IF %ERRORLEVEL% EQU 0 ( 
  goto success
) ELSE ( 
  goto error
)

:success
echo.
@echo Run ok
echo.

:error
echo.
echo ERRORLEVEL: %ERRORLEVEL%

