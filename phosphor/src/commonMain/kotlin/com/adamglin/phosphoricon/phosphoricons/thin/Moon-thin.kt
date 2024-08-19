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

public val ThinGroup.`Moon-thin`: ImageVector
    get() {
        if (`_moon-thin` != null) {
            return `_moon-thin`!!
        }
        `_moon-thin` = Builder(name = "Moon-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.72f, 145.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -1.0f)
                arcTo(92.08f, 92.08f, 0.0f, false, true, 111.94f, 29.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, -5.0f)
                arcTo(100.78f, 100.78f, 0.0f, false, false, 56.08f, 59.88f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 140.0f, 140.0f)
                arcToRelative(100.78f, 100.78f, 0.0f, false, false, 35.59f, -50.87f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 230.72f, 145.06f)
                close()
                moveTo(191.3f, 193.53f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 62.47f, 64.7f)
                arcToRelative(93.0f, 93.0f, 0.0f, false, true, 39.88f, -30.35f)
                arcToRelative(100.09f, 100.09f, 0.0f, false, false, 119.3f, 119.3f)
                arcTo(93.0f, 93.0f, 0.0f, false, true, 191.3f, 193.53f)
                close()
            }
        }
        .build()
        return `_moon-thin`!!
    }

private var `_moon-thin`: ImageVector? = null
