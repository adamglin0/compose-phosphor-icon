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

public val LightGroup.`Check-fat-light`: ImageVector
    get() {
        if (`_check-fat-light` != null) {
            return `_check-fat-light`!!
        }
        `_check-fat-light` = Builder(name = "Check-fat-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.87f, 69.66f)
                lineToRelative(-24.0f, -23.56f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.77f, 0.0f)
                lineTo(104.0f, 139.0f)
                lineTo(65.9f, 102.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.79f)
                lineToRelative(71.62f, 72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineTo(241.91f, 89.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 241.87f, 69.66f)
                close()
                moveTo(233.42f, 81.0f)
                lineTo(105.0f, 209.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.81f, 0.0f)
                lineToRelative(-71.62f, -72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.82f)
                lineToRelative(24.0f, -24.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 56.0f, 110.0f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, true, 1.5f, 0.64f)
                lineToRelative(42.35f, 41.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.39f, 0.0f)
                lineToRelative(98.37f, -97.11f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.87f, 0.0f)
                lineToRelative(24.0f, 23.56f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 233.42f, 81.0f)
                close()
            }
        }
        .build()
        return `_check-fat-light`!!
    }

private var `_check-fat-light`: ImageVector? = null
