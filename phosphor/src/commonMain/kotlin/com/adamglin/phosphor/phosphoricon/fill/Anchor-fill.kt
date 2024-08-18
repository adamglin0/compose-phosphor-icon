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

public val FillGroup.`Anchor-fill`: ImageVector
    get() {
        if (`_anchor-fill` != null) {
            return `_anchor-fill`!!
        }
        `_anchor-fill` = Builder(name = "Anchor-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 144.0f)
                curveToRelative(0.0f, 38.11f, -27.67f, 45.66f, -49.9f, 51.72f)
                curveTo(149.77f, 202.36f, 136.0f, 207.31f, 136.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                curveToRelative(0.0f, -24.69f, -13.77f, -29.64f, -38.1f, -36.28f)
                curveTo(59.67f, 189.66f, 32.0f, 182.11f, 32.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                curveToRelative(0.0f, 24.69f, 13.77f, 29.64f, 38.1f, 36.28f)
                curveToRelative(11.36f, 3.1f, 24.12f, 6.6f, 33.9f, 14.34f)
                verticalLineTo(128.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(82.83f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 16.0f, 0.0f)
                verticalLineTo(112.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(66.62f)
                curveToRelative(9.78f, -7.74f, 22.54f, -11.24f, 33.9f, -14.34f)
                curveTo(194.23f, 173.64f, 208.0f, 168.69f, 208.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_anchor-fill`!!
    }

private var `_anchor-fill`: ImageVector? = null
