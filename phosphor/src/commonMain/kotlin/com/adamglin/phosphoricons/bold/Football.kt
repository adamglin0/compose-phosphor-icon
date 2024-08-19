package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.06f, 53.18f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, false, -30.24f, -30.24f)
                curveToRelative(-15.24f, -2.58f, -38.75f, -4.78f, -64.26f, -0.61f)
                curveTo(107.66f, 27.39f, 81.56f, 40.39f, 61.0f, 61.0f)
                reflectiveCurveToRelative(-33.59f, 46.68f, -38.65f, 77.58f)
                curveToRelative(-4.17f, 25.51f, -2.0f, 49.0f, 0.61f, 64.26f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, false, 30.24f, 30.24f)
                arcTo(209.43f, 209.43f, 0.0f, false, false, 87.9f, 236.0f)
                arcToRelative(184.13f, 184.13f, 0.0f, false, false, 29.54f, -2.33f)
                curveToRelative(30.9f, -5.06f, 57.0f, -18.06f, 77.58f, -38.65f)
                reflectiveCurveToRelative(33.59f, -46.68f, 38.65f, -77.58f)
                curveTo(237.84f, 91.93f, 235.64f, 68.42f, 233.06f, 53.18f)
                close()
                moveTo(209.4f, 57.18f)
                arcTo(192.0f, 192.0f, 0.0f, false, true, 212.0f, 83.06f)
                lineTo(172.93f, 44.0f)
                arcToRelative(190.57f, 190.57f, 0.0f, false, true, 25.88f, 2.64f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 209.4f, 57.19f)
                close()
                moveTo(46.6f, 198.81f)
                arcTo(191.79f, 191.79f, 0.0f, false, true, 44.0f, 172.94f)
                lineTo(83.06f, 212.0f)
                arcToRelative(191.79f, 191.79f, 0.0f, false, true, -25.87f, -2.63f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 46.6f, 198.81f)
                close()
                moveTo(178.05f, 178.05f)
                curveToRelative(-11.0f, 11.0f, -31.31f, 26.16f, -63.2f, 31.83f)
                lineTo(46.12f, 141.15f)
                curveTo(51.79f, 109.26f, 67.0f, 88.93f, 78.0f, 78.0f)
                reflectiveCurveToRelative(31.3f, -26.16f, 63.2f, -31.83f)
                lineToRelative(68.73f, 68.73f)
                curveTo(204.21f, 146.74f, 189.0f, 167.07f, 178.05f, 178.05f)
                close()
                moveTo(164.49f, 108.48f)
                lineTo(159.0f, 114.0f)
                lineToRelative(5.52f, 5.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(142.0f, 131.0f)
                lineToRelative(-11.0f, 11.0f)
                lineToRelative(5.52f, 5.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(114.0f, 159.0f)
                lineToRelative(-5.52f, 5.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(97.0f, 142.0f)
                lineToRelative(-5.52f, -5.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineTo(114.0f, 125.0f)
                lineToRelative(11.0f, -11.0f)
                lineToRelative(-5.52f, -5.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineTo(142.0f, 97.0f)
                lineToRelative(5.52f, -5.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
