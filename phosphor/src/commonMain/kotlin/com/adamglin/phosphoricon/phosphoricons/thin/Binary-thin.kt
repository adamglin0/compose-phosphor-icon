package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Binary-thin`: ImageVector
    get() {
        if (`_binary-thin` != null) {
            return `_binary-thin`!!
        }
        `_binary-thin` = Builder(name = "Binary-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 28.0f)
                curveToRelative(-10.92f, 0.0f, -19.93f, 5.0f, -26.08f, 14.31f)
                curveTo(62.81f, 50.09f, 60.0f, 60.64f, 60.0f, 72.0f)
                reflectiveCurveToRelative(2.81f, 21.91f, 7.92f, 29.7f)
                curveTo(74.07f, 111.05f, 83.08f, 116.0f, 94.0f, 116.0f)
                reflectiveCurveToRelative(19.93f, -5.0f, 26.08f, -14.3f)
                curveTo(125.19f, 93.91f, 128.0f, 83.37f, 128.0f, 72.0f)
                reflectiveCurveToRelative(-2.81f, -21.91f, -7.92f, -29.69f)
                curveTo(113.93f, 33.0f, 104.92f, 28.0f, 94.0f, 28.0f)
                close()
                moveTo(94.0f, 108.0f)
                curveToRelative(-18.0f, 0.0f, -26.0f, -18.08f, -26.0f, -36.0f)
                reflectiveCurveToRelative(8.0f, -36.0f, 26.0f, -36.0f)
                reflectiveCurveToRelative(26.0f, 18.08f, 26.0f, 36.0f)
                reflectiveCurveTo(112.0f, 108.0f, 94.0f, 108.0f)
                close()
                moveTo(192.08f, 154.31f)
                curveTo(185.93f, 145.0f, 176.92f, 140.0f, 166.0f, 140.0f)
                reflectiveCurveToRelative(-19.93f, 4.95f, -26.08f, 14.31f)
                curveTo(134.81f, 162.09f, 132.0f, 172.64f, 132.0f, 184.0f)
                reflectiveCurveToRelative(2.81f, 21.91f, 7.92f, 29.7f)
                curveToRelative(6.15f, 9.35f, 15.16f, 14.3f, 26.08f, 14.3f)
                reflectiveCurveToRelative(19.93f, -4.95f, 26.08f, -14.3f)
                curveToRelative(5.11f, -7.79f, 7.92f, -18.33f, 7.92f, -29.7f)
                reflectiveCurveTo(197.19f, 162.09f, 192.08f, 154.31f)
                close()
                moveTo(166.0f, 220.0f)
                curveToRelative(-18.0f, 0.0f, -26.0f, -18.08f, -26.0f, -36.0f)
                reflectiveCurveToRelative(8.0f, -36.0f, 26.0f, -36.0f)
                reflectiveCurveToRelative(26.0f, 18.08f, 26.0f, 36.0f)
                reflectiveCurveTo(184.0f, 220.0f, 166.0f, 220.0f)
                close()
                moveTo(148.5f, 47.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.56f, -5.44f)
                lineToRelative(24.0f, -13.34f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 32.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(172.0f, 38.8f)
                lineToRelative(-18.06f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.5f, 47.28f)
                close()
                moveTo(100.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(92.0f, 150.8f)
                lineToRelative(-18.06f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.88f, -7.0f)
                lineToRelative(24.0f, -13.34f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_binary-thin`!!
    }

private var `_binary-thin`: ImageVector? = null
