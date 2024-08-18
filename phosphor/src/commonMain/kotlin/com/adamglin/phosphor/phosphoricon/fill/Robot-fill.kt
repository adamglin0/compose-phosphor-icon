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

public val FillGroup.`Robot-fill`: ImageVector
    get() {
        if (`_robot-fill` != null) {
            return `_robot-fill`!!
        }
        `_robot-fill` = Builder(name = "Robot-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 48.0f)
                lineTo(136.0f, 48.0f)
                lineTo(136.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 48.0f)
                lineTo(56.0f, 48.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 24.0f, 80.0f)
                lineTo(24.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(232.0f, 80.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 200.0f, 48.0f)
                close()
                moveTo(172.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 96.0f)
                close()
                moveTo(96.0f, 184.0f)
                lineTo(80.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                lineTo(96.0f, 152.0f)
                close()
                moveTo(84.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 120.0f)
                close()
                moveTo(144.0f, 184.0f)
                lineTo(112.0f, 184.0f)
                lineTo(112.0f, 152.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(176.0f, 184.0f)
                lineTo(160.0f, 184.0f)
                lineTo(160.0f, 152.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return `_robot-fill`!!
    }

private var `_robot-fill`: ImageVector? = null
