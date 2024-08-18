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

public val RegularGroup.`Skip-back`: ImageVector
    get() {
        if (`_skip-back` != null) {
            return `_skip-back`!!
        }
        `_skip-back` = Builder(name = "Skip-back", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.81f, 34.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.24f, 0.43f)
                lineTo(64.0f, 109.23f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(146.77f)
                lineToRelative(119.57f, 74.78f)
                arcTo(15.95f, 15.95f, 0.0f, false, false, 208.0f, 208.12f)
                verticalLineTo(47.88f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 199.81f, 34.0f)
                close()
                moveTo(192.0f, 208.0f)
                lineTo(64.16f, 128.0f)
                lineTo(192.0f, 48.07f)
                close()
            }
        }
        .build()
        return `_skip-back`!!
    }

private var `_skip-back`: ImageVector? = null
