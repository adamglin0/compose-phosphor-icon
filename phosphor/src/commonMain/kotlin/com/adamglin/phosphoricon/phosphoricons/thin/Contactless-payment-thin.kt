package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Contactless-payment-thin`: ImageVector
    get() {
        if (`_contactless-payment-thin` != null) {
            return `_contactless-payment-thin`!!
        }
        `_contactless-payment-thin` = Builder(name = "Contactless-payment-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.54f, 102.13f)
                arcToRelative(55.39f, 55.39f, 0.0f, false, true, 0.0f, 51.74f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 90.0f, 156.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -1.87f, -0.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.67f, -5.41f)
                arcToRelative(46.73f, 46.73f, 0.0f, false, false, 0.0f, -44.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.08f, -3.74f)
                close()
                moveTo(144.12f, 68.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.65f, 5.41f)
                arcToRelative(114.67f, 114.67f, 0.0f, false, true, 0.0f, 108.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.06f, 3.76f)
                arcToRelative(122.65f, 122.65f, 0.0f, false, false, 0.0f, -115.76f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 144.12f, 68.47f)
                close()
                moveTo(116.12f, 84.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.65f, 5.41f)
                arcToRelative(81.0f, 81.0f, 0.0f, false, true, 0.0f, 76.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.06f, 3.76f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, false, 0.0f, -83.76f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 116.12f, 84.47f)
                close()
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, -92.0f, 92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 220.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_contactless-payment-thin`!!
    }

private var `_contactless-payment-thin`: ImageVector? = null
