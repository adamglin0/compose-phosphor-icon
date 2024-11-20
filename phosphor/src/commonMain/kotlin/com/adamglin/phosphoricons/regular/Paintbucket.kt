package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.53f, 139.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.13f, -13.24f)
                lineTo(122.17f, 10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 0.0f)
                lineTo(70.25f, 51.0f)
                lineTo(45.65f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.34f, 37.66f)
                lineToRelative(24.6f, 24.6f)
                lineTo(15.0f, 106.17f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 33.94f)
                lineTo(99.89f, 225.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.94f, 0.0f)
                lineToRelative(78.49f, -78.49f)
                close()
                moveTo(202.34f, 133.83f)
                lineTo(122.51f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineTo(26.34f, 128.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineTo(70.25f, 73.57f)
                lineToRelative(29.12f, 29.12f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 11.31f, -11.32f)
                lineTo(81.57f, 62.26f)
                lineToRelative(35.0f, -34.95f)
                lineTo(217.19f, 128.0f)
                lineToRelative(-11.72f, 3.9f)
                arcTo(8.09f, 8.09f, 0.0f, false, false, 202.34f, 133.83f)
                close()
                moveTo(115.51f, 107.52f)
                lineTo(115.51f, 107.52f)
                arcToRelative(13.26f, 13.26f, 0.0f, true, true, -0.05f, 0.06f)
                reflectiveCurveTo(115.51f, 107.53f, 115.51f, 107.52f)
                close()
                moveTo(238.66f, 163.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.32f, 0.0f)
                curveTo(223.57f, 166.23f, 208.0f, 190.09f, 208.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                curveTo(256.0f, 190.09f, 240.43f, 166.23f, 238.66f, 163.56f)
                close()
                moveTo(232.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                curveToRelative(0.0f, -6.8f, 4.0f, -16.32f, 8.0f, -24.08f)
                curveToRelative(4.0f, 7.76f, 8.0f, 17.34f, 8.0f, 24.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 216.0f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
