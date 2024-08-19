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

public val FillGroup.`Sliders-horizontal-fill`: ImageVector
    get() {
        if (`_sliders-horizontal-fill` != null) {
            return `_sliders-horizontal-fill`!!
        }
        `_sliders-horizontal-fill` = Builder(name = "Sliders-horizontal-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(77.17f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 53.66f, 0.0f)
                lineTo(216.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(130.83f, 88.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -53.66f, 0.0f)
                lineTo(40.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 80.0f)
                close()
                moveTo(216.0f, 168.0f)
                lineTo(194.83f, 168.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -53.66f, 0.0f)
                lineTo(40.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(141.17f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 53.66f, 0.0f)
                lineTo(216.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return `_sliders-horizontal-fill`!!
    }

private var `_sliders-horizontal-fill`: ImageVector? = null
