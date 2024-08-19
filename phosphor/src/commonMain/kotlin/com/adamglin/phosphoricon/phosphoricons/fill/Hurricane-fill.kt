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

public val FillGroup.`Hurricane-fill`: ImageVector
    get() {
        if (`_hurricane-fill` != null) {
            return `_hurricane-fill`!!
        }
        `_hurricane-fill` = Builder(name = "Hurricane-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.32f, 45.36f)
                lineToRelative(9.41f, -35.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 158.32f, 0.18f)
                arcTo(195.87f, 195.87f, 0.0f, false, false, 99.67f, 25.27f)
                curveTo(60.63f, 50.37f, 40.0f, 85.89f, 40.0f, 128.0f)
                arcToRelative(88.11f, 88.11f, 0.0f, false, false, 57.68f, 82.64f)
                lineToRelative(-9.41f, 35.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.41f, 9.88f)
                arcToRelative(195.87f, 195.87f, 0.0f, false, false, 58.65f, -25.09f)
                curveTo(195.37f, 205.63f, 216.0f, 170.11f, 216.0f, 128.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 158.32f, 45.36f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_hurricane-fill`!!
    }

private var `_hurricane-fill`: ImageVector? = null
