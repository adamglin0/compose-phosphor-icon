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

public val BoldGroup.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) {
            return _maskHappy!!
        }
        _maskHappy = Builder(name = "MaskHappy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(165.33f, 166.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.79f, 16.87f)
                arcToRelative(56.92f, 56.92f, 0.0f, false, true, -71.08f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.08f, -18.67f)
                arcToRelative(32.92f, 32.92f, 0.0f, false, false, 40.92f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 165.33f, 166.67f)
                close()
                moveTo(137.89f, 131.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.61f, -16.58f)
                arcToRelative(41.66f, 41.66f, 0.0f, false, true, 39.23f, -3.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -9.46f, 22.06f)
                arcTo(19.53f, 19.53f, 0.0f, false, false, 164.0f, 132.0f)
                arcToRelative(19.14f, 19.14f, 0.0f, false, false, -9.52f, 2.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.59f, -3.61f)
                close()
                moveTo(92.0f, 132.0f)
                arcToRelative(19.44f, 19.44f, 0.0f, false, false, -7.27f, 1.59f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.46f, -22.06f)
                arcToRelative(41.61f, 41.61f, 0.0f, false, true, 39.23f, 3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -13.0f, 20.19f)
                arcTo(19.21f, 19.21f, 0.0f, false, false, 92.0f, 132.0f)
                close()
            }
        }
        .build()
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
