package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Smileyangry: ImageVector
    get() {
        if (_smileyangry != null) {
            return _smileyangry!!
        }
        _smileyangry = Builder(name = "Smileyangry", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 150.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 92.0f, 150.0f)
                close()
                moveTo(164.0f, 130.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 164.0f, 130.0f)
                close()
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 128.0f, 26.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 230.0f, 128.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, false, -90.0f, 90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, false, 218.0f, 128.0f)
                close()
                moveTo(172.67f, 83.0f)
                lineTo(128.0f, 112.79f)
                lineTo(83.33f, 83.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.66f, 10.0f)
                lineToRelative(48.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.66f, 0.0f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.66f, -10.0f)
                close()
                moveTo(155.32f, 179.0f)
                curveToRelative(-8.13f, -5.4f, -15.88f, -9.0f, -27.32f, -9.0f)
                reflectiveCurveToRelative(-19.19f, 3.6f, -27.32f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.64f, 10.0f)
                curveToRelative(6.67f, -4.43f, 12.19f, -7.0f, 20.68f, -7.0f)
                reflectiveCurveToRelative(14.0f, 2.57f, 20.68f, 7.0f)
                arcToRelative(5.94f, 5.94f, 0.0f, false, false, 3.31f, 1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.33f, -11.0f)
                close()
            }
        }
        .build()
        return _smileyangry!!
    }

private var _smileyangry: ImageVector? = null
