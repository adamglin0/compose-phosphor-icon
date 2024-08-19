package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Contactless-payment-bold`: ImageVector
    get() {
        if (`_contactless-payment-bold` != null) {
            return `_contactless-payment-bold`!!
        }
        `_contactless-payment-bold` = Builder(name = "Contactless-payment-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.58f, 66.35f)
                arcToRelative(130.61f, 130.61f, 0.0f, false, true, 0.0f, 123.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.17f, -11.3f)
                arcToRelative(106.7f, 106.7f, 0.0f, false, false, 0.0f, -100.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 21.16f, -11.3f)
                close()
                moveTo(100.36f, 77.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.0f, 16.23f)
                arcToRelative(73.0f, 73.0f, 0.0f, false, true, 0.0f, 68.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.18f, 11.28f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, false, 0.0f, -91.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.36f, 77.41f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -84.0f, 84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_contactless-payment-bold`!!
    }

private var `_contactless-payment-bold`: ImageVector? = null
