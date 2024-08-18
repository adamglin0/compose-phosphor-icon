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

public val FillGroup.`Mouse-fill`: ImageVector
    get() {
        if (`_mouse-fill` != null) {
            return `_mouse-fill`!!
        }
        `_mouse-fill` = Builder(name = "Mouse-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 16.0f)
                lineTo(112.0f, 16.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 48.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(208.0f, 80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 144.0f, 16.0f)
                close()
                moveTo(192.0f, 80.0f)
                verticalLineToRelative(24.0f)
                lineTo(136.0f, 104.0f)
                lineTo(136.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 192.0f, 80.0f)
                close()
                moveTo(112.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(72.0f)
                lineTo(64.0f, 104.0f)
                lineTo(64.0f, 80.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 112.0f, 32.0f)
                close()
            }
        }
        .build()
        return `_mouse-fill`!!
    }

private var `_mouse-fill`: ImageVector? = null
