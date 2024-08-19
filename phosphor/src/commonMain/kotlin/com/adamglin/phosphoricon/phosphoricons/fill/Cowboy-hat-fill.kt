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

public val FillGroup.`Cowboy-hat-fill`: ImageVector
    get() {
        if (`_cowboy-hat-fill` != null) {
            return `_cowboy-hat-fill`!!
        }
        `_cowboy-hat-fill` = Builder(name = "Cowboy-hat-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.78f, 3.76f)
                arcTo(179.9f, 179.9f, 0.0f, false, true, 195.41f, 143.0f)
                lineToRelative(-1.63f, -8.57f)
                verticalLineToRelative(0.0f)
                lineTo(178.32f, 53.07f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.72f, -9.55f)
                lineToRelative(-0.13f, 0.1f)
                lineTo(128.0f, 64.0f)
                lineTo(103.53f, 43.62f)
                lineToRelative(-0.13f, -0.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.72f, 9.53f)
                lineTo(62.23f, 134.38f)
                verticalLineToRelative(0.0f)
                lineTo(60.59f, 143.0f)
                arcToRelative(179.27f, 179.27f, 0.0f, false, true, -13.81f, -19.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 120.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, 80.0f)
                horizontalLineTo(216.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -80.0f)
                close()
                moveTo(76.68f, 144.0f)
                horizontalLineTo(179.31f)
                lineToRelative(2.54f, 13.35f)
                arcToRelative(113.28f, 113.28f, 0.0f, false, true, -27.35f, 19.0f)
                curveTo(139.1f, 183.77f, 128.06f, 184.0f, 128.0f, 184.0f)
                curveToRelative(-0.33f, 0.0f, -25.49f, -0.4f, -53.86f, -26.6f)
                close()
            }
        }
        .build()
        return `_cowboy-hat-fill`!!
    }

private var `_cowboy-hat-fill`: ImageVector? = null
