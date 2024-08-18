package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Disc-fill`: ImageVector
    get() {
        if (`_disc-fill` != null) {
            return `_disc-fill`!!
        }
        `_disc-fill` = Builder(name = "Disc-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.3f, 43.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.65f, -0.5f)
                curveToRelative(-0.23f, -0.16f, -0.47f, -0.31f, -0.71f, -0.45f)
                arcToRelative(103.85f, 103.85f, 0.0f, true, false, 1.36f, 1.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 152.0f)
                close()
                moveTo(216.0f, 128.0f)
                curveToRelative(0.0f, 2.47f, -0.11f, 4.92f, -0.31f, 7.34f)
                lineTo(168.0f, 126.92f)
                arcToRelative(39.83f, 39.83f, 0.0f, false, false, -11.0f, -26.41f)
                lineToRelative(27.78f, -39.67f)
                arcTo(87.8f, 87.8f, 0.0f, false, true, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_disc-fill`!!
    }

private var `_disc-fill`: ImageVector? = null
