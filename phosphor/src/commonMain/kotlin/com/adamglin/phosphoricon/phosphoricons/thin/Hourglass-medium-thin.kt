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

public val ThinGroup.`Hourglass-medium-thin`: ImageVector
    get() {
        if (`_hourglass-medium-thin` != null) {
            return `_hourglass-medium-thin`!!
        }
        `_hourglass-medium-thin` = Builder(name = "Hourglass-medium-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 75.64f)
                lineTo(196.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(72.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 40.0f)
                lineTo(60.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.8f, 9.6f)
                lineTo(121.33f, 128.0f)
                lineTo(64.8f, 170.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(184.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(196.0f, 180.36f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, -4.76f, -9.57f)
                lineTo(134.63f, 128.0f)
                lineToRelative(56.61f, -42.79f)
                arcTo(12.05f, 12.05f, 0.0f, false, false, 196.0f, 75.64f)
                close()
                moveTo(128.0f, 123.0f)
                lineTo(86.67f, 92.0f)
                lineTo(169.0f, 92.0f)
                close()
                moveTo(188.0f, 180.37f)
                lineTo(188.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(72.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(68.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.6f, -3.2f)
                lineTo(124.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 136.0f)
                lineToRelative(54.41f, 41.13f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 188.0f, 180.36f)
                close()
                moveTo(188.0f, 75.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.59f, 3.19f)
                lineTo(179.58f, 84.0f)
                lineTo(76.0f, 84.0f)
                lineToRelative(-6.4f, -4.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 68.0f, 76.0f)
                lineTo(68.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(184.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_hourglass-medium-thin`!!
    }

private var `_hourglass-medium-thin`: ImageVector? = null
