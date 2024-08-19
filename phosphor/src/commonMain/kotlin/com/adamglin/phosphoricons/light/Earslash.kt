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

public val LightGroup.Earslash: ImageVector
    get() {
        if (_earslash != null) {
            return _earslash!!
        }
        _earslash = Builder(name = "Earslash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(55.72f, 57.41f)
                arcTo(85.34f, 85.34f, 0.0f, false, false, 42.0f, 104.0f)
                curveToRelative(0.0f, 32.64f, 12.12f, 44.33f, 21.85f, 53.71f)
                curveTo(71.76f, 165.34f, 78.0f, 171.36f, 78.0f, 188.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, false, 50.0f, 50.0f)
                curveToRelative(14.34f, 0.0f, 26.66f, -6.12f, 36.63f, -18.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.26f, -7.64f)
                curveTo(147.69f, 221.48f, 138.74f, 226.0f, 128.0f, 226.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, -38.0f)
                curveToRelative(0.0f, -21.74f, -9.06f, -30.48f, -17.82f, -38.92f)
                curveTo(62.83f, 140.06f, 54.0f, 131.55f, 54.0f, 104.0f)
                arcTo(73.4f, 73.4f, 0.0f, false, true, 64.12f, 66.65f)
                lineTo(84.49f, 89.06f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 82.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(36.39f, 36.39f, 0.0f, false, true, 0.26f, -4.19f)
                lineToRelative(45.15f, 49.66f)
                arcTo(39.33f, 39.33f, 0.0f, false, false, 138.0f, 160.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 29.71f, 20.6f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(150.08f, 161.25f)
                lineTo(157.86f, 169.8f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 150.08f, 161.21f)
                close()
                moveTo(81.83f, 38.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.07f, -8.22f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 214.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcTo(74.0f, 74.0f, 0.0f, false, false, 90.06f, 40.45f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 81.83f, 38.38f)
                close()
                moveTo(158.66f, 117.25f)
                arcTo(27.9f, 27.9f, 0.0f, false, false, 162.0f, 104.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -45.0f, -32.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.89f, -11.35f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 174.0f, 104.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -4.68f, 18.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.66f, -5.51f)
                close()
            }
        }
        .build()
        return _earslash!!
    }

private var _earslash: ImageVector? = null
