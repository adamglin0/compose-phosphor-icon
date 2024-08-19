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

public val LightGroup.`Disc-light`: ImageVector
    get() {
        if (`_disc-light` != null) {
            return `_disc-light`!!
        }
        `_disc-light` = Builder(name = "Disc-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(165.52f, 122.0f)
                arcToRelative(37.79f, 37.79f, 0.0f, false, false, -6.76f, -16.27f)
                lineToRelative(37.0f, -36.95f)
                arcTo(89.61f, 89.61f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(154.0f, 128.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 154.0f, 128.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcTo(90.0f, 90.0f, 0.0f, true, true, 187.22f, 60.29f)
                lineTo(150.27f, 97.24f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 165.52f, 134.0f)
                lineTo(217.8f, 134.0f)
                arcTo(90.12f, 90.12f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return `_disc-light`!!
    }

private var `_disc-light`: ImageVector? = null
