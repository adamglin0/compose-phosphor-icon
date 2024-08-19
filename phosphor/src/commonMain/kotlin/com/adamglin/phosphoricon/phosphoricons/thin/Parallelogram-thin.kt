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

public val ThinGroup.`Parallelogram-thin`: ImageVector
    get() {
        if (`_parallelogram-thin` != null) {
            return `_parallelogram-thin`!!
        }
        `_parallelogram-thin` = Builder(name = "Parallelogram-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.07f, 49.48f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 44.0f)
                lineTo(88.81f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.0f, 7.08f)
                lineToRelative(-64.8f, 144.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 212.0f)
                lineTo(167.19f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.95f, -7.08f)
                lineToRelative(64.8f, -144.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 242.07f, 49.48f)
                close()
                moveTo(235.64f, 57.64f)
                lineTo(170.84f, 201.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.65f, 2.36f)
                lineTo(24.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.65f, -5.64f)
                lineToRelative(64.8f, -144.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 88.81f, 52.0f)
                lineTo(232.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.65f, 5.64f)
                close()
            }
        }
        .build()
        return `_parallelogram-thin`!!
    }

private var `_parallelogram-thin`: ImageVector? = null
