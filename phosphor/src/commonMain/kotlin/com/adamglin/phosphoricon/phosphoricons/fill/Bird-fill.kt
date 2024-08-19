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

public val FillGroup.`Bird-fill`: ImageVector
    get() {
        if (`_bird-fill` != null) {
            return `_bird-fill`!!
        }
        `_bird-fill` = Builder(name = "Bird-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.44f, 73.34f)
                lineTo(213.21f, 57.86f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 156.0f, 16.0f)
                horizontalLineToRelative(-0.29f)
                curveTo(122.79f, 16.16f, 96.0f, 43.47f, 96.0f, 76.89f)
                verticalLineTo(96.63f)
                lineTo(11.63f, 197.88f)
                lineToRelative(-0.1f, 0.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 224.0f)
                horizontalLineToRelative(88.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 216.0f, 120.0f)
                verticalLineTo(100.28f)
                lineToRelative(20.44f, -13.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.32f)
                close()
                moveTo(126.15f, 133.12f)
                lineToRelative(-60.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.29f, -10.24f)
                lineToRelative(60.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.29f, 10.24f)
                close()
                moveTo(164.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_bird-fill`!!
    }

private var `_bird-fill`: ImageVector? = null
