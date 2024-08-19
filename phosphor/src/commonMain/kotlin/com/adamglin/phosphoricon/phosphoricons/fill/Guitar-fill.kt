package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Guitar-fill`: ImageVector
    get() {
        if (`_guitar-fill` != null) {
            return `_guitar-fill`!!
        }
        `_guitar-fill` = Builder(name = "Guitar-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.66f, 46.34f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(200.69f, 20.0f)
                lineTo(140.52f, 80.16f)
                curveTo(117.73f, 68.3f, 92.21f, 69.29f, 76.75f, 84.74f)
                arcToRelative(42.27f, 42.27f, 0.0f, false, false, -9.39f, 14.37f)
                arcTo(8.24f, 8.24f, 0.0f, false, true, 59.81f, 104.0f)
                curveToRelative(-14.59f, 0.49f, -27.26f, 5.72f, -36.65f, 15.11f)
                curveTo(11.08f, 131.22f, 6.0f, 148.6f, 8.74f, 168.07f)
                curveTo(11.4f, 186.7f, 21.07f, 205.15f, 36.0f, 220.0f)
                reflectiveCurveToRelative(33.34f, 24.56f, 52.0f, 27.22f)
                arcTo(71.13f, 71.13f, 0.0f, false, false, 98.1f, 248.0f)
                curveToRelative(15.32f, 0.0f, 28.83f, -5.23f, 38.76f, -15.16f)
                curveToRelative(9.39f, -9.39f, 14.62f, -22.06f, 15.11f, -36.65f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, true, 4.92f, -7.55f)
                arcToRelative(42.22f, 42.22f, 0.0f, false, false, 14.37f, -9.39f)
                curveToRelative(15.45f, -15.46f, 16.44f, -41.0f, 4.58f, -63.77f)
                lineTo(236.0f, 55.31f)
                lineToRelative(2.34f, 2.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(93.66f, 205.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.31f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 93.66f, 205.65f)
                close()
                moveTo(135.8f, 159.79f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 0.0f, -39.59f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 135.8f, 159.79f)
                close()
                moveTo(166.86f, 101.79f)
                arcToRelative(86.94f, 86.94f, 0.0f, false, false, -6.0f, -6.68f)
                arcToRelative(85.23f, 85.23f, 0.0f, false, false, -6.69f, -6.0f)
                lineTo(176.0f, 67.31f)
                lineTo(188.69f, 80.0f)
                close()
                moveTo(200.0f, 68.68f)
                lineTo(187.32f, 56.0f)
                lineTo(212.0f, 31.31f)
                lineTo(224.69f, 44.0f)
                close()
            }
        }
        .build()
        return `_guitar-fill`!!
    }

private var `_guitar-fill`: ImageVector? = null
