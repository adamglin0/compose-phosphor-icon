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

public val ThinGroup.`Moon-stars-thin`: ImageVector
    get() {
        if (`_moon-stars-thin` != null) {
            return `_moon-stars-thin`!!
        }
        `_moon-stars-thin` = Builder(name = "Moon-stars-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(212.0f, 100.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 100.0f)
                lineTo(184.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(204.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(212.0f, 92.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 96.0f)
                close()
                moveTo(144.0f, 52.0f)
                horizontalLineToRelative(12.0f)
                lineTo(156.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(164.0f, 52.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(164.0f, 44.0f)
                lineTo(164.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(156.0f, 44.0f)
                lineTo(144.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(213.73f, 155.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.71f, 4.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, -118.0f, -118.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.29f, 4.54f)
                arcTo(93.18f, 93.18f, 0.0f, false, false, 100.0f, 64.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, 92.0f)
                arcToRelative(93.18f, 93.18f, 0.0f, false, false, 17.91f, -1.74f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 213.73f, 155.58f)
                close()
                moveTo(204.27f, 163.25f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 92.75f, 51.73f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 204.27f, 163.25f)
                close()
            }
        }
        .build()
        return `_moon-stars-thin`!!
    }

private var `_moon-stars-thin`: ImageVector? = null
