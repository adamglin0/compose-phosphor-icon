package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`App-store-logo`: ImageVector
    get() {
        if (`_app-store-logo` != null) {
            return `_app-store-logo`!!
        }
        `_app-store-logo` = Builder(name = "App-store-logo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.34f, 196.07f)
                lineToRelative(-9.45f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.78f, -8.14f)
                lineToRelative(9.46f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.77f, 8.14f)
                close()
                moveTo(232.0f, 152.0f)
                lineTo(184.2f, 152.0f)
                lineToRelative(-30.73f, -52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.77f, 8.14f)
                lineToRelative(61.41f, 103.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.78f, -8.14f)
                lineTo(193.66f, 168.0f)
                lineTo(232.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(142.47f, 152.0f)
                lineTo(90.38f, 152.0f)
                lineTo(158.89f, 36.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.78f, -8.14f)
                lineTo(128.0f, 56.89f)
                lineToRelative(-17.11f, -29.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.78f, 8.14f)
                lineToRelative(21.6f, 36.55f)
                lineTo(71.8f, 152.0f)
                lineTo(24.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(142.47f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return `_app-store-logo`!!
    }

private var `_app-store-logo`: ImageVector? = null
