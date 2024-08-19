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

public val FillGroup.`Paper-plane-right-fill`: ImageVector
    get() {
        if (`_paper-plane-right-fill` != null) {
            return `_paper-plane-right-fill`!!
        }
        `_paper-plane-right-fill` = Builder(name = "Paper-plane-right-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 127.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -8.18f, 14.0f)
                lineTo(63.9f, 237.9f)
                arcTo(16.15f, 16.15f, 0.0f, false, true, 56.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.0f, -21.33f)
                lineToRelative(27.0f, -79.95f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 71.72f, 136.0f)
                horizontalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, -8.26f, -7.47f)
                horizontalLineToRelative(-72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, -2.72f)
                lineToRelative(-27.0f, -79.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 63.84f, 18.07f)
                lineToRelative(168.0f, 95.89f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 127.89f)
                close()
            }
        }
        .build()
        return `_paper-plane-right-fill`!!
    }

private var `_paper-plane-right-fill`: ImageVector? = null
