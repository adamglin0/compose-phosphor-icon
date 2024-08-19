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

public val FillGroup.`Football-helmet-fill`: ImageVector
    get() {
        if (`_football-helmet-fill` != null) {
            return `_football-helmet-fill`!!
        }
        `_football-helmet-fill` = Builder(name = "Football-helmet-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 160.0f)
                lineTo(165.8f, 160.0f)
                lineToRelative(-7.09f, -24.0f)
                lineTo(216.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineToRelative(-4.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 122.58f, 24.0f)
                curveTo(68.24f, 24.77f, 24.0f, 69.61f, 24.0f, 124.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 67.62f, 206.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.52f, 1.4f)
                lineTo(120.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.62f, -19.47f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, -0.15f, -0.54f)
                lineToRelative(-3.56f, -12.0f)
                horizontalLineToRelative(21.93f)
                lineToRelative(10.79f, 36.53f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 180.0f, 224.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 160.0f)
                close()
                moveTo(84.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 176.0f)
                close()
                moveTo(127.16f, 160.0f)
                lineTo(120.0f, 136.0f)
                horizontalLineToRelative(22.0f)
                lineToRelative(7.09f, 24.0f)
                close()
                moveTo(216.0f, 208.0f)
                lineTo(180.0f, 208.0f)
                lineToRelative(-9.46f, -32.0f)
                lineTo(216.0f, 176.0f)
                close()
            }
        }
        .build()
        return `_football-helmet-fill`!!
    }

private var `_football-helmet-fill`: ImageVector? = null
