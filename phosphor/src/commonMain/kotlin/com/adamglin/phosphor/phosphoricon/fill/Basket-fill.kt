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

public val FillGroup.`Basket-fill`: ImageVector
    get() {
        if (`_basket-fill` != null) {
            return `_basket-fill`!!
        }
        `_basket-fill` = Builder(name = "Basket-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 82.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 80.0f)
                lineTo(187.63f, 80.0f)
                lineTo(134.0f, 18.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(68.37f, 80.0f)
                lineTo(24.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.93f, 9.06f)
                lineTo(31.14f, 202.12f)
                arcTo(16.06f, 16.06f, 0.0f, false, false, 47.0f, 216.0f)
                lineTo(209.0f, 216.0f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, false, 15.86f, -13.88f)
                lineTo(239.93f, 89.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 238.0f, 82.73f)
                close()
                moveTo(81.6f, 184.0f)
                arcToRelative(7.32f, 7.32f, 0.0f, false, true, -0.81f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -7.2f)
                lineToRelative(-5.6f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.92f, -1.6f)
                lineToRelative(5.6f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 81.6f, 184.0f)
                close()
                moveTo(136.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(89.63f, 80.0f)
                lineTo(128.0f, 36.15f)
                lineTo(166.37f, 80.0f)
                close()
                moveTo(188.76f, 120.8f)
                lineTo(183.16f, 176.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.95f, 7.2f)
                arcToRelative(7.32f, 7.32f, 0.0f, false, true, -0.81f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, -8.76f)
                lineToRelative(5.6f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.92f, 1.6f)
                close()
            }
        }
        .build()
        return `_basket-fill`!!
    }

private var `_basket-fill`: ImageVector? = null
