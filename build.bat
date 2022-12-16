@echo off
java -jar antlr-4.9.3-complete.jar -Dlanguage=Python3 -no-listener Jac.g4

IF %ERRORLEVEL% EQU 0 (
  goto success
) ELSE ( 
  goto error
)

:success
echo.
@echo Build ok
echo.

:error
echo.
echo ERRORLEVEL: %ERRORLEVEL%

