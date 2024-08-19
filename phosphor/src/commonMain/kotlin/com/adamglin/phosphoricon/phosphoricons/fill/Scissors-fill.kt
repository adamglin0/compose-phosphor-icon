package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Scissors-fill`: ImageVector
    get() {
        if (`_scissors-fill` != null) {
            return `_scissors-fill`!!
        }
        `_scissors-fill` = Builder(name = "Scissors-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.52f, 187.09f)
                lineToRelative(-143.0f, -97.87f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -14.38f, 17.27f)
                lineToRelative(21.39f, 21.69f)
                lineTo(79.15f, 149.54f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(35.91f, 35.91f, 0.0f, true, false, 14.38f, 17.27f)
                lineToRelative(26.91f, -18.41f)
                lineTo(170.0f, 198.64f)
                arcToRelative(32.26f, 32.26f, 0.0f, false, false, 22.7f, 9.37f)
                arcToRelative(31.52f, 31.52f, 0.0f, false, false, 4.11f, -0.27f)
                lineToRelative(0.28f, 0.0f)
                lineToRelative(36.27f, -6.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.19f, -14.5f)
                close()
                moveTo(74.14f, 90.09f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 80.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 74.14f, 90.13f)
                close()
                moveTo(74.14f, 194.09f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 80.0f, 180.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 74.14f, 194.15f)
                close()
                moveTo(135.14f, 92.59f)
                lineTo(169.94f, 57.4f)
                arcToRelative(32.19f, 32.19f, 0.0f, false, true, 26.84f, -9.14f)
                lineToRelative(0.28f, 0.0f)
                lineToRelative(36.0f, 6.07f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, true, 6.09f, 4.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.67f, 10.12f)
                lineToRelative(-69.93f, 47.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.51f, 0.0f)
                lineToRelative(-26.31f, -18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 135.18f, 92.65f)
                close()
            }
        }
        .build()
        return `_scissors-fill`!!
    }

private var `_scissors-fill`: ImageVector? = null
