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

public val BoldGroup.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) {
            return _shippingContainer!!
        }
        _shippingContainer = Builder(name = "ShippingContainer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.5f, 66.8f)
                lineTo(131.3f, 36.46f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, false, -5.0f, -0.34f)
                lineToRelative(-105.13f, 15.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 4.0f, 70.94f)
                verticalLineTo(185.06f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 17.17f, 19.8f)
                lineToRelative(105.13f, 15.0f)
                arcToRelative(12.15f, 12.15f, 0.0f, false, false, 1.7f, 0.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.3f, -0.46f)
                lineTo(237.5f, 189.2f)
                arcTo(20.09f, 20.09f, 0.0f, false, false, 252.0f, 170.0f)
                verticalLineTo(86.0f)
                arcTo(20.08f, 20.08f, 0.0f, false, false, 237.5f, 66.8f)
                close()
                moveTo(92.0f, 116.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(66.41f)
                lineToRelative(32.0f, -4.57f)
                verticalLineTo(194.16f)
                lineToRelative(-32.0f, -4.57f)
                verticalLineTo(140.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(28.0f, 74.41f)
                lineToRelative(32.0f, -4.57f)
                verticalLineTo(116.0f)
                horizontalLineTo(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(46.16f)
                lineToRelative(-32.0f, -4.57f)
                close()
                moveTo(228.0f, 167.0f)
                lineToRelative(-88.0f, 25.14f)
                verticalLineTo(63.91f)
                lineToRelative(88.0f, 25.14f)
                close()
            }
        }
        .build()
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
