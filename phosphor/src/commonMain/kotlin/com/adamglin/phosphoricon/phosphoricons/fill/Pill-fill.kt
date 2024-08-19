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

public val FillGroup.`Pill-fill`: ImageVector
    get() {
        if (`_pill-fill` != null) {
            return `_pill-fill`!!
        }
        `_pill-fill` = Builder(name = "Pill-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.43f, 39.6f)
                arcToRelative(53.27f, 53.27f, 0.0f, false, false, -75.33f, 0.0f)
                lineTo(39.6f, 141.09f)
                arcToRelative(53.26f, 53.26f, 0.0f, false, false, 75.32f, 75.31f)
                lineTo(216.43f, 114.91f)
                arcTo(53.32f, 53.32f, 0.0f, false, false, 216.43f, 39.6f)
                close()
                moveTo(205.11f, 103.6f)
                lineTo(154.36f, 154.34f)
                lineTo(101.67f, 101.66f)
                lineTo(152.42f, 50.91f)
                arcToRelative(37.26f, 37.26f, 0.0f, false, true, 52.69f, 52.69f)
                close()
                moveTo(189.68f, 82.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.32f)
                lineToRelative(24.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 189.68f, 82.34f)
                close()
            }
        }
        .build()
        return `_pill-fill`!!
    }

private var `_pill-fill`: ImageVector? = null
