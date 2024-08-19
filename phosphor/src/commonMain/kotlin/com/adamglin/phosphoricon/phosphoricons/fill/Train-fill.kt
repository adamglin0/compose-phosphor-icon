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

public val FillGroup.`Train-fill`: ImageVector
    get() {
        if (`_train-fill` != null) {
            return `_train-fill`!!
        }
        `_train-fill` = Builder(name = "Train-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 24.0f)
                lineTo(72.0f, 24.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 40.0f, 56.0f)
                lineTo(40.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                lineTo(65.6f, 235.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, 9.6f)
                lineTo(100.0f, 216.0f)
                horizontalLineToRelative(56.0f)
                lineToRelative(21.6f, 28.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, -9.6f)
                lineTo(176.0f, 216.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(216.0f, 56.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 184.0f, 24.0f)
                close()
                moveTo(84.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 184.0f)
                close()
                moveTo(120.0f, 120.0f)
                lineTo(56.0f, 120.0f)
                lineTo(56.0f, 80.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(172.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 184.0f)
                close()
                moveTo(200.0f, 120.0f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 80.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return `_train-fill`!!
    }

private var `_train-fill`: ImageVector? = null
