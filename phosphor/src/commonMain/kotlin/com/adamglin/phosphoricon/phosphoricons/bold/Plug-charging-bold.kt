package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Plug-charging-bold`: ImageVector
    get() {
        if (`_plug-charging-bold` != null) {
            return `_plug-charging-bold`!!
        }
        `_plug-charging-bold` = Builder(name = "Plug-charging-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                lineTo(180.0f, 48.0f)
                lineTo(180.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(156.0f, 48.0f)
                lineTo(100.0f, 48.0f)
                lineTo(100.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(76.0f, 48.0f)
                lineTo(32.55f, 48.0f)
                curveTo(24.4f, 48.0f, 20.0f, 54.18f, 20.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 72.0f)
                lineTo(44.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 208.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(212.0f, 72.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(188.0f, 164.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(88.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(68.0f, 72.0f)
                lineTo(188.0f, 72.0f)
                close()
                moveTo(102.14f, 134.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.38f, -11.0f)
                lineToRelative(12.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.48f, 8.42f)
                lineTo(129.32f, 116.0f)
                lineTo(144.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.24f, 16.21f)
                lineToRelative(-12.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.48f, -8.42f)
                lineTo(126.68f, 140.0f)
                lineTo(112.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 102.14f, 134.83f)
                close()
            }
        }
        .build()
        return `_plug-charging-bold`!!
    }

private var `_plug-charging-bold`: ImageVector? = null
