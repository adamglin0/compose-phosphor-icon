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

public val LightGroup.`Boules-light`: ImageVector
    get() {
        if (`_boules-light` != null) {
            return `_boules-light`!!
        }
        `_boules-light` = Builder(name = "Boules-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(187.22f, 60.29f)
                lineTo(60.29f, 187.22f)
                arcToRelative(90.21f, 90.21f, 0.0f, false, true, -12.53f, -18.49f)
                lineToRelative(121.0f, -121.0f)
                arcTo(90.21f, 90.21f, 0.0f, false, true, 187.22f, 60.29f)
                close()
                moveTo(195.71f, 68.78f)
                arcToRelative(90.21f, 90.21f, 0.0f, false, true, 12.53f, 18.49f)
                lineToRelative(-121.0f, 121.0f)
                arcToRelative(90.21f, 90.21f, 0.0f, false, true, -18.49f, -12.53f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(89.67f, 89.67f, 0.0f, false, true, 28.79f, 4.72f)
                lineTo(42.72f, 156.79f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(89.67f, 89.67f, 0.0f, false, true, -28.79f, -4.72f)
                lineTo(213.28f, 99.21f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return `_boules-light`!!
    }

private var `_boules-light`: ImageVector? = null
