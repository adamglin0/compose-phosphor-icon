package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Shipping-container-light`: ImageVector
    get() {
        if (`_shipping-container-light` != null) {
            return `_shipping-container-light`!!
        }
        `_shipping-container-light` = Builder(name = "Shipping-container-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.85f, 72.57f)
                lineTo(129.65f, 42.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.5f, -0.17f)
                lineTo(22.0f, 57.08f)
                arcTo(14.07f, 14.07f, 0.0f, false, false, 10.0f, 70.94f)
                verticalLineTo(185.06f)
                arcToRelative(14.07f, 14.07f, 0.0f, false, false, 12.0f, 13.86f)
                lineToRelative(105.13f, 15.0f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, false, 0.85f, 0.06f)
                arcToRelative(6.14f, 6.14f, 0.0f, false, false, 1.65f, -0.23f)
                lineToRelative(106.2f, -30.34f)
                arcTo(14.06f, 14.06f, 0.0f, false, false, 246.0f, 170.0f)
                verticalLineTo(86.0f)
                arcTo(14.06f, 14.06f, 0.0f, false, false, 235.85f, 72.57f)
                close()
                moveTo(96.0f, 122.0f)
                horizontalLineTo(78.0f)
                verticalLineTo(61.2f)
                lineToRelative(44.0f, -6.28f)
                verticalLineTo(201.08f)
                lineTo(78.0f, 194.8f)
                verticalLineTo(134.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(22.0f, 185.06f)
                verticalLineTo(70.94f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.72f, -2.0f)
                lineToRelative(42.28f, -6.0f)
                verticalLineTo(122.0f)
                horizontalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(66.0f)
                verticalLineToRelative(59.08f)
                lineToRelative(-42.28f, -6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 185.06f)
                close()
                moveTo(234.0f, 170.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.45f, 1.92f)
                lineTo(134.0f, 200.05f)
                verticalLineTo(56.0f)
                lineToRelative(98.55f, 28.16f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 234.0f, 86.0f)
                close()
            }
        }
        .build()
        return `_shipping-container-light`!!
    }

private var `_shipping-container-light`: ImageVector? = null
