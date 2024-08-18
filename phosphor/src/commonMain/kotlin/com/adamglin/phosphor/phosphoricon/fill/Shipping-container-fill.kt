package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Shipping-container-fill`: ImageVector
    get() {
        if (`_shipping-container-fill` != null) {
            return `_shipping-container-fill`!!
        }
        `_shipping-container-fill` = Builder(name = "Shipping-container-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.4f, 70.65f)
                lineTo(130.2f, 40.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.33f, -0.23f)
                lineTo(21.74f, 55.1f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 8.0f, 70.94f)
                lineTo(8.0f, 185.06f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 21.74f, 200.9f)
                lineToRelative(105.13f, 15.0f)
                arcTo(8.47f, 8.47f, 0.0f, false, false, 128.0f, 216.0f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, false, 2.2f, -0.31f)
                lineToRelative(106.2f, -30.34f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 248.0f, 170.0f)
                lineTo(248.0f, 86.0f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 236.4f, 70.65f)
                close()
                moveTo(64.0f, 120.0f)
                lineTo(48.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(64.0f, 136.0f)
                verticalLineToRelative(54.78f)
                lineToRelative(-40.0f, -5.72f)
                lineTo(24.0f, 70.94f)
                lineToRelative(40.0f, -5.72f)
                close()
                moveTo(120.0f, 198.78f)
                lineTo(80.0f, 193.06f)
                lineTo(80.0f, 136.0f)
                lineTo(96.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(80.0f, 120.0f)
                lineTo(80.0f, 62.94f)
                lineToRelative(40.0f, -5.72f)
                close()
            }
        }
        .build()
        return `_shipping-container-fill`!!
    }

private var `_shipping-container-fill`: ImageVector? = null
