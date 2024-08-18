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

public val FillGroup.`Shopping-cart-simple-fill`: ImageVector
    get() {
        if (`_shopping-cart-simple-fill` != null) {
            return `_shopping-cart-simple-fill`!!
        }
        `_shopping-cart-simple-fill` = Builder(name = "Shopping-cart-simple-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.71f, 74.14f)
                lineToRelative(-25.64f, 92.28f)
                arcTo(24.06f, 24.06f, 0.0f, false, true, 191.0f, 184.0f)
                lineTo(92.16f, 184.0f)
                arcTo(24.06f, 24.06f, 0.0f, false, true, 69.0f, 166.42f)
                lineTo(33.92f, 40.0f)
                lineTo(16.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(40.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.71f, 5.86f)
                lineTo(57.19f, 64.0f)
                lineTo(232.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.71f, 10.14f)
                close()
                moveTo(88.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 200.0f)
                close()
                moveTo(192.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_shopping-cart-simple-fill`!!
    }

private var `_shopping-cart-simple-fill`: ImageVector? = null
