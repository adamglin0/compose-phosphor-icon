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

public val FillGroup.`Watch-fill`: ImageVector
    get() {
        if (`_watch-fill` != null) {
            return `_watch-fill`!!
        }
        `_watch-fill` = Builder(name = "Watch-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.3f, 63.53f)
                lineToRelative(-6.24f, -34.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 153.32f, 16.0f)
                lineTo(102.68f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 86.94f, 29.15f)
                lineTo(80.7f, 63.53f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, false, 0.0f, 128.94f)
                lineToRelative(6.24f, 34.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 102.68f, 240.0f)
                horizontalLineToRelative(50.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.74f, -13.15f)
                lineToRelative(6.24f, -34.38f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, false, 0.0f, -128.94f)
                close()
                moveTo(102.68f, 32.0f)
                horizontalLineToRelative(50.64f)
                lineToRelative(3.91f, 21.55f)
                arcToRelative(79.75f, 79.75f, 0.0f, false, false, -58.46f, 0.0f)
                close()
                moveTo(153.32f, 224.0f)
                lineTo(102.68f, 224.0f)
                lineToRelative(-3.91f, -21.55f)
                arcToRelative(79.75f, 79.75f, 0.0f, false, false, 58.46f, 0.0f)
                close()
                moveTo(168.0f, 136.0f)
                lineTo(128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(120.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_watch-fill`!!
    }

private var `_watch-fill`: ImageVector? = null
