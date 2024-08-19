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

public val LightGroup.`Lightning-light`: ImageVector
    get() {
        if (`_lightning-light` != null) {
            return `_lightning-light`!!
        }
        `_lightning-light` = Builder(name = "Lightning-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.84f, 118.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.73f, -4.25f)
                lineTo(150.88f, 92.17f)
                lineToRelative(15.0f, -75.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.27f, -5.27f)
                lineToRelative(-112.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.28f, 9.71f)
                lineToRelative(59.23f, 22.21f)
                lineToRelative(-15.0f, 75.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.14f, 6.52f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 96.0f, 246.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.39f, -1.91f)
                lineToRelative(112.0f, -120.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 213.84f, 118.63f)
                close()
                moveTo(106.0f, 220.46f)
                lineToRelative(11.85f, -59.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.77f, -6.8f)
                lineToRelative(-55.6f, -20.85f)
                lineToRelative(91.46f, -98.0f)
                lineTo(138.12f, 94.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.77f, 6.8f)
                lineToRelative(55.6f, 20.85f)
                close()
            }
        }
        .build()
        return `_lightning-light`!!
    }

private var `_lightning-light`: ImageVector? = null
