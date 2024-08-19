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

public val RegularGroup.Shippingcontainer: ImageVector
    get() {
        if (_shippingcontainer != null) {
            return _shippingcontainer!!
        }
        _shippingcontainer = Builder(name = "Shippingcontainer", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.4f, 70.65f)
                lineTo(130.2f, 40.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.33f, -0.23f)
                lineTo(21.74f, 55.1f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 8.0f, 70.94f)
                verticalLineTo(185.06f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 21.74f, 200.9f)
                lineToRelative(105.13f, 15.0f)
                arcTo(8.47f, 8.47f, 0.0f, false, false, 128.0f, 216.0f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, false, 2.2f, -0.31f)
                lineToRelative(106.2f, -30.34f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 248.0f, 170.0f)
                verticalLineTo(86.0f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 236.4f, 70.65f)
                close()
                moveTo(96.0f, 120.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(62.94f)
                lineToRelative(40.0f, -5.72f)
                verticalLineTo(198.78f)
                lineToRelative(-40.0f, -5.72f)
                verticalLineTo(136.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(24.0f, 70.94f)
                lineToRelative(40.0f, -5.72f)
                verticalLineTo(120.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(54.78f)
                lineToRelative(-40.0f, -5.72f)
                close()
                moveTo(136.0f, 197.39f)
                verticalLineTo(58.61f)
                lineTo(232.0f, 86.0f)
                verticalLineTo(170.0f)
                close()
            }
        }
        .build()
        return _shippingcontainer!!
    }

private var _shippingcontainer: ImageVector? = null
