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

public val FillGroup.`Figma-logo-fill`: ImageVector
    get() {
        if (`_figma-logo-fill` != null) {
            return `_figma-logo-fill`!!
        }
        `_figma-logo-fill` = Builder(name = "Figma-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -24.0f, -72.0f)
                lineTo(96.0f, 24.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 72.0f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 1.37f, 65.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 144.0f, 196.0f)
                lineTo(144.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 48.0f, -64.0f)
                close()
                moveTo(128.0f, 152.0f)
                lineTo(96.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, -48.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(168.0f, 88.0f)
                lineTo(144.0f, 88.0f)
                lineTo(144.0f, 40.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_figma-logo-fill`!!
    }

private var `_figma-logo-fill`: ImageVector? = null
