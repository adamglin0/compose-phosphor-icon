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

public val RegularGroup.`Code-block`: ImageVector
    get() {
        if (`_code-block` != null) {
            return `_code-block`!!
        }
        `_code-block` = Builder(name = "Code-block", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.34f, 101.66f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 69.66f, 37.66f)
                lineTo(43.31f, 64.0f)
                lineTo(69.66f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                close()
                moveTo(98.34f, 101.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                lineToRelative(-32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 98.34f, 37.66f)
                lineTo(124.69f, 64.0f)
                lineTo(98.34f, 90.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 98.34f, 101.66f)
                close()
                moveTo(200.0f, 40.0f)
                lineTo(176.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                lineTo(200.0f, 200.0f)
                lineTo(56.0f, 200.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 40.0f)
                close()
            }
        }
        .build()
        return `_code-block`!!
    }

private var `_code-block`: ImageVector? = null
