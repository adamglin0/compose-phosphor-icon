package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) {
            return _metaLogo!!
        }
        _metaLogo = Builder(name = "MetaLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(201.23f, 170.26f)
                curveToRelative(-5.63f, 9.0f, -14.33f, 13.74f, -25.16f, 13.74f)
                curveToRelative(-20.73f, 0.0f, -34.81f, -25.31f, -49.72f, -52.11f)
                curveTo(115.47f, 112.33f, 101.93f, 88.0f, 90.61f, 88.0f)
                curveTo(78.18f, 88.0f, 64.0f, 116.88f, 64.0f, 142.21f)
                curveToRelative(0.0f, 8.26f, 1.5f, 15.0f, 4.34f, 19.56f)
                curveTo(71.0f, 166.0f, 74.68f, 168.0f, 79.93f, 168.0f)
                curveToRelative(6.08f, 0.0f, 13.52f, -7.0f, 22.74f, -21.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.49f, 8.59f)
                curveTo(99.84f, 180.71f, 88.22f, 184.0f, 79.93f, 184.0f)
                curveToRelative(-10.83f, 0.0f, -19.53f, -4.75f, -25.16f, -13.74f)
                curveToRelative(-4.43f, -7.08f, -6.77f, -16.78f, -6.77f, -28.0f)
                arcTo(103.13f, 103.13f, 0.0f, false, true, 59.0f, 97.06f)
                curveTo(67.34f, 80.9f, 78.57f, 72.0f, 90.61f, 72.0f)
                curveToRelative(20.73f, 0.0f, 34.81f, 25.31f, 49.72f, 52.11f)
                curveTo(151.21f, 143.66f, 164.75f, 168.0f, 176.07f, 168.0f)
                curveToRelative(5.25f, 0.0f, 8.93f, -2.0f, 11.59f, -6.23f)
                curveToRelative(2.84f, -4.53f, 4.34f, -11.3f, 4.34f, -19.56f)
                curveTo(192.0f, 116.88f, 177.82f, 88.0f, 165.39f, 88.0f)
                curveToRelative(-3.4f, 0.0f, -7.35f, 2.31f, -11.74f, 6.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.54f, -11.09f)
                curveTo(149.74f, 75.86f, 157.35f, 72.0f, 165.39f, 72.0f)
                curveToRelative(12.0f, 0.0f, 23.27f, 8.9f, 31.62f, 25.06f)
                arcToRelative(103.13f, 103.13f, 0.0f, false, true, 11.0f, 45.15f)
                curveTo(208.0f, 153.48f, 205.66f, 163.18f, 201.23f, 170.26f)
                close()
            }
        }
        .build()
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
