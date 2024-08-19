package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.59f, 36.94f)
                arcToRelative(11.83f, 11.83f, 0.0f, false, false, -13.08f, 2.61f)
                lineToRelative(-0.19f, 0.2f)
                lineTo(187.77f, 62.24f)
                arcToRelative(107.1f, 107.1f, 0.0f, false, false, -119.54f, 0.0f)
                lineTo(48.68f, 39.75f)
                lineToRelative(-0.19f, -0.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 48.0f)
                verticalLineToRelative(88.0f)
                curveToRelative(0.0f, 50.72f, 44.86f, 92.0f, 100.0f, 92.0f)
                reflectiveCurveToRelative(100.0f, -41.27f, 100.0f, -92.0f)
                lineTo(228.0f, 48.0f)
                arcTo(11.82f, 11.82f, 0.0f, false, false, 220.59f, 36.94f)
                close()
                moveTo(220.0f, 136.0f)
                curveToRelative(0.0f, 45.09f, -39.12f, 82.0f, -88.0f, 83.91f)
                lineTo(132.0f, 193.66f)
                lineToRelative(14.83f, -14.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.65f)
                lineTo(128.0f, 186.35f)
                lineToRelative(-13.17f, -13.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, 5.65f)
                lineTo(124.0f, 193.66f)
                verticalLineToRelative(26.26f)
                curveTo(75.12f, 218.0f, 36.0f, 181.1f, 36.0f, 136.0f)
                lineTo(36.0f, 48.0f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 2.47f, -3.7f)
                arcToRelative(4.39f, 4.39f, 0.0f, false, true, 1.6f, -0.31f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, 2.67f, 1.1f)
                lineTo(64.58f, 70.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.4f, 0.59f)
                arcTo(94.0f, 94.0f, 0.0f, false, true, 92.0f, 58.74f)
                lineTo(92.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(100.0f, 56.0f)
                arcToRelative(100.07f, 100.07f, 0.0f, false, true, 24.0f, -3.93f)
                lineTo(124.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 52.09f)
                arcTo(100.07f, 100.07f, 0.0f, false, true, 156.0f, 56.0f)
                lineTo(156.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(164.0f, 58.74f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, 22.0f, 12.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.4f, -0.59f)
                lineToRelative(21.84f, -25.11f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 48.0f)
                close()
                moveTo(92.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 140.0f)
                close()
                moveTo(180.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 180.0f, 140.0f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
