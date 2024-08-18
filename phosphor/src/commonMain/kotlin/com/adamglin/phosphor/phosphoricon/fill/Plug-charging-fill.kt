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

public val FillGroup.`Plug-charging-fill`: ImageVector
    get() {
        if (`_plug-charging-fill` != null) {
            return `_plug-charging-fill`!!
        }
        `_plug-charging-fill` = Builder(name = "Plug-charging-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                lineTo(176.0f, 56.0f)
                lineTo(176.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(160.0f, 56.0f)
                lineTo(96.0f, 56.0f)
                lineTo(96.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                curveToRelative(-3.21f, 0.0f, -8.0f, 2.27f, -8.0f, 8.54f)
                lineTo(80.0f, 56.0f)
                lineTo(32.55f, 56.0f)
                curveTo(26.28f, 56.0f, 24.0f, 60.78f, 24.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(48.0f, 72.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 200.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                lineTo(208.0f, 72.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(151.49f, 130.81f)
                lineTo(139.49f, 162.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, -5.62f)
                lineToRelative(8.0f, -21.19f)
                lineTo(112.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.49f, -10.81f)
                lineToRelative(12.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, 5.62f)
                lineToRelative(-8.0f, 21.19f)
                lineTo(144.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.49f, 10.81f)
                close()
            }
        }
        .build()
        return `_plug-charging-fill`!!
    }

private var `_plug-charging-fill`: ImageVector? = null
