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

public val ThinGroup.`Cooking-pot-thin`: ImageVector
    get() {
        if (`_cooking-pot-thin` != null) {
            return `_cooking-pot-thin`!!
        }
        `_cooking-pot-thin` = Builder(name = "Cooking-pot-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 48.0f)
                lineTo(92.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(100.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(128.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(132.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 52.0f)
                close()
                moveTo(160.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(164.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(156.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 52.0f)
                close()
                moveTo(250.4f, 99.2f)
                lineTo(220.0f, 122.0f)
                verticalLineToRelative(62.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(64.0f, 212.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(36.0f, 122.0f)
                lineTo(5.6f, 99.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.8f, -6.4f)
                lineTo(36.0f, 112.0f)
                lineTo(36.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                lineToRelative(25.6f, -19.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.8f, 6.4f)
                close()
                moveTo(212.0f, 84.0f)
                lineTo(44.0f, 84.0f)
                lineTo(44.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(192.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return `_cooking-pot-thin`!!
    }

private var `_cooking-pot-thin`: ImageVector? = null
