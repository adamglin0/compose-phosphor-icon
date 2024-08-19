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

public val ThinGroup.`Hand-grabbing-thin`: ImageVector
    get() {
        if (`_hand-grabbing-thin` != null) {
            return `_hand-grabbing-thin`!!
        }
        `_hand-grabbing-thin` = Builder(name = "Hand-grabbing-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 84.0f)
                arcToRelative(23.87f, 23.87f, 0.0f, false, false, -16.07f, 6.2f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 128.0f, 78.75f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 84.0f, 92.0f)
                verticalLineToRelative(24.0f)
                lineTo(68.0f, 116.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                lineTo(212.0f, 108.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 188.0f, 84.0f)
                close()
                moveTo(204.0f, 152.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, -152.0f, 0.0f)
                lineTo(52.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(84.0f, 124.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(92.0f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(172.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_hand-grabbing-thin`!!
    }

private var `_hand-grabbing-thin`: ImageVector? = null
