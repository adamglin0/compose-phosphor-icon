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

public val ThinGroup.`Drop-thin`: ImageVector
    get() {
        if (`_drop-thin` != null) {
            return `_drop-thin`!!
        }
        `_drop-thin` = Builder(name = "Drop-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.0f, 50.38f)
                arcToRelative(250.0f, 250.0f, 0.0f, false, false, -40.73f, -37.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.58f, 0.0f)
                arcTo(250.0f, 250.0f, 0.0f, false, false, 85.0f, 50.38f)
                curveTo(58.17f, 81.21f, 44.0f, 113.58f, 44.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 113.58f, 197.83f, 81.21f, 171.0f, 50.38f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f)
                curveToRelative(0.0f, -35.9f, 21.15f, -67.8f, 38.9f, -88.24f)
                arcTo(255.0f, 255.0f, 0.0f, false, true, 128.0f, 21.0f)
                arcToRelative(255.0f, 255.0f, 0.0f, false, true, 37.1f, 34.8f)
                curveTo(182.85f, 76.2f, 204.0f, 108.1f, 204.0f, 144.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(179.94f, 152.67f)
                arcToRelative(53.51f, 53.51f, 0.0f, false, true, -43.28f, 43.27f)
                arcToRelative(3.68f, 3.68f, 0.0f, false, true, -0.66f, 0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.66f, -7.94f)
                curveToRelative(18.18f, -3.06f, 33.63f, -18.51f, 36.72f, -36.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.88f, 1.34f)
                close()
            }
        }
        .build()
        return `_drop-thin`!!
    }

private var `_drop-thin`: ImageVector? = null
