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

public val FillGroup.`Lock-key-open-fill`: ImageVector
    get() {
        if (`_lock-key-open-fill` != null) {
            return `_lock-key-open-fill`!!
        }
        `_lock-key-open-fill` = Builder(name = "Lock-key-open-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 80.0f)
                lineTo(96.0f, 80.0f)
                lineTo(96.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                curveToRelative(15.37f, 0.0f, 29.2f, 11.0f, 32.16f, 25.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.68f, -3.18f)
                curveTo(171.32f, 24.15f, 151.2f, 8.0f, 128.0f, 8.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 80.0f, 56.0f)
                lineTo(80.0f, 80.0f)
                lineTo(48.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 96.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 80.0f)
                close()
                moveTo(136.0f, 158.63f)
                lineTo(136.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 158.63f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_lock-key-open-fill`!!
    }

private var `_lock-key-open-fill`: ImageVector? = null
