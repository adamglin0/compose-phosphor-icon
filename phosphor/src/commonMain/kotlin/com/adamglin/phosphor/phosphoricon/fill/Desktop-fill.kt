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

public val FillGroup.`Desktop-fill`: ImageVector
    get() {
        if (`_desktop-fill` != null) {
            return `_desktop-fill`!!
        }
        `_desktop-fill` = Builder(name = "Desktop-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 64.0f)
                lineTo(24.0f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(16.0f)
                lineTo(96.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 216.0f)
                lineTo(136.0f, 200.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(232.0f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(208.0f, 184.0f)
                lineTo(48.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 160.0f)
                lineTo(216.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_desktop-fill`!!
    }

private var `_desktop-fill`: ImageVector? = null
