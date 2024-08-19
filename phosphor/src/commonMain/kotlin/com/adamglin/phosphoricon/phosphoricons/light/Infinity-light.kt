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

public val LightGroup.`Infinity-light`: ImageVector
    get() {
        if (`_infinity-light` != null) {
            return `_infinity-light`!!
        }
        `_infinity-light` = Builder(name = "Infinity-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 128.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, -92.18f, 38.18f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, true, -0.25f, -0.26f)
                lineToRelative(-60.0f, -67.74f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 0.0f, 59.64f)
                lineToRelative(8.57f, -9.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 9.0f, 8.0f)
                lineToRelative(-8.69f, 9.81f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, true, -0.25f, 0.26f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 0.0f, -76.36f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, true, 0.25f, 0.26f)
                lineToRelative(60.0f, 67.74f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 0.0f, -59.64f)
                lineToRelative(-8.57f, 9.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.0f, -8.0f)
                lineToRelative(8.69f, -9.81f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, true, 0.25f, -0.26f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 246.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_infinity-light`!!
    }

private var `_infinity-light`: ImageVector? = null
