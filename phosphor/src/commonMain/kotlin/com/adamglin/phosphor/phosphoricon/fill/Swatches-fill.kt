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

public val FillGroup.`Swatches-fill`: ImageVector
    get() {
        if (`_swatches-fill` != null) {
            return `_swatches-fill`!!
        }
        `_swatches-fill` = Builder(name = "Swatches-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 155.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.0f, -5.22f)
                lineTo(219.94f, 98.48f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 199.49f, 89.0f)
                lineToRelative(-67.81f, 24.57f)
                lineToRelative(12.08f, -69.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 130.84f, 26.0f)
                lineTo(76.17f, 16.25f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -18.47f, 13.0f)
                lineToRelative(-25.0f, 143.12f)
                arcTo(43.82f, 43.82f, 0.0f, false, false, 75.78f, 224.0f)
                lineTo(224.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                close()
                moveTo(76.0f, 196.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 196.0f)
                close()
                moveTo(118.72f, 187.62f)
                lineTo(128.5f, 131.7f)
                lineTo(204.92f, 104.0f)
                lineTo(224.0f, 156.11f)
                lineTo(116.78f, 195.0f)
                arcTo(44.89f, 44.89f, 0.0f, false, false, 118.72f, 187.62f)
                close()
                moveTo(224.0f, 208.0f)
                lineTo(127.74f, 208.0f)
                lineTo(224.0f, 173.11f)
                close()
            }
        }
        .build()
        return `_swatches-fill`!!
    }

private var `_swatches-fill`: ImageVector? = null
