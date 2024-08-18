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

public val RegularGroup.`Mouse-right-click`: ImageVector
    get() {
        if (`_mouse-right-click` != null) {
            return `_mouse-right-click`!!
        }
        `_mouse-right-click` = Builder(name = "Mouse-right-click", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(136.0f, 83.31f)
                lineTo(175.49f, 43.82f)
                arcTo(48.49f, 48.49f, 0.0f, false, true, 186.66f, 58.0f)
                lineToRelative(-46.0f, 46.0f)
                lineTo(136.0f, 104.0f)
                close()
                moveTo(191.78f, 75.53f)
                curveToRelative(0.14f, 1.47f, 0.22f, 3.0f, 0.22f, 4.47f)
                verticalLineToRelative(24.0f)
                lineTo(163.31f, 104.0f)
                close()
                moveTo(161.41f, 35.28f)
                lineTo(136.0f, 60.69f)
                lineTo(136.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                arcTo(47.73f, 47.73f, 0.0f, false, true, 161.41f, 35.28f)
                close()
                moveTo(112.0f, 32.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(72.0f)
                lineTo(64.0f, 104.0f)
                lineTo(64.0f, 80.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 112.0f, 32.0f)
                close()
                moveTo(144.0f, 224.0f)
                lineTo(112.0f, 224.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                lineTo(64.0f, 120.0f)
                lineTo(192.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 144.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_mouse-right-click`!!
    }

private var `_mouse-right-click`: ImageVector? = null
