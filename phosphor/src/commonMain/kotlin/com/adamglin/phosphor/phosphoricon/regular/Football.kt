package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.06f, 53.89f)
                arcToRelative(32.92f, 32.92f, 0.0f, false, false, -26.95f, -26.95f)
                curveToRelative(-32.37f, -5.49f, -93.39f, -8.0f, -138.27f, 36.9f)
                reflectiveCurveToRelative(-42.39f, 105.9f, -36.9f, 138.27f)
                arcToRelative(32.92f, 32.92f, 0.0f, false, false, 27.0f, 26.95f)
                arcTo(206.58f, 206.58f, 0.0f, false, false, 88.27f, 232.0f)
                curveToRelative(32.09f, 0.0f, 72.05f, -8.0f, 103.89f, -39.84f)
                curveTo(237.05f, 147.28f, 234.55f, 86.26f, 229.06f, 53.89f)
                close()
                moveTo(167.45f, 39.89f)
                arcToRelative(192.0f, 192.0f, 0.0f, false, true, 32.0f, 2.8f)
                arcTo(16.94f, 16.94f, 0.0f, false, true, 213.3f, 56.56f)
                arcTo(188.59f, 188.59f, 0.0f, false, true, 216.0f, 92.78f)
                lineTo(163.21f, 40.0f)
                curveTo(164.61f, 39.92f, 166.0f, 39.9f, 167.45f, 39.9f)
                close()
                moveTo(56.56f, 213.3f)
                arcTo(16.94f, 16.94f, 0.0f, false, true, 42.7f, 199.44f)
                arcTo(188.59f, 188.59f, 0.0f, false, true, 40.0f, 163.22f)
                lineTo(92.78f, 216.0f)
                arcTo(187.79f, 187.79f, 0.0f, false, true, 56.56f, 213.3f)
                close()
                moveTo(180.86f, 180.86f)
                curveToRelative(-11.61f, 11.6f, -33.27f, 27.73f, -67.37f, 33.27f)
                lineTo(41.87f, 142.51f)
                curveToRelative(5.54f, -34.1f, 21.67f, -55.76f, 33.27f, -67.37f)
                reflectiveCurveTo(108.4f, 47.4f, 142.5f, 41.86f)
                lineToRelative(71.63f, 71.63f)
                curveTo(208.59f, 147.59f, 192.46f, 169.25f, 180.86f, 180.86f)
                close()
                moveTo(165.64f, 90.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f)
                lineTo(151.3f, 116.0f)
                lineToRelative(6.34f, 6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, 11.3f)
                lineTo(140.0f, 127.31f)
                lineTo(127.31f, 140.0f)
                lineToRelative(6.34f, 6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.3f, 11.31f)
                lineTo(116.0f, 151.3f)
                lineToRelative(-14.34f, 14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.31f)
                lineTo(104.7f, 140.0f)
                lineToRelative(-6.34f, -6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.3f)
                lineToRelative(6.34f, 6.34f)
                lineTo(128.69f, 116.0f)
                lineToRelative(-6.34f, -6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.31f)
                lineTo(140.0f, 104.7f)
                lineToRelative(14.34f, -14.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 165.64f, 90.36f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
