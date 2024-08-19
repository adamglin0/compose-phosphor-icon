package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Contactless-payment-fill`: ImageVector
    get() {
        if (`_contactless-payment-fill` != null) {
            return `_contactless-payment-fill`!!
        }
        `_contactless-payment-fill` = Builder(name = "Contactless-payment-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(97.07f, 155.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.14f, -7.48f)
                arcToRelative(42.79f, 42.79f, 0.0f, false, false, 0.0f, -40.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.14f, -7.48f)
                arcTo(59.33f, 59.33f, 0.0f, false, true, 97.07f, 155.74f)
                close()
                moveTo(125.07f, 171.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.12f, -7.52f)
                arcToRelative(77.07f, 77.07f, 0.0f, false, false, 0.0f, -72.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.12f, -7.52f)
                arcTo(93.0f, 93.0f, 0.0f, false, true, 125.06f, 171.76f)
                close()
                moveTo(153.07f, 187.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 139.0f, 180.23f)
                arcToRelative(110.62f, 110.62f, 0.0f, false, false, 0.0f, -104.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.12f, -7.54f)
                arcTo(126.67f, 126.67f, 0.0f, false, true, 153.07f, 187.77f)
                close()
            }
        }
        .build()
        return `_contactless-payment-fill`!!
    }

private var `_contactless-payment-fill`: ImageVector? = null
