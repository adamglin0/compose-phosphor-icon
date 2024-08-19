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

public val ThinGroup.`Orange-thin`: ImageVector
    get() {
        if (`_orange-thin` != null) {
            return `_orange-thin`!!
        }
        `_orange-thin` = Builder(name = "Orange-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.62f, 72.69f)
                arcTo(60.09f, 60.09f, 0.0f, false, false, 196.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(60.09f, 60.09f, 0.0f, false, false, -56.0f, 38.5f)
                arcTo(60.09f, 60.09f, 0.0f, false, false, 72.0f, 12.0f)
                lineTo(64.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, 51.84f, 48.11f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, 31.78f, 4.58f)
                close()
                moveTo(184.0f, 20.0f)
                horizontalLineToRelative(3.85f)
                arcTo(52.07f, 52.07f, 0.0f, false, true, 136.0f, 68.0f)
                horizontalLineToRelative(-3.85f)
                arcTo(52.07f, 52.07f, 0.0f, false, true, 184.0f, 20.0f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, -76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 228.0f)
                close()
                moveTo(179.94f, 160.66f)
                arcTo(53.45f, 53.45f, 0.0f, false, true, 136.66f, 204.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.66f, 0.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.66f, -7.95f)
                arcToRelative(45.33f, 45.33f, 0.0f, false, false, 36.72f, -36.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.88f, 1.32f)
                close()
            }
        }
        .build()
        return `_orange-thin`!!
    }

private var `_orange-thin`: ImageVector? = null
