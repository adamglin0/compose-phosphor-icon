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

public val FillGroup.`Spade-fill`: ImageVector
    get() {
        if (`_spade-fill` != null) {
            return `_spade-fill`!!
        }
        `_spade-fill` = Builder(name = "Spade-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 136.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -83.4f, 48.82f)
                lineToRelative(11.06f, 36.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 232.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.66f, -10.3f)
                lineToRelative(11.06f, -36.88f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 24.0f, 136.0f)
                curveToRelative(0.0f, -32.0f, 17.65f, -62.84f, 51.0f, -89.27f)
                arcToRelative(234.14f, 234.14f, 0.0f, false, true, 49.89f, -30.11f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, true, 6.16f, 0.0f)
                arcTo(234.14f, 234.14f, 0.0f, false, true, 181.0f, 46.73f)
                curveTo(214.35f, 73.16f, 232.0f, 104.0f, 232.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_spade-fill`!!
    }

private var `_spade-fill`: ImageVector? = null
