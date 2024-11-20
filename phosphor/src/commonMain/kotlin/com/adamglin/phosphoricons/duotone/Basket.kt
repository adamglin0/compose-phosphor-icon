package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 88.0f)
                lineTo(216.93f, 201.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 209.0f, 208.0f)
                horizontalLineTo(47.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.93f, -6.94f)
                lineTo(24.0f, 88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(172.84f, 119.2f)
                lineTo(167.24f, 175.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 174.4f, 184.0f)
                arcToRelative(7.32f, 7.32f, 0.0f, false, false, 0.81f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.95f, -7.2f)
                lineToRelative(5.6f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.92f, -1.6f)
                close()
                moveTo(83.16f, 119.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.92f, 1.6f)
                lineToRelative(5.6f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 7.2f)
                arcToRelative(7.32f, 7.32f, 0.0f, false, false, 0.81f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, -8.76f)
                close()
                moveTo(239.93f, 89.06f)
                lineTo(224.86f, 202.12f)
                arcTo(16.06f, 16.06f, 0.0f, false, true, 209.0f, 216.0f)
                lineTo(47.0f, 216.0f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, true, -15.86f, -13.88f)
                lineTo(16.07f, 89.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 80.0f)
                lineTo(68.37f, 80.0f)
                lineTo(122.0f, 18.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(187.63f, 80.0f)
                lineTo(232.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.93f, 9.06f)
                close()
                moveTo(89.63f, 80.0f)
                horizontalLineToRelative(76.74f)
                lineTo(128.0f, 36.15f)
                close()
                moveTo(222.86f, 96.0f)
                lineTo(33.14f, 96.0f)
                lineTo(47.0f, 200.0f)
                lineTo(209.0f, 200.0f)
                close()
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
