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

public val ThinGroup.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) {
            return _shippingContainer!!
        }
        _shippingContainer = Builder(name = "ShippingContainer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.3f, 74.5f)
                lineTo(129.1f, 44.15f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, false, -1.67f, -0.11f)
                lineTo(22.3f, 59.06f)
                arcTo(12.06f, 12.06f, 0.0f, false, false, 12.0f, 70.94f)
                verticalLineTo(185.06f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, 10.3f, 11.88f)
                lineToRelative(105.13f, 15.0f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, false, 0.57f, 0.0f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, false, 1.1f, -0.15f)
                lineTo(235.3f, 181.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 170.0f)
                verticalLineTo(86.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 235.3f, 74.5f)
                close()
                moveTo(96.0f, 124.0f)
                horizontalLineTo(76.0f)
                verticalLineTo(59.47f)
                lineToRelative(48.0f, -6.86f)
                verticalLineTo(203.39f)
                lineToRelative(-48.0f, -6.86f)
                verticalLineTo(132.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(20.0f, 185.06f)
                verticalLineTo(70.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.43f, -4.0f)
                lineTo(68.0f, 60.61f)
                verticalLineTo(124.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(68.0f)
                verticalLineToRelative(63.39f)
                lineTo(23.43f, 189.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 185.06f)
                close()
                moveTo(236.0f, 170.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, 3.84f)
                lineTo(132.0f, 202.7f)
                verticalLineTo(53.3f)
                lineTo(233.1f, 82.19f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 86.0f)
                close()
            }
        }
        .build()
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
