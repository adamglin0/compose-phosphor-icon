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

public val FillGroup.`Magnet-fill`: ImageVector
    get() {
        if (`_magnet-fill` != null) {
            return `_magnet-fill`!!
        }
        `_magnet-fill` = Builder(name = "Magnet-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 50.25f)
                arcTo(87.46f, 87.46f, 0.0f, false, false, 144.6f, 24.0f)
                horizontalLineToRelative(-0.33f)
                arcTo(87.48f, 87.48f, 0.0f, false, false, 82.0f, 49.81f)
                lineTo(20.61f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.06f, 22.56f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 11.32f, 4.69f)
                horizontalLineToRelative(0.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.36f, -4.82f)
                lineTo(133.0f, 100.69f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, true, 22.41f, -0.21f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 4.73f, 11.19f)
                arcToRelative(16.89f, 16.89f, 0.0f, false, true, -4.85f, 12.0f)
                lineTo(93.0f, 183.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.17f, 22.79f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, false, 22.52f, 0.12f)
                lineTo(205.81f, 175.0f)
                curveTo(240.26f, 140.5f, 240.79f, 84.56f, 207.0f, 50.25f)
                close()
                moveTo(60.65f, 151.89f)
                lineTo(32.0f, 123.24f)
                lineTo(61.42f, 93.43f)
                lineTo(89.9f, 121.91f)
                close()
                moveTo(132.79f, 224.0f)
                lineToRelative(-28.68f, -28.65f)
                lineToRelative(30.13f, -29.13f)
                lineToRelative(28.49f, 28.48f)
                close()
            }
        }
        .build()
        return `_magnet-fill`!!
    }

private var `_magnet-fill`: ImageVector? = null
