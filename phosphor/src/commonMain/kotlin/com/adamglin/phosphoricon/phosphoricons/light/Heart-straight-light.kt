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

public val LightGroup.`Heart-straight-light`: ImageVector
    get() {
        if (`_heart-straight-light` != null) {
            return `_heart-straight-light`!!
        }
        `_heart-straight-light` = Builder(name = "Heart-straight-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.6f, 58.38f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -79.12f, -0.08f)
                lineTo(128.0f, 71.78f)
                lineTo(113.52f, 58.3f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -79.15f, 79.25f)
                lineToRelative(89.36f, 90.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.54f, 0.0f)
                lineToRelative(89.33f, -90.62f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, -79.21f)
                close()
                moveTo(213.08f, 129.13f)
                lineTo(128.0f, 215.45f)
                lineTo(42.89f, 129.1f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.22f, -62.23f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, 0.16f, 0.14f)
                lineToRelative(18.64f, 17.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.18f, 0.0f)
                lineTo(150.73f, 67.0f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, 0.16f, -0.14f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 62.19f, 62.26f)
                close()
            }
        }
        .build()
        return `_heart-straight-light`!!
    }

private var `_heart-straight-light`: ImageVector? = null
