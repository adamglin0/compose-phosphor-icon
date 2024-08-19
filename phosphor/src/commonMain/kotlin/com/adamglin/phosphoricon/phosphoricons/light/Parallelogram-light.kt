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

public val LightGroup.`Parallelogram-light`: ImageVector
    get() {
        if (`_parallelogram-light` != null) {
            return `_parallelogram-light`!!
        }
        `_parallelogram-light` = Builder(name = "Parallelogram-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.75f, 48.4f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 42.0f)
                lineTo(88.81f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 76.0f, 50.25f)
                lineToRelative(-64.8f, 144.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 24.0f, 214.0f)
                lineTo(167.19f, 214.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 180.0f, 205.75f)
                lineToRelative(64.8f, -144.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 243.75f, 48.4f)
                close()
                moveTo(233.82f, 56.82f)
                lineTo(169.02f, 200.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.83f, 1.18f)
                lineTo(24.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.83f, -2.82f)
                lineTo(87.0f, 55.18f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 88.81f, 54.0f)
                lineTo(232.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.83f, 2.82f)
                close()
            }
        }
        .build()
        return `_parallelogram-light`!!
    }

private var `_parallelogram-light`: ImageVector? = null
