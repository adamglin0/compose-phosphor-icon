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

public val BoldGroup.Masksad: ImageVector
    get() {
        if (_masksad != null) {
            return _masksad!!
        }
        _masksad = Builder(name = "Masksad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.29f, 31.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -18.52f, -2.14f)
                curveTo(187.0f, 34.72f, 159.17f, 43.7f, 128.0f, 43.7f)
                reflectiveCurveToRelative(-59.0f, -9.0f, -72.77f, -14.34f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                verticalLineToRelative(55.77f)
                curveToRelative(0.0f, 36.64f, 9.9f, 71.25f, 27.88f, 97.45f)
                curveTo(74.81f, 228.81f, 100.42f, 244.0f, 128.0f, 244.0f)
                reflectiveCurveToRelative(53.19f, -15.19f, 72.12f, -42.76f)
                curveTo(218.1f, 175.0f, 228.0f, 140.43f, 228.0f, 103.79f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 219.29f, 31.5f)
                close()
                moveTo(204.0f, 103.79f)
                curveToRelative(0.0f, 31.84f, -8.41f, 61.63f, -23.67f, 83.87f)
                curveTo(166.0f, 208.51f, 147.43f, 220.0f, 128.0f, 220.0f)
                reflectiveCurveToRelative(-38.0f, -11.49f, -52.33f, -32.34f)
                curveTo(60.41f, 165.42f, 52.0f, 135.63f, 52.0f, 103.79f)
                verticalLineToRelative(-50.0f)
                curveToRelative(16.59f, 5.95f, 44.67f, 13.94f, 76.0f, 13.94f)
                reflectiveCurveToRelative(59.41f, -8.0f, 76.0f, -13.94f)
                close()
                moveTo(158.38f, 187.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.4f, 4.37f)
                arcToRelative(27.13f, 27.13f, 0.0f, false, false, -28.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -20.76f)
                arcToRelative(51.14f, 51.14f, 0.0f, false, true, 52.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 158.38f, 187.51f)
                close()
                moveTo(137.89f, 113.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.59f, -3.61f)
                arcToRelative(19.15f, 19.15f, 0.0f, false, false, 9.52f, 2.78f)
                arcToRelative(19.64f, 19.64f, 0.0f, false, false, 7.27f, -1.59f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 9.46f, 22.06f)
                arcToRelative(41.58f, 41.58f, 0.0f, false, true, -39.23f, -3.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 137.89f, 113.51f)
                close()
                moveTo(114.5f, 130.09f)
                arcToRelative(41.54f, 41.54f, 0.0f, false, true, -39.23f, 3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 9.46f, -22.0f)
                arcTo(19.64f, 19.64f, 0.0f, false, false, 92.0f, 112.68f)
                arcToRelative(19.22f, 19.22f, 0.0f, false, false, 9.54f, -2.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 13.0f, 20.19f)
                close()
            }
        }
        .build()
        return _masksad!!
    }

private var _masksad: ImageVector? = null
