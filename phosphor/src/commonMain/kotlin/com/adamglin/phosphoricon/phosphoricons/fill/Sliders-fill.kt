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

public val FillGroup.`Sliders-fill`: ImageVector
    get() {
        if (`_sliders-fill` != null) {
            return `_sliders-fill`!!
        }
        `_sliders-fill` = Builder(name = "Sliders-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 136.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -20.0f, 26.83f)
                lineTo(64.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(48.0f, 162.83f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -53.66f)
                lineTo(48.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(69.17f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 84.0f, 136.0f)
                close()
                moveTo(136.0f, 61.17f)
                lineTo(136.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 61.17f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 53.66f)
                lineTo(120.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 114.83f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -53.66f)
                close()
                moveTo(208.0f, 141.17f)
                lineTo(208.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(192.0f, 141.17f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 53.66f)
                lineTo(192.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 194.83f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -53.66f)
                close()
            }
        }
        .build()
        return `_sliders-fill`!!
    }

private var `_sliders-fill`: ImageVector? = null
