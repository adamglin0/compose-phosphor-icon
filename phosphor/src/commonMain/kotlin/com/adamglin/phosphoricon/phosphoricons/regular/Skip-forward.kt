package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Skip-forward`: ImageVector
    get() {
        if (`_skip-forward` != null) {
            return `_skip-forward`!!
        }
        `_skip-forward` = Builder(name = "Skip-forward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(69.23f)
                lineTo(72.43f, 34.45f)
                arcTo(15.95f, 15.95f, 0.0f, false, false, 48.0f, 47.88f)
                verticalLineTo(208.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 24.43f, 13.43f)
                lineTo(192.0f, 146.77f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 32.0f)
                close()
                moveTo(64.0f, 207.93f)
                verticalLineTo(48.05f)
                lineToRelative(127.84f, 80.0f)
                close()
            }
        }
        .build()
        return `_skip-forward`!!
    }

private var `_skip-forward`: ImageVector? = null
