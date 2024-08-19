package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Standarddefinition: ImageVector
    get() {
        if (_standarddefinition != null) {
            return _standarddefinition!!
        }
        _standarddefinition = Builder(name = "Standarddefinition", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(152.0f, 96.0f)
                horizontalLineToRelative(8.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 192.0f, 128.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(120.0f, 148.0f)
                curveToRelative(0.0f, -19.88f, -19.92f, -25.35f, -34.47f, -29.34f)
                curveToRelative(-12.06f, -3.31f, -20.0f, -5.84f, -20.0f, -10.66f)
                curveToRelative(0.0f, -6.73f, 8.1f, -12.0f, 18.44f, -12.0f)
                curveToRelative(8.0f, 0.0f, 14.85f, 3.13f, 17.42f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.13f, -7.51f)
                curveTo(110.16f, 86.31f, 98.07f, 80.0f, 84.0f, 80.0f)
                curveToRelative(-19.64f, 0.0f, -34.44f, 12.0f, -34.44f, 28.0f)
                curveToRelative(0.0f, 17.38f, 17.6f, 22.21f, 31.74f, 26.09f)
                curveToRelative(16.0f, 4.39f, 22.7f, 7.3f, 22.7f, 13.91f)
                curveToRelative(0.0f, 5.68f, -8.21f, 12.0f, -20.0f, 12.0f)
                reflectiveCurveToRelative(-20.0f, -6.32f, -20.0f, -12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                curveToRelative(0.0f, 15.7f, 15.81f, 28.0f, 36.0f, 28.0f)
                reflectiveCurveTo(120.0f, 163.7f, 120.0f, 148.0f)
                close()
                moveTo(208.0f, 128.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, -48.0f)
                lineTo(144.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 208.0f, 128.0f)
                close()
            }
        }
        .build()
        return _standarddefinition!!
    }

private var _standarddefinition: ImageVector? = null
