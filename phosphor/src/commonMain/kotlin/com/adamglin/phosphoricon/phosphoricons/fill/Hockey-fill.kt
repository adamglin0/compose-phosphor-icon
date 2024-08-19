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

public val FillGroup.`Hockey-fill`: ImageVector
    get() {
        if (`_hockey-fill` != null) {
            return `_hockey-fill`!!
        }
        `_hockey-fill` = Builder(name = "Hockey-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.9f, 122.82f)
                lineToRelative(68.0f, -80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.2f, 10.36f)
                lineToRelative(-68.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.2f, -10.36f)
                close()
                moveTo(240.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(171.7f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.19f, -5.64f)
                lineTo(25.9f, 53.18f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 38.1f, 42.82f)
                lineTo(130.9f, 152.0f)
                lineTo(224.0f, 152.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 168.0f)
                close()
                moveTo(224.0f, 168.0f)
                lineTo(208.0f, 168.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(115.3f, 183.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.18f)
                lineTo(96.49f, 210.36f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 84.3f, 216.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(87.05f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, 1.41f)
                close()
                moveTo(48.0f, 168.0f)
                lineTo(32.0f, 168.0f)
                verticalLineToRelative(32.0f)
                lineTo(48.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_hockey-fill`!!
    }

private var `_hockey-fill`: ImageVector? = null
