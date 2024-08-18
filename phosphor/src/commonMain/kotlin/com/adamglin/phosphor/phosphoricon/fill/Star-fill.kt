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

public val FillGroup.`Star-fill`: ImageVector
    get() {
        if (`_star-fill` != null) {
            return `_star-fill`!!
        }
        `_star-fill` = Builder(name = "Star-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.29f, 114.85f)
                lineToRelative(-45.0f, 38.83f)
                lineTo(203.0f, 211.75f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, -24.5f, 17.82f)
                lineTo(128.0f, 198.49f)
                lineTo(77.47f, 229.57f)
                arcTo(16.4f, 16.4f, 0.0f, false, true, 53.0f, 211.75f)
                lineToRelative(13.76f, -58.07f)
                lineToRelative(-45.0f, -38.83f)
                arcTo(16.46f, 16.46f, 0.0f, false, true, 31.08f, 86.0f)
                lineToRelative(59.0f, -4.76f)
                lineToRelative(22.76f, -55.08f)
                arcToRelative(16.36f, 16.36f, 0.0f, false, true, 30.27f, 0.0f)
                lineToRelative(22.75f, 55.08f)
                lineToRelative(59.0f, 4.76f)
                arcToRelative(16.46f, 16.46f, 0.0f, false, true, 9.37f, 28.86f)
                close()
            }
        }
        .build()
        return `_star-fill`!!
    }

private var `_star-fill`: ImageVector? = null
